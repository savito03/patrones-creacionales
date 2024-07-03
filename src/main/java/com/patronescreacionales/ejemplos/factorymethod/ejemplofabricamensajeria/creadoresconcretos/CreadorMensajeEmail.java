package com.patronescreacionales.ejemplos.factorymethod.ejemplofabricamensajeria.creadoresconcretos;

import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricamensajeria.creador.CreadorMensajes;
import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricamensajeria.interfaceproducto.IMensaje;
import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricamensajeria.productosconcretos.MensajeEmail;

public class CreadorMensajeEmail extends CreadorMensajes {

    @Override
    public IMensaje instanciaComponenteMensaje() {
        return new MensajeEmail();
    }
}
