package com.example.examenfinalspringbootferrufinosebastian.repositories;

import com.example.examenfinalspringbootferrufinosebastian.models.Cliente;
import com.example.examenfinalspringbootferrufinosebastian.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IPedidoRepository extends JpaRepository<Pedido, Long> {
    @Query("SELECT p from Pedido p where p.codPedido=?1")
    Optional<Pedido> findByNombre(String nombre);
}
