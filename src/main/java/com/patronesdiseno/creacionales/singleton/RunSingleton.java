package com.patronesdiseno.creacionales.singleton;

import com.patronesdiseno.creacionales.singleton.ejemplo.ConectarBD;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunSingleton {

    public static void main(String[] args) {

        //Ejemplos singleton
        ConectarBD conectarBD = new ConectarBD();
        conectarBD.conectar();
        conectarBD.comprobarInstanciaUnica();

    }

}
