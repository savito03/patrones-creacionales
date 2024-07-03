package com.patronescreacionales.ejemplos.factorymethod.ejemplofabricamensajeria.productosconcretos;

import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricamensajeria.interfaceproducto.IMensaje;

public class MensajeSMS implements IMensaje {
    @Override
    public void enviarMensaje() {
        System.out.println("Mensaje por SMS");
    }
}
