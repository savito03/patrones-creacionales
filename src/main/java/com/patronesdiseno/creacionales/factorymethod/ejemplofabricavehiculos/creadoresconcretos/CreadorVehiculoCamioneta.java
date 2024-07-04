package com.patronesdiseno.creacionales.factorymethod.ejemplofabricavehiculos.creadoresconcretos;

import com.patronesdiseno.creacionales.factorymethod.ejemplofabricavehiculos.creador.CreadorVehiculo;
import com.patronesdiseno.creacionales.factorymethod.ejemplofabricavehiculos.interfaceproducto.IVehiculo;
import com.patronesdiseno.creacionales.factorymethod.ejemplofabricavehiculos.productosconcretos.Camioneta;

public class CreadorVehiculoCamioneta extends CreadorVehiculo {
    @Override
    public IVehiculo obtenerVehiculo() {
        return new Camioneta();
    }
}
