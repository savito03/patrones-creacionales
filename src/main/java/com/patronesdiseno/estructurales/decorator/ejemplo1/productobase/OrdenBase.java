package com.patronesdiseno.estructurales.decorator.ejemplo1.productobase;

public class OrdenBase implements Orden {
    private String descripcion;
    private double costo;

    public OrdenBase(String descripcion, double costo) {
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
}
