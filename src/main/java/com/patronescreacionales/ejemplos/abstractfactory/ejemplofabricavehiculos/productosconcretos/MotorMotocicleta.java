package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosconcretos;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IMotor;

public class MotorMotocicleta implements IMotor {

    @Override
    public void mostrarTipo() {
        System.out.println("Soy un motor de moto");
    }
}
