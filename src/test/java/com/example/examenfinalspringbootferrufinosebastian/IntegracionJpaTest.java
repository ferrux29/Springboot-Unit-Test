package com.example.examenfinalspringbootferrufinosebastian;

import com.example.examenfinalspringbootferrufinosebastian.models.Cliente;
import com.example.examenfinalspringbootferrufinosebastian.models.Pedido;
import com.example.examenfinalspringbootferrufinosebastian.repositories.IClienteRepository;
import com.example.examenfinalspringbootferrufinosebastian.repositories.IPedidoRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.util.Optional;

@DataJpaTest
public class IntegracionJpaTest {
    @Autowired
    IClienteRepository iClienteRepository;
    @Autowired
    IPedidoRepository iPedidoRepository;

    @Test
    void testFindById() {
        Optional<Cliente> cliente = iClienteRepository.findById(1L);
        assertTrue(cliente.isPresent());
        assertEquals("Sebastian", cliente.orElseThrow().getNombre());
    }
    @Test
    void testFindPedidoById(){
        Optional<Pedido> pedido = iPedidoRepository.findById(1L);
        assertTrue(pedido.isPresent());
        assertEquals("Pedido01", pedido.orElseThrow().getCodPedido());
    }
    @Test
    void testFindPedidoByCod() {
        Optional<Pedido> pedido = iPedidoRepository.findByNombre("Pedido01");
        assertTrue(pedido.isPresent());
        assertEquals("Pedido01", pedido.orElseThrow().getCodPedido());
        assertEquals("3000.00", pedido.orElseThrow().getCantProductos().toPlainString());
    }
    @Test
    void testSaveCliente() {
        Cliente clientePedro = new Cliente(null, "Pedro");
        iClienteRepository.save(clientePedro);
        Cliente cliente = iClienteRepository.findByNombre("Pedro").orElseThrow();
        assertEquals("Pedro", cliente.getNombre());
        assertEquals(3, cliente.getId());
    }
    @Test
    void testSavePedido() {
        Pedido pedido03 = new Pedido(null, "Pedido03", new BigDecimal("4000"));
        iPedidoRepository.save(pedido03);
        Pedido pedido = iPedidoRepository.findByNombre("Pedido03").orElseThrow();
        assertEquals("Pedido03", pedido.getCodPedido());
        assertEquals("4000", pedido.getCantProductos().toPlainString());
        assertEquals(3, pedido.getId());
    }
    @Test
    void testUpdate() {
        Pedido pedido03 = new Pedido(null, "Pedido03", new BigDecimal("2500"));
        iPedidoRepository.save(pedido03);
        Pedido pedido = iPedidoRepository.findByNombre("Pedido03").orElseThrow();
        assertEquals("Pedido03", pedido.getCodPedido());
        assertEquals("2500", pedido.getCantProductos().toPlainString());
        pedido.setCantProductos(new BigDecimal("3500"));
        Pedido pedido03Update = iPedidoRepository.save(pedido);
        assertEquals("3500", pedido03Update.getCantProductos().toPlainString());
    }
    @Test
    void testDeletePedido() {
        Pedido pedido = iPedidoRepository.findById(2L).orElseThrow();
        assertEquals("Pedido02", pedido.getCodPedido());
        iPedidoRepository.delete(pedido);
        assertEquals(1, iPedidoRepository.findAll().size());
    }
    @Test
    void testDeleteCliente() {
        Cliente cliente = iClienteRepository.findById(2L).orElseThrow();
        assertEquals("Ferrufino", cliente.getNombre());
        iClienteRepository.delete(cliente);
        assertEquals(1, iClienteRepository.findAll().size());
    }
}
