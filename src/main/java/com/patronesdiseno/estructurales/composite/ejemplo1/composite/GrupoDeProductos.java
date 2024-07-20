package com.patronesdiseno.estructurales.composite.ejemplo1.composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoDeProductos implements IProducto {
    private String nombre;
    private List<IProducto> productos = new ArrayList<>();

    public GrupoDeProductos(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(IProducto iProducto) {
        productos.add(iProducto);
    }

    public void remover(IProducto iProducto) {
        productos.remove(iProducto);
    }

    @Override
    public void mostrar() {
        System.out.println("Grupo de productos: " + nombre);
        for (IProducto iProducto : productos) {
            iProducto.mostrar();
        }
    }

}
