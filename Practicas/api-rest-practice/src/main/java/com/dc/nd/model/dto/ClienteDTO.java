package com.dc.nd.model.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@Builder
public class ClienteDTO implements Serializable {

    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private Date fechaRegistro;
}