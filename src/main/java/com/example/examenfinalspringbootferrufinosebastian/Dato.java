package com.example.examenfinalspringbootferrufinosebastian;

import com.example.examenfinalspringbootferrufinosebastian.models.Cliente;
import com.example.examenfinalspringbootferrufinosebastian.models.Pedido;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Dato {
    public static Optional<Cliente> crearCliente01(){
        return Optional.of(new Cliente(1L, "Sebastian" ));
    }
    public static Optional<Pedido> crearPedido01(){

        return Optional.of(new Pedido(1L,"Pedido01", new BigDecimal(3000)));
    }
    public final static List<String> PRODUCTOS = Arrays.asList(
            "Producto 1",
            "Producto 2",
            "Producto 3"
    );
}
