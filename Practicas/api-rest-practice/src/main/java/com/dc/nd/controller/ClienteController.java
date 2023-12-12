package com.dc.nd.controller;

import com.dc.nd.model.dto.ClienteDTO;
import com.dc.nd.model.entity.Cliente;
import com.dc.nd.model.payload.MensajeResponse;
import com.dc.nd.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @PostMapping("cliente")
    public ResponseEntity<?> create(@RequestBody ClienteDTO cDto){
        Cliente clienteSave = null;
        try{
           clienteSave = clienteService.save(cDto);
           cDto = ClienteDTO.builder()
                    .idCliente(clienteSave.getIdCliente())
                    .nombre(clienteSave.getNombre())
                    .apellido(clienteSave.getApellido())
                    .email(clienteSave.getEmail())
                    .fechaRegistro(clienteSave.getFechaRegistro())
                    .build();

           return new ResponseEntity<>(MensajeResponse.builder()
                   .mensaje("Cliente creado correctamente.")
                   .objeto(cDto)
                   .build(), HttpStatus.CREATED);
        }catch (DataAccessException dae){
            return new ResponseEntity<>(MensajeResponse.builder()
                    .mensaje(dae.getMessage())
                    .objeto(null).build(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("cliente/{id}")
    public ResponseEntity<?> update(@RequestBody ClienteDTO cDto, @PathVariable Integer id){
        Cliente clienteUpdate = null;
        try{
            if (clienteService.existsById(id)){
                cDto.setIdCliente(id);
                clienteUpdate = clienteService.save(cDto);
                cDto = ClienteDTO.builder()
                        .idCliente(clienteUpdate.getIdCliente())
                        .nombre(clienteUpdate.getNombre())
                        .apellido(clienteUpdate.getApellido())
                        .email(clienteUpdate.getEmail())
                        .fechaRegistro(clienteUpdate.getFechaRegistro())
                        .build();

                return new ResponseEntity<>(MensajeResponse.builder()
                        .mensaje("Cliente modificado correctamente.")
                        .objeto(cDto)
                        .build(), HttpStatus.CREATED);
            } else{
                return new ResponseEntity<>(MensajeResponse.builder()
                        .mensaje("Registro a actualizar no encontrado.")
                        .objeto(null).build()
                        , HttpStatus.NOT_FOUND);
            }
        }catch (DataAccessException dae){
            return new ResponseEntity<>(MensajeResponse.builder()
                    .mensaje(dae.getMessage())
                    .objeto(null).build(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("cliente/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> delete(@PathVariable Integer id){
        try{
            Cliente clienteDelete = clienteService.findById(id);
            clienteService.delete(clienteDelete);
            return new ResponseEntity<>(MensajeResponse.builder()
                    .mensaje("Registro eliminado correctamente.")
                    .objeto(clienteDelete), HttpStatus.NO_CONTENT);
        }catch (DataAccessException dae){
            return new ResponseEntity<>(MensajeResponse.builder()
                                        .mensaje(dae.getMessage())
                                        .objeto(null).build()
                    , HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("cliente/{id}")
    public ResponseEntity<?> showById(@PathVariable Integer id){
        Cliente cliente = clienteService.findById(id);

        if (cliente == null){
            return new ResponseEntity<>(MensajeResponse.builder()
                    .mensaje("Registro no encontrado.")
                    .objeto(null).build()
                    , HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(MensajeResponse.builder()
                        .mensaje("Consulta exitosa para ID: " + cliente.getIdCliente())
                        .objeto(ClienteDTO.builder()
                        .idCliente(cliente.getIdCliente())
                        .nombre(cliente.getNombre())
                        .apellido(cliente.getApellido())
                        .email(cliente.getEmail())
                        .fechaRegistro(cliente.getFechaRegistro())
                        .build()).build()
                , HttpStatus.OK);
    }
}
