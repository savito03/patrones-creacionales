package com.patronesdiseno.creacionales.factorymethod.ejemplofabricavehiculos.creadoresconcretos;

import com.patronesdiseno.creacionales.factorymethod.ejemplofabricavehiculos.creador.CreadorVehiculo;
import com.patronesdiseno.creacionales.factorymethod.ejemplofabricavehiculos.interfaceproducto.IVehiculo;
import com.patronesdiseno.creacionales.factorymethod.ejemplofabricavehiculos.productosconcretos.Coche;

public class CreadorVehiculoCoche extends CreadorVehiculo {
    @Override
    public IVehiculo obtenerVehiculo() {
        return new Coche();
    }
}
