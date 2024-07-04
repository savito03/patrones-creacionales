package com.patronesdiseno.estructurales.bridge.ejemplo1.abstracciones;

import com.patronesdiseno.estructurales.bridge.ejemplo1.implementaciones.IImplementacion;

public abstract class Herramienta {
    protected IImplementacion implementacion;

    public Herramienta(IImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    public abstract void operar();
}
