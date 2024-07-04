package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.fabricasconcretas;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.fabricaabstracta.IVehiculoFactory;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosabstractos.IMotor;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosabstractos.IRueda;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosabstractos.IVehiculo;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosconcretos.Coche;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosconcretos.MotorCoche;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosconcretos.RuedaCoche;

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
