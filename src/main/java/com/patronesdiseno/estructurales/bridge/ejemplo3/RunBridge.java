package com.patronesdiseno.estructurales.bridge.ejemplo3;

import com.patronesdiseno.estructurales.bridge.ejemplo3.abstracciones.AgendarVuelo;
import com.patronesdiseno.estructurales.bridge.ejemplo3.abstracciones.VueloInternacional;
import com.patronesdiseno.estructurales.bridge.ejemplo3.abstracciones.VueloNacional;
import com.patronesdiseno.estructurales.bridge.ejemplo3.implementaciones.AerolineaAvianca;
import com.patronesdiseno.estructurales.bridge.ejemplo3.implementaciones.AerolineaLatam;
import com.patronesdiseno.estructurales.bridge.ejemplo3.implementaciones.IAerolinea;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class RunBridge {
    /**
     * Desacoplamiento: Separa la abstracción de su implementación, permitiendo que ambas evolucionen independientemente.
     * En resumen, el patrón Bridge proporciona una estructura flexible y escalable para manejar múltiples variantes de una abstracción y su implementación, facilitando la mantenibilidad y extensibilidad del código.
     */
    public static void main(String[] args) {
        IAerolinea aerolineaAvianca = new AerolineaAvianca();
        IAerolinea aeroLineaLatam = new AerolineaLatam();

        AgendarVuelo agendarVueloInternacionalAvianca = new VueloInternacional(aerolineaAvianca);
        AgendarVuelo agenderVueloInternacionalLatam = new VueloInternacional(aeroLineaLatam);
        AgendarVuelo agenderVueloNacionalAvianca = new VueloNacional(aerolineaAvianca);
        AgendarVuelo agenderVueloNacionalLatam = new VueloNacional(aeroLineaLatam);

        //Si agrega otra aerolínea a la flota de aerolíneas, se agrega solo a las implementaciones y si se agrega otro tipo de vuelo (Espacial?) Solo se agrega a las abstracciones

        List<AgendarVuelo> listaVuelosAgendados = Arrays.asList(agendarVueloInternacionalAvianca, agenderVueloInternacionalLatam, agenderVueloNacionalAvianca, agenderVueloNacionalLatam);

        listaVuelosAgendados.stream().forEach(vuelo -> {
            vuelo.agendarVuelos();
            System.out.println("------------------------------------------------------------");
        });
    }

}
