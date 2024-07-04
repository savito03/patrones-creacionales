package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productosconcretos;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.ITitulo;

public class TituloModoClaro implements ITitulo {
    @Override
    public void mostrarTipo() {
        System.out.println("Soy un título modo claro");
    }
}
