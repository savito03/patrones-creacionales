package com.patronesdiseno.estructurales.composite.ejemplo2.composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoDeAnimales implements IAnimal {
    private String nombre;
    private List<IAnimal> animales = new ArrayList<>();

    public GrupoDeAnimales(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(IAnimal iAnimal) {
        animales.add(iAnimal);
    }

    public void remover(IAnimal iAnimal) {
        animales.remove(iAnimal);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Grupo de animales: " + nombre);
        for (IAnimal iAnimal : animales) {
            iAnimal.hacerSonido();
        }
    }

}
