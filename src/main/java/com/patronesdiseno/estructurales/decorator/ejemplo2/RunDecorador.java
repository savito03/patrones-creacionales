package com.patronesdiseno.estructurales.decorator.ejemplo2;

import com.patronesdiseno.estructurales.decorator.ejemplo2.decorador.Seguimiento;
import com.patronesdiseno.estructurales.decorator.ejemplo2.decorador.Seguro;
import com.patronesdiseno.estructurales.decorator.ejemplo2.productobase.IEnvio;
import com.patronesdiseno.estructurales.decorator.ejemplo2.productobase.EnvioBase;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunDecorador {
    public static void main(String[] args) {

        IEnvio iEnvio = new EnvioBase("Envío Básico", 20.00);

        System.out.println(iEnvio.getDescripcion() + " cuesta " + iEnvio.getCosto() + " USD");

        iEnvio = new Seguro(iEnvio);
        System.out.println(iEnvio.getDescripcion() + " cuesta " + iEnvio.getCosto() + " USD");

        iEnvio = new Seguimiento(iEnvio);
        System.out.println(iEnvio.getDescripcion() + " cuesta " + iEnvio.getCosto() + " USD");

        iEnvio.actualizarDatosEnBD();
    }
}
