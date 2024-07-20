package com.patronesdiseno.estructurales.decorator.ejemplo2.decorador;

import com.patronesdiseno.estructurales.decorator.ejemplo2.productobase.IEnvio;

public class Seguro extends DecoradorDeIEnvio {
    public Seguro(IEnvio IEnvioDecorado) {
        super(IEnvioDecorado);
    }

    @Override
    public String getDescripcion() {
        return IEnvioDecorado.getDescripcion() + ", con Seguro";
    }

    @Override
    public double getCosto() {
        return IEnvioDecorado.getCosto() + 10.00;
    }

    @Override
    public void actualizarDatosEnBD() {
        System.out.println("Se actualizaron los datos en bd con los costos excedentes por el añadido");
    }
}