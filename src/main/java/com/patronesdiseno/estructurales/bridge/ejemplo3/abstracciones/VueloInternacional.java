package com.patronesdiseno.estructurales.bridge.ejemplo3.abstracciones;

import com.patronesdiseno.estructurales.bridge.ejemplo3.implementaciones.IAerolinea;

public class VueloInternacional extends AgendarVuelo {
    public VueloInternacional(IAerolinea iAerolinea) {
        super(iAerolinea);
    }

    @Override
    public void agendarVuelos() {
        System.out.println("Agendando vuelo internacional");
        iAerolinea.comprarTiquete();
    }
}
