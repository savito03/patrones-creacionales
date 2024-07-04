package com.patronesdiseno.estructurales.adapter.ejemplo1;

import com.patronesdiseno.creacionales.singleton.ejemplo.ConectarBD;
import com.patronesdiseno.estructurales.adapter.ejemplo1.adaptadores.MotorElectricoAdapder;
import com.patronesdiseno.estructurales.adapter.ejemplo1.objetos.Motor;
import com.patronesdiseno.estructurales.adapter.ejemplo1.objetos.MotorComun;
import com.patronesdiseno.estructurales.adapter.ejemplo1.objetos.MotorEconomico;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RunAdapter {

    public static void main(String[] args) {

        Motor motorComun = new MotorComun();
        Motor motorEconomico = new MotorEconomico();
        Motor motorElectricoAdaptado = new MotorElectricoAdapder();

        System.out.println("------------------------------------------------------------");

        List<Motor> listadoMotores = new ArrayList<>();
        listadoMotores.add(motorComun);
        listadoMotores.add(motorEconomico);
        listadoMotores.add(motorElectricoAdaptado);

        for(Motor motor : listadoMotores){
            encenderMotor(motor);
            acelerarMotor(motor);
            apagarMotor(motor);
            System.out.println("------------------------------------------------------------");
        }
    }

    public static void encenderMotor(Motor motor) {
        motor.encender();
    }

    public static void acelerarMotor(Motor motor) {
        motor.acelerar();
    }

    public static void apagarMotor(Motor motor) {
        motor.apagar();
    }


}
