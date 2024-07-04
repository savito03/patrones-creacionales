package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.fabricasconcretas;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosconcretos.MotorMotocicleta;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.fabricaabstracta.IVehiculoFactory;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosabstractos.IMotor;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosabstractos.IRueda;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosabstractos.IVehiculo;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosconcretos.Motocicleta;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosconcretos.RuedaCoche;

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
