package com.patronesdiseno.estructurales.adapter.ejemplo1.objetos;

public class MotorComun extends Motor{

    public MotorComun(){
        super();
        System.out.println("Creando motor común");
    }
    @Override
    public void encender() {
        System.out.println("Motor común encendido");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando al motor común");
    }

    @Override
    public void apagar() {
        System.out.println("Motor común apagado.");
    }
}
