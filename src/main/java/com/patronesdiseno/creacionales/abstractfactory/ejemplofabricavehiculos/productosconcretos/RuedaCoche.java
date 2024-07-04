package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosconcretos;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosabstractos.IRueda;

public class RuedaCoche implements IRueda {

    @Override
    public void mostrarTipo() {
        System.out.println("Soy una rueda de coche");
    }
}
