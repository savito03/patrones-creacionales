package com.patronesdiseno.creacionales.factorymethod.ejemplofabricavehiculos.productosconcretos;

import com.patronesdiseno.creacionales.factorymethod.ejemplofabricavehiculos.interfaceproducto.IVehiculo;

public class Coche implements IVehiculo {
    @Override
    public void soyUnVehiculo() {
        System.out.println("Soy un vehículo del tipo coche.");
    }

    @Override
    public void probarVehiculo() {
        System.out.println("Probar coche en la ciudad.");
    }

    @Override
    public void enviarAConcesionario() {
        System.out.println("El coche se ha enviado al concesionario.");
    }
}
