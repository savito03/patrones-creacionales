package com.patronesdiseno.estructurales.decorator.ejemplo3.decoradores;

import com.patronesdiseno.estructurales.decorator.ejemplo3.productobase.Animal;

public class AnimalProDeFuego3000 extends DecoradorDeAnimal{
    public AnimalProDeFuego3000(Animal animal) {
        super(animal);
    }

    public String movimientoExtremo(){
        return "El animal " + animal.andar() + ", luego " +            animal.comer() + " y "+ animal.reproducirse() + " " + tiraBolasFuego();
    }
    public String tiraBolasFuego(){
        return "el animal tira bolas de fuego";
    }
}
