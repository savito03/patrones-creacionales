package com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.creadoresconcretos;

import com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.creador.CreadorMensajes;
import com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.interfaceproducto.IMensaje;
import com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.productosconcretos.MensajeEmail;

public class CreadorMensajeEmail extends CreadorMensajes {

    @Override
    public IMensaje instanciaComponenteMensaje() {
        return new MensajeEmail();
    }
}
