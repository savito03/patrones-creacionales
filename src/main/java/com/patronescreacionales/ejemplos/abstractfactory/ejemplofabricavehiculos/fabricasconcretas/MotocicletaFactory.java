package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.fabricasconcretas;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.fabricaabstracta.IVehiculoFactory;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IMotor;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IRueda;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IVehiculo;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosconcretos.Motocicleta;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosconcretos.MotorMotocicleta;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosconcretos.RuedaCoche;

public class MotocicletaFactory implements IVehiculoFactory {
    @Override
    public IVehiculo crearVehiculo() {
        return new Motocicleta();
    }

    @Override
    public IRueda crearRueda() {
        return new RuedaCoche();
    }

    @Override
    public IMotor crearMotor() {
        return new MotorMotocicleta();
    }
}
