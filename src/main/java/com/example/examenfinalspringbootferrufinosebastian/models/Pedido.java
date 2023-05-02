package com.example.examenfinalspringbootferrufinosebastian.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
@EqualsAndHashCode
@Table(name = "Pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "codigo_pedido")
    private String codPedido;
    @Column(name = "cantidad_productos")
    private BigDecimal CantProductos;
}
