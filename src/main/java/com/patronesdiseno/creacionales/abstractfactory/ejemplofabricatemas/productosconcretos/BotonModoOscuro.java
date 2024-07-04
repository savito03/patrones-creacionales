package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productosconcretos;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.IBoton;

public class BotonModoOscuro implements IBoton {
    @Override
    public void mostrarTipo() {
        System.out.println("Soy un botón modo oscuro");
    }
}
