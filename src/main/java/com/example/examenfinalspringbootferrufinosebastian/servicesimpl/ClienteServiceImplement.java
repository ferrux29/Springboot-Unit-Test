package com.example.examenfinalspringbootferrufinosebastian.servicesimpl;

import com.example.examenfinalspringbootferrufinosebastian.models.Cliente;
import com.example.examenfinalspringbootferrufinosebastian.models.Pedido;
import com.example.examenfinalspringbootferrufinosebastian.repositories.IClienteRepository;
import com.example.examenfinalspringbootferrufinosebastian.repositories.IPedidoRepository;
import com.example.examenfinalspringbootferrufinosebastian.services.IClienteService;
import com.example.examenfinalspringbootferrufinosebastian.services.IPedidoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImplement implements IClienteService, IPedidoService {
    private IClienteRepository iClienteRepository;
    private IPedidoRepository iPedidoRepository;
    public ClienteServiceImplement(IClienteRepository iClienteRepository, IPedidoRepository iPedidoRepository){
        this.iClienteRepository = iClienteRepository;
        this.iPedidoRepository = iPedidoRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findByIdCliente(Long id) {
        return iClienteRepository.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public Pedido findByIdPedido(Long id) {
        return iPedidoRepository.findById(id).orElseThrow();
    }

}
