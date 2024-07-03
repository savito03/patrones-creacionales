package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosconcretos;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IVehiculo;

public class Coche implements IVehiculo {

    @Override
    public void mostrarTipo() {
        System.out.println("Soy un coche");
    }
}
