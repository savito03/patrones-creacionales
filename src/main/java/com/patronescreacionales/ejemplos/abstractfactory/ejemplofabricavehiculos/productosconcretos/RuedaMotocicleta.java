package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosconcretos;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IRueda;

public class RuedaMotocicleta implements IRueda {

    @Override
    public void mostrarTipo() {
        System.out.println("Soy una rueda de moto");
    }
}
