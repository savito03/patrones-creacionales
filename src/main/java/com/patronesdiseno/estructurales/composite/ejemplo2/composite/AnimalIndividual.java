package com.patronesdiseno.estructurales.composite.ejemplo2.composite;

public class AnimalIndividual implements IAnimal {

    private String nombre;
    private String sonido;

    public AnimalIndividual(String nombre, String sonido) {
        this.nombre = nombre;
        this.sonido = sonido;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace " + sonido);
    }
}
