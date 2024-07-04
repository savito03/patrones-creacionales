package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosconcretos;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosabstractos.IVehiculo;

public class Coche implements IVehiculo {

    @Override
    public void mostrarTipo() {
        System.out.println("Soy un coche");
    }
}
