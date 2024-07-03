package com.patronescreacionales.ejemplos.factorymethod.ejemplofabricavehiculos.creadoresconcretos;

import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricavehiculos.creador.CreadorVehiculo;
import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricavehiculos.interfaceproducto.IVehiculo;
import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricavehiculos.productosconcretos.Coche;

public class CreadorVehiculoCoche extends CreadorVehiculo {
    @Override
    public IVehiculo obtenerVehiculo() {
        return new Coche();
    }
}
