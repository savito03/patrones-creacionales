package com.patronesdiseno.estructurales.bridge.ejemplo2.abstracciones;

import com.patronesdiseno.estructurales.bridge.ejemplo2.implementaciones.IColor;

public abstract class Forma {
    protected IColor color;

    public Forma(IColor color) {
        this.color = color;
    }

    public abstract void dibujar();
}
