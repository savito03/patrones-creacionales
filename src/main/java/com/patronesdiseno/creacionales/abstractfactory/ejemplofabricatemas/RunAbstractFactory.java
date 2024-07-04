package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.fabricasconcreta.TemaOscuroFactory;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.fabricaabstracta.ITemaFactory;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.fabricasconcreta.TemaClaroFactory;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.ITitulo;
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
