package com.patronesdiseno.creacionales.factorymethod.ejemplofabricavehiculos.productosconcretos;

import com.patronesdiseno.creacionales.factorymethod.ejemplofabricavehiculos.interfaceproducto.IVehiculo;

public class Camioneta implements IVehiculo {
    @Override
    public void soyUnVehiculo() {
        System.out.println("Soy un vehículo del tipo camioneta.");
    }

    @Override
    public void probarVehiculo() {
        System.out.println("Probar camioneta en la montaña.");
    }

    @Override
    public void enviarAConcesionario() {
        System.out.println("La camioneta se ha enviado al concesionario.");
    }
}
