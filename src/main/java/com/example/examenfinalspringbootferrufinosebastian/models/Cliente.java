package com.example.examenfinalspringbootferrufinosebastian.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "Clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

}
