package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.fabricasconcretas;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.fabricaabstracta.IVehiculoFactory;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IMotor;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IRueda;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IVehiculo;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosconcretos.Coche;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosconcretos.MotorCoche;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosconcretos.RuedaCoche;

public class CocheFactory implements IVehiculoFactory {
    @Override
    public IVehiculo crearVehiculo() {
        return new Coche();
    }

    @Override
    public IRueda crearRueda() {
        return new RuedaCoche();
    }

    @Override
    public IMotor crearMotor() {
        return new MotorCoche();
    }
}
