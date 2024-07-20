package com.patronesdiseno.estructurales.decorator.ejemplo3;

import com.patronesdiseno.estructurales.decorator.ejemplo3.decoradores.AnimalProDeFuego3000;
import com.patronesdiseno.estructurales.decorator.ejemplo3.decoradores.AnimalProVolador;
import com.patronesdiseno.estructurales.decorator.ejemplo3.decoradores.DecoradorDeAnimal;
import com.patronesdiseno.estructurales.decorator.ejemplo3.productobase.Animal;
import com.patronesdiseno.estructurales.decorator.ejemplo3.productobase.AnimalBase;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunDecorador {
    public static void main(String[] args) {

        AnimalBase animalBase = new AnimalBase("Anda a pata", "Come comida rica", "con el aparato");

        //El mismo animal, ahora está mejorado y tira bolas de fuego
        AnimalProDeFuego3000 animalProDeFuego3000 = new AnimalProDeFuego3000(animalBase);

        //El mismo animal, ahora está mejorado y vuela
        AnimalProVolador animalProVolador = new AnimalProVolador(animalProDeFuego3000);

        System.out.println(animalProDeFuego3000.andar());
        System.out.println(animalProDeFuego3000.comer());
        System.out.println(animalProDeFuego3000.reproducirse());
        System.out.println("------------------------------------------------------");
        System.out.println(animalProDeFuego3000.movimientoExtremo());
        System.out.println("------------------------------------------------------");
        System.out.println(animalProVolador.volar());
        System.out.println("------------------------------------------------------");
        System.out.println(((DecoradorDeAnimal) animalProVolador).movimientoExtremo());


    }
}
