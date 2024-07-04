package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productosconcretos;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.ITitulo;

public class TituloModoOscuro implements ITitulo {
    @Override
    public void mostrarTipo() {
        System.out.println("Soy un título modo oscuro");
    }
}
