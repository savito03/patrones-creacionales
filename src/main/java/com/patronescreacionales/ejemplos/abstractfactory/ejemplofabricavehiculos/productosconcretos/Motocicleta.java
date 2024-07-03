package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosconcretos;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IVehiculo;

public class Motocicleta implements IVehiculo {

    @Override
    public void mostrarTipo() {
        System.out.println("Soy una moto");
    }
}
