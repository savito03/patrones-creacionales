package com.patronescreacionales.ejemplos.builder.buidermanual;

import com.patronescreacionales.ejemplos.builder.buidermanual.DTO.Computador;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunBuilderManual {

    public static void main(String[] args) {
        // Construcción de una computadora de alta gama
        Computador computadoraAltaGama = new Computador.ComputadorBuilder()
                .setProcesador("Intel Core i9")
                .setRam(32)
                .setAlmacenamiento("SSD 1TB")
                .setTarjetaGrafica("NVIDIA RTX 3080")
                .build();

        System.out.println(computadoraAltaGama); // Imprimirá los detalles de la computadora de alta gama

        // Construcción de una computadora de gama media
        Computador computadoraGamaMedia = new Computador.ComputadorBuilder()
                .setProcesador("Intel Core i5")
                .setRam(16)
                .setAlmacenamiento("SSD 512GB")
                .setTarjetaGrafica("NVIDIA GTX 1660")
                .build();

        System.out.println(computadoraGamaMedia); // Imprimirá los detalles de la computadora de gama media

        // Construcción de una computadora básica
        Computador computadoraBasica = new Computador.ComputadorBuilder()
                .setProcesador("Intel Core i3")
                .setRam(8)
                .setAlmacenamiento("HDD 1TB")
                .setTarjetaGrafica("Integrada")
                .build();

        System.out.println(computadoraBasica); // Imprimirá los detalles de la computadora básica

    }


}
