package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.fabricaabstracta;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.IBoton;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.IFondo;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.ITitulo;

public interface ITemaFactory {

    public IBoton implementarBoton();

    public ITitulo implementarTitulo();

    public IFondo implementarFondo();
}
