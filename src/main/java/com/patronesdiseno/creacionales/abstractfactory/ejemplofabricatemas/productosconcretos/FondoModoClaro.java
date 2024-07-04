package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productosconcretos;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.IFondo;

public class FondoModoClaro implements IFondo {
    @Override
    public void mostrarTipo() {
        System.out.println("Soy un fondo modo claro");
    }
}
