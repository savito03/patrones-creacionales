package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productosconcretos;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productoabstracto.ITitulo;

public class TituloModoOscuro implements ITitulo {
    @Override
    public void mostrarTipo() {
        System.out.println("Soy un título modo oscuro");
    }
}
