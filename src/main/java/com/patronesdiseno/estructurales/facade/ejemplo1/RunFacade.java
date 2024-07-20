package com.patronesdiseno.estructurales.facade.ejemplo1;

import com.patronesdiseno.creacionales.singleton.ejemplo.ConectarBD;
import com.patronesdiseno.estructurales.facade.ejemplo1.facades.EnvioPaqueteFacade;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunFacade {

    public static void main(String[] args) {

        EnvioPaqueteFacade envioPaqueteFacade = new EnvioPaqueteFacade();
        envioPaqueteFacade.coordinarEnvioPaquete();
    }

}
