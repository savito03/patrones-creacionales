package com.patronesdiseno.estructurales.bridge.ejemplo2.abstracciones;

import com.patronesdiseno.estructurales.bridge.ejemplo2.implementaciones.IColor;

public class Circulo extends Forma {

    public Circulo(IColor color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.print("Dibujando un círculo. ");
        color.aplicarColor();
    }
}
