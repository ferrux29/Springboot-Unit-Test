package com.example.examenfinalspringbootferrufinosebastian.controllers;


import com.example.examenfinalspringbootferrufinosebastian.models.Cliente;
import com.example.examenfinalspringbootferrufinosebastian.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private IClienteService iClienteService;
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente clienteDetalle(@PathVariable Long id){
        return iClienteService.findByIdCliente(id);
    }

}
