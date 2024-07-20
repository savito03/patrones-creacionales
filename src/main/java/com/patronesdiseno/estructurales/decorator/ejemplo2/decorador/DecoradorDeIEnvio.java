package com.patronesdiseno.estructurales.decorator.ejemplo2.decorador;

import com.patronesdiseno.estructurales.decorator.ejemplo2.productobase.IEnvio;

public abstract class DecoradorDeIEnvio implements IEnvio {
    protected IEnvio IEnvioDecorado;

    public DecoradorDeIEnvio(IEnvio IEnvioDecorado) {
        this.IEnvioDecorado = IEnvioDecorado;
    }

    @Override
    public String getDescripcion() {
        return IEnvioDecorado.getDescripcion();
    }

    @Override
    public double getCosto() {
        return IEnvioDecorado.getCosto();
    }
}