package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.fabricaabstracta.IVehiculoFactory;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.fabricasconcretas.CocheFactory;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.fabricasconcretas.MotocicletaFactory;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IMotor;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IRueda;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IVehiculo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunAbstractFactory {


    public static void main(String[] args) {

        // Crear fábrica de coche y usarla para crear coche y sus partes
        IVehiculoFactory cocheFactory = new CocheFactory();
        IVehiculo coche = cocheFactory.crearVehiculo();
        IRueda ruedaCoche = cocheFactory.crearRueda();
        IMotor motorCoche = cocheFactory.crearMotor();

        coche.mostrarTipo();
        ruedaCoche.mostrarTipo();
        motorCoche.mostrarTipo();

        // Crear fábrica de motocicleta y usarla para crear motocicleta y sus partes
        IVehiculoFactory motocicletaFactory = new MotocicletaFactory();
        IVehiculo motocicleta = motocicletaFactory.crearVehiculo();
        IRueda ruedaMotocicleta = motocicletaFactory.crearRueda();
        IMotor motorMotocicleta = motocicletaFactory.crearMotor();

        motocicleta.mostrarTipo();
        ruedaMotocicleta.mostrarTipo();
        motorMotocicleta.mostrarTipo();

    }

}
