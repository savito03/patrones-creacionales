package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.fabricasconcreta;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.fabricaabstracta.ITemaFactory;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.IBoton;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.IFondo;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.ITitulo;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productosconcretos.BotonModoClaro;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productosconcretos.FondoModoClaro;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productosconcretos.TituloModoClaro;

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
