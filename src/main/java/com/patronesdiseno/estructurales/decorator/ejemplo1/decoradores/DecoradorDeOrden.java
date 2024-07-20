package com.patronesdiseno.estructurales.decorator.ejemplo1.decoradores;

import com.patronesdiseno.estructurales.decorator.ejemplo1.productobase.Orden;

public abstract class DecoradorDeOrden implements Orden {
    protected Orden ordenDecorada;

    public DecoradorDeOrden(Orden ordenDecorada) {
        this.ordenDecorada = ordenDecorada;
    }

    @Override
    public String getDescripcion() {
        return ordenDecorada.getDescripcion();
    }

    @Override
    public double getCosto() {
        return ordenDecorada.getCosto();
    }
}