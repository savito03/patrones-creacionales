package com.patronescreacionales.ejemplos.factorymethod.ejemplofabricavehiculos;

import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricavehiculos.creador.CreadorVehiculo;
import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricavehiculos.creadoresconcretos.CreadorVehiculoCamioneta;
import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricavehiculos.creadoresconcretos.CreadorVehiculoCoche;
import com.patronescreacionales.ejemplos.factorymethod.ejemplofabricavehiculos.interfaceproducto.IVehiculo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RunFactoryMethod {

    private static CreadorVehiculo creadorVehiculo;

    public static void main(String[] args) {
        obtenerVehiculo();
    }

    //Método para crear todos los tipos de vehículos
    public static void obtenerVehiculo() {
        List<Integer> listadoNumeros = new ArrayList<>();
        listadoNumeros.add(1);
        listadoNumeros.add(2);

        //Lógica que reemplaza una lógica superior para saber qué tipo de vehículo crear
        for (Integer numero : listadoNumeros) {
            switch (numero) {
                case 1:
                    crearVehiculoCoche();
                    break;
                case 2:
                    crearVehiculoCamioneta();
                    break;
                default:
                    System.out.println("Número no reconocido");
                    break;
            }
        }
    }

    private static void crearVehiculoCoche() {
        creadorVehiculo = new CreadorVehiculoCoche();
        creadorVehiculo.retonarTipoVehiculo();


        IVehiculo iVehiculo =  creadorVehiculo.obtenerVehiculo();
        iVehiculo.probarVehiculo();

        enviarVehiculoAConcesionario(iVehiculo);
        System.out.println("-----------------------------------------------");
    }

    private static void crearVehiculoCamioneta() {
        creadorVehiculo = new CreadorVehiculoCamioneta();
        creadorVehiculo.retonarTipoVehiculo();

        IVehiculo iVehiculo =  creadorVehiculo.obtenerVehiculo();
        iVehiculo.probarVehiculo();

        enviarVehiculoAConcesionario(iVehiculo);
        System.out.println("-----------------------------------------------");
    }

    private static void enviarVehiculoAConcesionario(IVehiculo iVehiculo){
        iVehiculo.enviarAConcesionario();
    }


}
