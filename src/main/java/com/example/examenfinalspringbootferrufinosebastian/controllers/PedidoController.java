package com.example.examenfinalspringbootferrufinosebastian.controllers;

import com.example.examenfinalspringbootferrufinosebastian.models.Cliente;
import com.example.examenfinalspringbootferrufinosebastian.models.Pedido;
import com.example.examenfinalspringbootferrufinosebastian.services.IClienteService;
import com.example.examenfinalspringbootferrufinosebastian.services.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public class PedidoController {
    @RestController
    @RequestMapping("/api/pedidos")
    public class ClienteController {
        @Autowired
        private IPedidoService iPedidoService;

        @GetMapping("/{id}")
        @ResponseStatus(HttpStatus.OK)
        public Pedido clienteDetalle(@PathVariable Long id) {
            return iPedidoService.findByIdPedido(id);
        }
    }
}
