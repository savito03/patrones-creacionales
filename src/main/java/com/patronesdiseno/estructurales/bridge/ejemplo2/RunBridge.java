package com.patronesdiseno.estructurales.bridge.ejemplo2;

import com.patronesdiseno.estructurales.bridge.ejemplo2.abstracciones.Circulo;
import com.patronesdiseno.estructurales.bridge.ejemplo2.abstracciones.Cuadrado;
import com.patronesdiseno.estructurales.bridge.ejemplo2.abstracciones.Forma;
import com.patronesdiseno.estructurales.bridge.ejemplo2.implementaciones.Azul;
import com.patronesdiseno.estructurales.bridge.ejemplo2.implementaciones.IColor;
import com.patronesdiseno.estructurales.bridge.ejemplo2.implementaciones.Rojo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunBridge {
    /**
     * Desacoplamiento: Separa la abstracción de su implementación, permitiendo que ambas evolucionen independientemente.
     * En resumen, el patrón Bridge proporciona una estructura flexible y escalable para manejar múltiples variantes de una abstracción y su implementación, facilitando la mantenibilidad y extensibilidad del código.
     */
    public static void main(String[] args) {
        IColor rojo = new Rojo();
        IColor azul = new Azul();

        Forma circuloRojo = new Circulo(rojo);
        Forma cuadradoAzul = new Cuadrado(azul);

        circuloRojo.dibujar();  // Salida: Dibujando un círculo. Aplicando color rojo.
        cuadradoAzul.dibujar(); // Salida: Dibujando un cuadrado. Aplicando color azul.
    }

}
