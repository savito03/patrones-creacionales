package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosconcretos;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricavehiculos.productosabstractos.IMotor;

public class MotorMotocicleta implements IMotor {

    @Override
    public void mostrarTipo() {
        System.out.println("Soy un motor de moto");
    }
}
