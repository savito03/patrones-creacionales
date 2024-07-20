package com.patronesdiseno.estructurales.decorator.ejemplo2.productobase;

public class EnvioBase implements IEnvio {
    private String descripcion;
    private double costo;

    public EnvioBase(String descripcion, double costo) {
        this.descripcion = descripcion;
        this.costo = costo;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double getCosto() {
        return costo;
    }

    @Override
    public void actualizarDatosEnBD() {
        System.out.println("");
    }
}
