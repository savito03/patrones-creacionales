package com.patronesdiseno.estructurales.bridge.ejemplo1.abstracciones;

import com.patronesdiseno.estructurales.bridge.ejemplo1.implementaciones.IImplementacion;

public class Martillo extends Herramienta {
    public Martillo(IImplementacion implementacion) {
        super(implementacion);
    }

    @Override
    public void operar() {
        System.out.print("Martillo en uso. ");
        implementacion.usar();
    }
}
