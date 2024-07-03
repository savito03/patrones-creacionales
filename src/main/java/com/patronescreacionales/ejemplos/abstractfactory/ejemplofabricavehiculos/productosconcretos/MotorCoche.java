package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosconcretos;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricavehiculos.productosabstractos.IMotor;

public class MotorCoche implements IMotor {

    @Override
    public void mostrarTipo() {
        System.out.println("Soy un motor de coche");
    }
}
