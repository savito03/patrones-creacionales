package com.patronesdiseno.estructurales.adapter.ejemplo4;

import com.patronesdiseno.estructurales.adapter.ejemplo4.adaptadores.SistemaRetornaArraysAdapter;
import com.patronesdiseno.estructurales.adapter.ejemplo4.sistemaconarrays.SistemaRetornaArrays;
import com.patronesdiseno.estructurales.adapter.ejemplo4.sistemaconlist.IConsultaNombresClientes;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunAdapter {

    public static void main(String[] args) {

        SistemaRetornaArrays sistemaRetornaArrays = new SistemaRetornaArrays();

        IConsultaNombresClientes consultaNombresAdaptada = new SistemaRetornaArraysAdapter(sistemaRetornaArrays);

        System.out.println(sistemaRetornaArrays.consultaNombresClientes()); //[Ljava.lang.String;@254989ff
        System.out.println(consultaNombresAdaptada.consultaNombresClientes()); //[Savio, David]

    }


}
