package com.patronesdiseno.estructurales.adapter.ejemplo4.adaptadores;

import com.patronesdiseno.estructurales.adapter.ejemplo4.sistemaconarrays.SistemaRetornaArrays;
import com.patronesdiseno.estructurales.adapter.ejemplo4.sistemaconlist.IConsultaNombresClientes;

import java.util.Arrays;
import java.util.List;

public class SistemaRetornaArraysAdapter implements IConsultaNombresClientes {

    private SistemaRetornaArrays sistemaRetornaArrays;

    public SistemaRetornaArraysAdapter(SistemaRetornaArrays sistemaRetornaArrays){
        this.sistemaRetornaArrays = sistemaRetornaArrays;
    }

    @Override
    public List<String> consultaNombresClientes() {
        String [] arrayNombresClientes = sistemaRetornaArrays.consultaNombresClientes();
        List<String> listadoNombreClientes = tranformarArrayStringToListString(arrayNombresClientes);
        return listadoNombreClientes;
    }

    private List<String> tranformarArrayStringToListString(String[] arrayNombresClientes) {
        return Arrays.asList(arrayNombresClientes);
    }
}
