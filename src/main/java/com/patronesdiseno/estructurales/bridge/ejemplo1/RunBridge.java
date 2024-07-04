package com.patronesdiseno.estructurales.bridge.ejemplo1;

import com.patronesdiseno.estructurales.bridge.ejemplo1.abstracciones.Destornillador;
import com.patronesdiseno.estructurales.bridge.ejemplo1.abstracciones.Herramienta;
import com.patronesdiseno.estructurales.bridge.ejemplo1.abstracciones.Martillo;
import com.patronesdiseno.estructurales.bridge.ejemplo1.implementaciones.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunBridge {
    /**
     * Desacoplamiento: Separa la abstracción de su implementación, permitiendo que ambas evolucionen independientemente.
     * En resumen, el patrón Bridge proporciona una estructura flexible y escalable para manejar múltiples variantes de una abstracción y su implementación, facilitando la mantenibilidad y extensibilidad del código.
     */
    public static void main(String[] args) {

        IImplementacion implementacionMona = new ImplementacionMartilloMona();
        IImplementacion implementacionMartilloHierro = new ImplementacionMartilloHierro();

        IImplementacion implementacionDestornilladorEstrias = new ImplementacionDestornilladorEstrias();
        IImplementacion implementacionDestornilladorPaleta = new ImplementacionDestornilladorPaleta();

        Herramienta martilloMona = new Martillo(implementacionMona);
        Herramienta martilloHierro = new Martillo(implementacionMartilloHierro);
        Herramienta destornilladorEstrias = new Destornillador(implementacionDestornilladorEstrias);
        Herramienta destornilladorPaleta = new Destornillador(implementacionDestornilladorPaleta);

        martilloMona.operar();
        martilloHierro.operar();
        destornilladorEstrias.operar();
        destornilladorPaleta.operar();
    }

}
