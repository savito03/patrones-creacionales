package com.patronesdiseno.estructurales.facade.ejemplo1.facades;

import com.patronesdiseno.estructurales.facade.ejemplo1.subsistemas.AgendarEntregaPaquete;
import com.patronesdiseno.estructurales.facade.ejemplo1.subsistemas.EnviarEmailConfirmacionEntrega;
import com.patronesdiseno.estructurales.facade.ejemplo1.subsistemas.ValidarCompraExitosa;

public class EnvioPaqueteFacade {

    private ValidarCompraExitosa validarCompraExitosa;
    private AgendarEntregaPaquete agendarEntregaPaquete;
    private EnviarEmailConfirmacionEntrega enviarEmailConfirmacionEntrega;

    public EnvioPaqueteFacade() {
        validarCompraExitosa = new ValidarCompraExitosa();
        agendarEntregaPaquete = new AgendarEntregaPaquete();
        enviarEmailConfirmacionEntrega = new EnviarEmailConfirmacionEntrega();
    }

    public void coordinarEnvioPaquete(){
        Boolean compraExitosa = validarCompraExitosa.validarCompraExitosa();

        if(Boolean.FALSE.equals(compraExitosa)){
            System.out.println("La compra no fue exitosa");
            return;
        }
        agendarEntregaPaquete.agendarEntrega("PAC12022024", "Montería", "Savio Romero");
        enviarEmailConfirmacionEntrega.enviarEmailConfirmacionEntrega("savioromero@pruebas.com");

    }

}
