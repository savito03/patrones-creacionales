package com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria;

import com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.creador.CreadorMensajes;
import com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.creadoresconcretos.CreadorMensajeEmail;
import com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.creadoresconcretos.CreadorMensajeSMS;
import com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.creadoresconcretos.CreadorMensajeWhatsApp;
import com.patronesdiseno.creacionales.factorymethod.ejemplofabricamensajeria.interfaceproducto.IMensaje;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RunFactoryMethod {

    private static CreadorMensajes componenteMensajes;

    public static void main(String[] args) {
        obtenerComponenteMesaje();
    }

    public static void obtenerComponenteMesaje() {
        List<Integer> listadoNumeros = new ArrayList<>();
        listadoNumeros.add(1);
        listadoNumeros.add(2);
        listadoNumeros.add(3);

        for (Integer numero : listadoNumeros) {
            switch (numero) {
                case 1:
                    enviarMensajeWhatsApp();
                    break; // Añadir break para evitar fall-through
                case 2:
                    enviarMensajeSMS();
                    break; // Añadir break para evitar fall-through
                case 3:
                    enviarMensajeEmail();
                    break; // Añadir break para evitar fall-through
                default:
                    System.out.println("Número no reconocido");
                    break; // Buen hábito agregar break en default también
            }
        }
    }

    private static void enviarMensajeEmail() {
        componenteMensajes = new CreadorMensajeEmail();
        IMensaje mensaje = componenteMensajes.instanciaComponenteMensaje();
        mensaje.enviarMensaje();
    }

    private static void enviarMensajeSMS() {
        componenteMensajes = new CreadorMensajeSMS();
        IMensaje mensaje = componenteMensajes.instanciaComponenteMensaje();
        mensaje.enviarMensaje();
    }

    private static void enviarMensajeWhatsApp() {
        componenteMensajes = new CreadorMensajeWhatsApp();
        IMensaje mensaje = componenteMensajes.instanciaComponenteMensaje();
        mensaje.enviarMensaje();
    }

}
