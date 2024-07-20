package com.patronesdiseno.estructurales.composite.ejemplo1.composite;

public class ProductoIndividual implements IProducto {

    private String nombre;

    public ProductoIndividual(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrar() {
        System.out.println("Producto: " + nombre);
    }
}
