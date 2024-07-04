package com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.productosconcretos;

import com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.interfaceproducto.IMensaje;

public class MensajeSMS implements IMensaje {
    @Override
    public void enviarMensaje() {
        System.out.println("Mensaje por SMS");
    }
}
