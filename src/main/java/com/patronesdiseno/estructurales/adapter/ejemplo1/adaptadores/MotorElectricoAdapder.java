package com.patronesdiseno.estructurales.adapter.ejemplo1.adaptadores;

import com.patronesdiseno.estructurales.adapter.ejemplo1.objetos.Motor;
import com.patronesdiseno.estructurales.adapter.ejemplo1.objetos.MotorElectrico;

public class MotorElectricoAdapder extends Motor {

    private MotorElectrico motorElectrico;

    public MotorElectricoAdapder() {
        super();
        this.motorElectrico = new MotorElectrico();
    }

    @Override
    public void encender() {
        motorElectrico.encenderSistemaElectricoDeMovimiento();
    }

    @Override
    public void acelerar() {
        motorElectrico.subirPotenciaParaAcelerar();
    }

    @Override
    public void apagar() {
        motorElectrico.apagarSistemaElectricoDeMovimiento();
    }
}
