package com.patronesdiseno.estructurales.adapter.ejemplo2.sistermarepartoantiguo;

public class NuevoSistemaPedidos implements IPedido {
    @Override
    public void procesarPedido(IPedido pedido) {
        pedido.procesarPedido(pedido);
    }

}
