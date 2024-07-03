package com.patronescreacionales.ejemplos.factorymethod.ejemplofabricamensajeria.creadoresconcretos;

import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricamensajeria.creador.CreadorMensajes;
import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricamensajeria.interfaceproducto.IMensaje;
import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricamensajeria.productosconcretos.MensajeWhatsApp;

public class CreadorMensajeWhatsApp extends CreadorMensajes {

    @Override
    public IMensaje instanciaComponenteMensaje() {
        return new MensajeWhatsApp();
    }
}
