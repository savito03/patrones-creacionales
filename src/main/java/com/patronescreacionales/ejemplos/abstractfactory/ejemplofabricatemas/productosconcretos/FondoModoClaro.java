package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productosconcretos;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productoabstracto.IFondo;

public class FondoModoClaro implements IFondo {
    @Override
    public void mostrarTipo() {
        System.out.println("Soy un fondo modo claro");
    }
}
