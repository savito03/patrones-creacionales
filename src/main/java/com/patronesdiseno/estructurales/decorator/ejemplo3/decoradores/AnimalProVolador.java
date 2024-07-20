package com.patronesdiseno.estructurales.decorator.ejemplo3.decoradores;

import com.patronesdiseno.estructurales.decorator.ejemplo3.productobase.Animal;

public class AnimalProVolador extends DecoradorDeAnimal{
    public AnimalProVolador(Animal animal) {
        super(animal);
    }

    @Override
    public String movimientoExtremo() {
        return "Aletea con muy muy duro";
    }

    public String volar() {
        return "Aletea suavecito";
    }
}
