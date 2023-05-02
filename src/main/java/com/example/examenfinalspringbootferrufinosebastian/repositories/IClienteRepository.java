package com.example.examenfinalspringbootferrufinosebastian.repositories;

import com.example.examenfinalspringbootferrufinosebastian.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {
    @Query("SELECT c from Cliente c where c.nombre=?1")
    Optional<Cliente> findByNombre(String nombre);
}
