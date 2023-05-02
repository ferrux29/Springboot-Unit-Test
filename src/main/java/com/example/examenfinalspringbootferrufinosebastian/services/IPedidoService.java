package com.example.examenfinalspringbootferrufinosebastian.services;

import com.example.examenfinalspringbootferrufinosebastian.models.Pedido;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPedidoService {
    Pedido findByIdPedido(Long id);
}
