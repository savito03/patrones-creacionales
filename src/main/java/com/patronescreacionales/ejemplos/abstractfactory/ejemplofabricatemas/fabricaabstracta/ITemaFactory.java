package com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.fabricaabstracta;

import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productoabstracto.IBoton;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productoabstracto.IFondo;
import com.patronescreacionales.ejemplos.abstractfactory.ejemplofabricatemas.productoabstracto.ITitulo;

public interface ITemaFactory {

    public IBoton implementarBoton();

    public ITitulo implementarTitulo();

    public IFondo implementarFondo();
}
