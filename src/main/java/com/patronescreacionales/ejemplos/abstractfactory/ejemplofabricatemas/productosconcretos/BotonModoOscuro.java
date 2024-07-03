package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productosconcretos;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productoabstracto.IBoton;

public class BotonModoOscuro implements IBoton {
    @Override
    public void mostrarTipo() {
        System.out.println("Soy un botón modo oscuro");
    }
}
