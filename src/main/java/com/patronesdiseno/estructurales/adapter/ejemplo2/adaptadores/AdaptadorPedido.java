package com.patronesdiseno.estructurales.adapter.ejemplo2.adaptadores;

import com.patronesdiseno.estructurales.adapter.ejemplo2.sistemarepartonuevo.PedidoAntiguo;
import com.patronesdiseno.estructurales.adapter.ejemplo2.sistermarepartoantiguo.IPedido;

public class AdaptadorPedido implements IPedido {
    private PedidoAntiguo pedidoAntiguo;

    public AdaptadorPedido(PedidoAntiguo pedidoAntiguo) {
        this.pedidoAntiguo = pedidoAntiguo;
    }

    @Override
    public void procesarPedido(IPedido pedido) {
        // Suponemos que el adaptador convierte la nueva llamada a la forma antigua de procesar el pedido.
        pedidoAntiguo.procesarPedidoAntiguo("productos adaptados");
    }
}
