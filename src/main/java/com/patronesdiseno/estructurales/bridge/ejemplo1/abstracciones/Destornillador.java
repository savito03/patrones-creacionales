package com.patronesdiseno.estructurales.bridge.ejemplo1.abstracciones;

import com.patronesdiseno.estructurales.bridge.ejemplo1.implementaciones.IImplementacion;

public class Destornillador extends Herramienta {
    public Destornillador(IImplementacion implementacion) {
        super(implementacion);
    }

    @Override
    public void operar() {
        System.out.print("Destornillador en uso. ");
        implementacion.usar();
    }
}
