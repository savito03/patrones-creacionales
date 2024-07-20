package com.patronesdiseno.estructurales.decorator.ejemplo3.productobase;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnimalBase implements Animal {

    private String andar;
    private String comer;
    private String reproducirse;

    public AnimalBase(String andar, String comer, String reproducirse) {
        this.andar = andar;
        this.comer = comer;
        this.reproducirse = reproducirse;
    }

    @Override
    public String andar() {
        return andar ;
    }

    @Override
    public String reproducirse() {
        return  reproducirse;
    }

    @Override
    public String comer() {
       return  comer;
    }
}
