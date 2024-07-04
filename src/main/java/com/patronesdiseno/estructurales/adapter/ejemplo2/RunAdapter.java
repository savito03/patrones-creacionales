package com.patronesdiseno.estructurales.adapter.ejemplo2;

import com.patronesdiseno.estructurales.adapter.ejemplo2.adaptadores.AdaptadorPedido;
import com.patronesdiseno.estructurales.adapter.ejemplo2.sistemarepartonuevo.PedidoAntiguo;
import com.patronesdiseno.estructurales.adapter.ejemplo2.sistermarepartoantiguo.IPedido;
import com.patronesdiseno.estructurales.adapter.ejemplo2.sistermarepartoantiguo.NuevoSistemaPedidos;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RunAdapter {

    public static void main(String[] args) {

        // Sistema antiguo
        PedidoAntiguo pedidoAntiguo = new PedidoAntiguo();

        // Adaptador que permite que el sistema antiguo se utilice con el nuevo sistema
        IPedido pedidoAdaptado = new AdaptadorPedido(pedidoAntiguo);

        // Sistema nuevo
        IPedido nuevoSistema = new NuevoSistemaPedidos();

        // Procesando el pedido utilizando el nuevo sistema
        nuevoSistema.procesarPedido(pedidoAdaptado);
    }



}
