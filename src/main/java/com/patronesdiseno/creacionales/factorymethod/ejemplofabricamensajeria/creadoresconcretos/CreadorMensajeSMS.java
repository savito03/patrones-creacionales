package com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.creadoresconcretos;

import com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.creador.CreadorMensajes;
import com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.interfaceproducto.IMensaje;
import com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.productosconcretos.MensajeSMS;

public class CreadorMensajeSMS extends CreadorMensajes {

    @Override
    public IMensaje instanciaComponenteMensaje() {
        return new MensajeSMS();
    }
}
