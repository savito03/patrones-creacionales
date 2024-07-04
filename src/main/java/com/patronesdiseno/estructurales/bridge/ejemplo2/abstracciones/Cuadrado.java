package com.patronesdiseno.estructurales.bridge.ejemplo2.abstracciones;

import com.patronesdiseno.estructurales.bridge.ejemplo2.implementaciones.IColor;

public class Cuadrado extends Forma {

    public Cuadrado(IColor color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.print("Dibujando un cuadrado. ");
        color.aplicarColor();
    }
}
