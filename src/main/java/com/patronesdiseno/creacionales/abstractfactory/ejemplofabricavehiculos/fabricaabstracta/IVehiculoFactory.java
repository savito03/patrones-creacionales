package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.fabricaabstracta;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosabstractos.IMotor;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosabstractos.IRueda;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosabstractos.IVehiculo;

public interface IVehiculoFactory {
    IVehiculo crearVehiculo();
    IRueda crearRueda();
    IMotor crearMotor();
}
