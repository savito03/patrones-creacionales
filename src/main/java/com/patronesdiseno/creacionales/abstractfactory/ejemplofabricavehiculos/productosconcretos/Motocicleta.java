package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosconcretos;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosabstractos.IVehiculo;

public class Motocicleta implements IVehiculo {

    @Override
    public void mostrarTipo() {
        System.out.println("Soy una moto");
    }
}
