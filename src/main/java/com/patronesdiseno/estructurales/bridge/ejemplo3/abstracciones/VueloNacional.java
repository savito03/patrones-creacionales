package com.patronesdiseno.estructurales.bridge.ejemplo3.abstracciones;

import com.patronesdiseno.estructurales.bridge.ejemplo3.implementaciones.IAerolinea;

public class VueloNacional extends AgendarVuelo {
    public VueloNacional(IAerolinea iAerolinea) {
        super(iAerolinea);
    }
    @Override
    public void agendarVuelos() {
        System.out.println("Agendando vuelo nacional");
        iAerolinea.comprarTiquete();
    }
}
