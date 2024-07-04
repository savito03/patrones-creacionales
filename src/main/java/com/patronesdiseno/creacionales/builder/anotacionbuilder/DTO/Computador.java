package com.patronesdiseno.creacionales.builder.anotacionbuilder.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Builder
@Getter
@Setter
public class Computador {
    private String procesador;
    private int ram;
    private String almacenamiento;
    private String tarjetaGrafica;

}
