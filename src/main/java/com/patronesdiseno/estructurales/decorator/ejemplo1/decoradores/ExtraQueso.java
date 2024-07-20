package com.patronesdiseno.estructurales.decorator.ejemplo1.decoradores;

import com.patronesdiseno.estructurales.decorator.ejemplo1.productobase.Orden;

public class ExtraQueso extends DecoradorDeOrden {
    public ExtraQueso(Orden ordenDecorada) {
        super(ordenDecorada);
    }

    @Override
    public String getDescripcion() {
        return ordenDecorada.getDescripcion() + ", Extra Queso";
    }

    @Override
    public double getCosto() {
        return ordenDecorada.getCosto() + 1.50;
    }
}