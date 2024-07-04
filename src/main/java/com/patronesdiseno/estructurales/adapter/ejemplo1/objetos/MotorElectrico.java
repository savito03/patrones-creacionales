package com.patronesdiseno.estructurales.adapter.ejemplo1.objetos;

public class MotorElectrico {

    public MotorElectrico(){
        super();
        System.out.println("Creando motor eléctrico");
    }
    public void encenderSistemaElectricoDeMovimiento() {
        System.out.println("Motor eléctrico encendido");
    }

    public void subirPotenciaParaAcelerar() {
        System.out.println("Acelerando al motor eléctrico");
    }

    public void apagarSistemaElectricoDeMovimiento() {
        System.out.println("Motor eléctrico apagado");
    }
}
