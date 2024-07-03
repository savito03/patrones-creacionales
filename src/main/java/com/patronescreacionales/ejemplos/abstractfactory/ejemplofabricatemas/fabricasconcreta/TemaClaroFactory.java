package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.fabricasconcreta;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.fabricaabstracta.ITemaFactory;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productoabstracto.IBoton;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productoabstracto.IFondo;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productoabstracto.ITitulo;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productosconcretos.BotonModoClaro;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productosconcretos.FondoModoClaro;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productosconcretos.TituloModoClaro;

public class TemaClaroFactory implements ITemaFactory {

    @Override
    public IBoton implementarBoton() {
        return new BotonModoClaro();
    }

    @Override
    public ITitulo implementarTitulo() {
        return new TituloModoClaro();
    }

    @Override
    public IFondo implementarFondo() {
        return new FondoModoClaro();
    }
}
