package com.patronescreacionales.ejemplos.builder.anotacionbuilder;

import com.patronescreacionales.ejemplos.builder.anotacionbuilder.DTO.Computador;
import com.patronescreacionales.ejemplos.builder.anotacionbuilder.directorbuilder.Director;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunBuilderAnotacion {


    public static void main(String[] args) {
       Director director = Director.getInstance();

       Computador computadorGamaAlta = director.construirComputadorGamaAlta();
       System.out.println(computadorGamaAlta);


        director.construirComputadorGamaBaja();
    }


}
