package com.patronesdiseno.creacionales.builder.anotacionbuilder;

import com.patronesdiseno.creacionales.builder.anotacionbuilder.DTO.Computador;
import com.patronesdiseno.creacionales.builder.anotacionbuilder.directorbuilder.Director;
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
