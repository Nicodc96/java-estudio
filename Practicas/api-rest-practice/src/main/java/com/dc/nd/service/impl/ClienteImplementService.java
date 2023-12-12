package com.dc.nd.service.impl;

import com.dc.nd.model.dao.ClienteDao;
import com.dc.nd.model.dto.ClienteDTO;
import com.dc.nd.model.entity.Cliente;
import com.dc.nd.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteImplementService implements IClienteService {
    @Autowired
    private ClienteDao clienteDao;

    @Transactional
    @Override
    public Cliente save(ClienteDTO cDto) {
        Cliente cliente = Cliente.builder()
                .idCliente(cDto.getIdCliente())
                .nombre(cDto.getNombre())
                .apellido(cDto.getApellido())
                .email(cDto.getEmail())
                .fechaRegistro(cDto.getFechaRegistro())
                .build();
        return clienteDao.save(cliente);
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Cliente c) {
        clienteDao.delete(c);
    }

    @Override
    public boolean existsById(Integer id){
        return clienteDao.existsById(id);
    }
}
