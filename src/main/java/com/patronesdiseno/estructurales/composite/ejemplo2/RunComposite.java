package com.patronesdiseno.estructurales.composite.ejemplo2;

import com.patronesdiseno.estructurales.composite.ejemplo2.composite.GrupoDeAnimales;
import com.patronesdiseno.estructurales.composite.ejemplo2.composite.IAnimal;
import com.patronesdiseno.estructurales.composite.ejemplo2.composite.AnimalIndividual;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunComposite {

    public static void main(String[] args) {

        IAnimal vaca = new AnimalIndividual("Vaca", "muu");
        IAnimal gallina = new AnimalIndividual("Gallina", "clo");

        GrupoDeAnimales corralDeGallinas = new GrupoDeAnimales("Corral de Gallinas");
        corralDeGallinas.agregar(gallina);

        GrupoDeAnimales establo = new GrupoDeAnimales("Establo");
        establo.agregar(vaca);
        establo.agregar(corralDeGallinas);

        GrupoDeAnimales granja = new GrupoDeAnimales("Granja");
        granja.agregar(corralDeGallinas);
        granja.agregar(establo);

        granja.hacerSonido();

    }

}
