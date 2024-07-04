package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productosconcretos;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.IBoton;

public class BotonModoClaro implements IBoton {

    @Override
    public void mostrarTipo() {
        System.out.println("Soy un botón modo claro");
    }
}
