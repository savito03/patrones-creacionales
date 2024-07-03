package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.fabricasconcreta;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.fabricaabstracta.ITemaFactory;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productoabstracto.IBoton;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productoabstracto.IFondo;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productoabstracto.ITitulo;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productosconcretos.BotonModoOscuro;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productosconcretos.FondoModoOscuro;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productosconcretos.TituloModoOscuro;

public class TemaOscuroFactory implements ITemaFactory {

    @Override
    public IBoton implementarBoton() {
        return new BotonModoOscuro();
    }

    @Override
    public ITitulo implementarTitulo() {
        return new TituloModoOscuro();
    }

    @Override
    public IFondo implementarFondo() {
        return new FondoModoOscuro();
    }
}
