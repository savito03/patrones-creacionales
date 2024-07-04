package com.patronesdiseno.estructurales.adapter.ejemplo1.objetos;

public class MotorEconomico extends Motor{

    public MotorEconomico(){
        super();
        System.out.println("Creando motor econónimo");
    }
    @Override
    public void encender() {
        System.out.println("Motor económico encendido");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando al motor económico");
    }

    @Override
    public void apagar() {
        System.out.println("Motor económico apagado");
    }
}
