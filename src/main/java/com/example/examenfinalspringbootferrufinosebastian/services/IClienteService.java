package com.example.examenfinalspringbootferrufinosebastian.services;

import com.example.examenfinalspringbootferrufinosebastian.models.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface IClienteService {
    Cliente findByIdCliente(Long id);
}
