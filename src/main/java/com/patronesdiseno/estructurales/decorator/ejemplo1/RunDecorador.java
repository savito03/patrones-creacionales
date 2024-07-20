package com.patronesdiseno.estructurales.decorator.ejemplo1;

import com.patronesdiseno.estructurales.decorator.ejemplo1.decoradores.DobleCarne;
import com.patronesdiseno.estructurales.decorator.ejemplo1.decoradores.ExtraQueso;
import com.patronesdiseno.estructurales.decorator.ejemplo1.productobase.Orden;
import com.patronesdiseno.estructurales.decorator.ejemplo1.productobase.OrdenBase;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunDecorador {
    public static void main(String[] args) {

        Orden orden = new OrdenBase("Hamburguesa", 5.00);

        System.out.println(orden.getDescripcion() + " cuesta " + orden.getCosto() + " USD");

        orden = new ExtraQueso(orden);
        System.out.println(orden.getDescripcion() + " cuesta " + orden.getCosto() + " USD");

        orden = new DobleCarne(orden);
        System.out.println(orden.getDescripcion() + " cuesta " + orden.getCosto() + " USD");
    }
}
