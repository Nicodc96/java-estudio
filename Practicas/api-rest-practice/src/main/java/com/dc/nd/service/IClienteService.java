package com.dc.nd.service;

import com.dc.nd.model.dto.ClienteDTO;
import com.dc.nd.model.entity.Cliente;

public interface IClienteService {
    Cliente save(ClienteDTO c);
    Cliente findById(Integer id);
    void delete(Cliente c);
    boolean existsById(Integer id);
}
