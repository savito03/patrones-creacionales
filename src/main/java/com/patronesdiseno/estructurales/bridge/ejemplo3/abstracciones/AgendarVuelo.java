package com.patronesdiseno.estructurales.bridge.ejemplo3.abstracciones;

import com.patronesdiseno.estructurales.bridge.ejemplo3.implementaciones.IAerolinea;

public abstract class AgendarVuelo {

    protected IAerolinea iAerolinea;

    public AgendarVuelo(IAerolinea iAerolinea) {
        this.iAerolinea = iAerolinea;
    }

    public abstract void agendarVuelos();
}
