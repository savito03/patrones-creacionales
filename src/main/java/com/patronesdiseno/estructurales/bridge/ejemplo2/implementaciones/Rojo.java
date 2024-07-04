package com.patronesdiseno.estructurales.bridge.ejemplo2.implementaciones;

import com.patronesdiseno.estructurales.bridge.ejemplo1.implementaciones.IImplementacion;

public class Rojo implements IColor {

    @Override
    public void aplicarColor() {
        System.out.println("Aplicando color rojo");
    }
}
