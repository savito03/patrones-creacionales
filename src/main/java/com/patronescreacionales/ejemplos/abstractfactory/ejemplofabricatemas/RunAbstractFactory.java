package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.fabricaabstracta.ITemaFactory;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.fabricasconcreta.TemaClaroFactory;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.fabricasconcreta.TemaOscuroFactory;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productoabstracto.ITitulo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunAbstractFactory {


    public static void main(String[] args) {

        ITemaFactory temaClaroFactory = new TemaClaroFactory();
        ITitulo iTituloClaro = temaClaroFactory.implementarTitulo();
        iTituloClaro.mostrarTipo();

        ITemaFactory temaOscuroFactory = new TemaOscuroFactory();
        ITitulo iTituloOscuro = temaOscuroFactory.implementarTitulo();
        iTituloOscuro.mostrarTipo();
    }

}
