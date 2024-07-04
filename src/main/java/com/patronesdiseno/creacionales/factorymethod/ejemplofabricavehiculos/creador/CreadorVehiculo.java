package com.patronesdiseno.creacionales.factorymethod.ejemplofabricavehiculos.creador;

import com.patronesdiseno.creacionales.factorymethod.ejemplofabricavehiculos.interfaceproducto.IVehiculo;

public abstract class CreadorVehiculo {

    public abstract IVehiculo obtenerVehiculo();

    public void retonarTipoVehiculo(){
        IVehiculo iVehiculo = obtenerVehiculo();
        iVehiculo.soyUnVehiculo();
    }
}
