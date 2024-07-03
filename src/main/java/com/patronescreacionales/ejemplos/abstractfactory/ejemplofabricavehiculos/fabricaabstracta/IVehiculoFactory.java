package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.fabricaabstracta;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IMotor;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IRueda;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IVehiculo;

public interface IVehiculoFactory {
    IVehiculo crearVehiculo();
    IRueda crearRueda();
    IMotor crearMotor();
}
