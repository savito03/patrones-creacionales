package com.patronesdiseno.estructurales.decorator.ejemplo3.decoradores;

import com.patronesdiseno.estructurales.decorator.ejemplo3.productobase.Animal;

public abstract class DecoradorDeAnimal implements Animal {
    protected Animal animal;

    public DecoradorDeAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String andar() {
        return animal.andar();
    }

    @Override
    public String reproducirse() {
        return animal.reproducirse();
    }

    @Override
    public String comer() {
        return animal.comer();
    }

    public abstract String movimientoExtremo();
}
