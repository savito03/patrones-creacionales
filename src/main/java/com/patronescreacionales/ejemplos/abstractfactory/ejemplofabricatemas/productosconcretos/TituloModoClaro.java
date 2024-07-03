package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productosconcretos;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productoabstracto.ITitulo;

public class TituloModoClaro implements ITitulo {
    @Override
    public void mostrarTipo() {
        System.out.println("Soy un título modo claro");
    }
}
