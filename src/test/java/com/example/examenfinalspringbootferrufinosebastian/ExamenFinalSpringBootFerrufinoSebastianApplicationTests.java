package com.example.examenfinalspringbootferrufinosebastian;

import static com.example.examenfinalspringbootferrufinosebastian.Dato.*;

import com.example.examenfinalspringbootferrufinosebastian.models.Cliente;
import com.example.examenfinalspringbootferrufinosebastian.models.Pedido;
import com.example.examenfinalspringbootferrufinosebastian.repositories.IClienteRepository;
import com.example.examenfinalspringbootferrufinosebastian.repositories.IPedidoRepository;
import com.example.examenfinalspringbootferrufinosebastian.servicesimpl.ClienteServiceImplement;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class ExamenFinalSpringBootFerrufinoSebastianApplicationTests {
    @MockBean
    IClienteRepository iClienteRepository;
    @MockBean
    IPedidoRepository iPedidoRepository;
    @Autowired
    ClienteServiceImplement iClienteService;
    @Test
    void contextLoads() {
        when(iClienteRepository.findById(1L)).thenReturn(crearCliente01());
        when(iPedidoRepository.findById(1L)).thenReturn(crearPedido01());
        Cliente cliente = iClienteService.findByIdCliente(1L);
        assertEquals("Sebastian",cliente.getNombre().toString());
    }

}
