package com.patronesdiseno.creacionales.builder.anotacionbuilder.directorbuilder;

import com.patronesdiseno.creacionales.builder.anotacionbuilder.DTO.Computador;

public class Director {

    private Director() {
    }

    private static class SingletonHelper {
        // La instancia única de la clase
        private static final Director INSTANCIA = new Director();
    }

    public static Director getInstance() {
        return Director.SingletonHelper.INSTANCIA;
    }

    public Computador construirComputadorGamaAlta() {
        return Computador.builder()
                .procesador("Intel Core i9")
                .ram(32)
                .almacenamiento("SSD 1TB")
                .tarjetaGrafica("NVIDIA RTX 3080")
                .build();
    }

    public Computador construirComputadorGamaBaja() {
        return Computador.builder()
                .procesador("Intel pentium")
                .ram(4)
                .almacenamiento("HDD 1TB")
                .build();
    }

}
