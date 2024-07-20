package com.patronesdiseno.estructurales.decorator.ejemplo1.decoradores;

import com.patronesdiseno.estructurales.decorator.ejemplo1.productobase.Orden;

public class DobleCarne extends DecoradorDeOrden {
    public DobleCarne(Orden ordenDecorada) {
        super(ordenDecorada);
    }

    @Override
    public String getDescripcion() {
        return ordenDecorada.getDescripcion() + ", Doble Carne";
    }

    @Override
    public double getCosto() {
        return ordenDecorada.getCosto() + 2.50;
    }
}