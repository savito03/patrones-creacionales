package com.patronescreacionales.ejemplos.factorymethod.ejemplofabricavehiculos.creador;

import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricavehiculos.interfaceproducto.IVehiculo;

public abstract class CreadorVehiculo {

    public abstract IVehiculo obtenerVehiculo();

    public void retonarTipoVehiculo(){
        IVehiculo iVehiculo = obtenerVehiculo();
        iVehiculo.soyUnVehiculo();
    }
}
