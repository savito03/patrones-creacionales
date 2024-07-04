package com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.fabricasconcreta;

import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.fabricaabstracta.ITemaFactory;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.IBoton;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.IFondo;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productoabstracto.ITitulo;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productosconcretos.BotonModoOscuro;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productosconcretos.FondoModoOscuro;
import com.patronesdiseno.creacionales.abstractfactory.ejemplofabricatemas.productosconcretos.TituloModoOscuro;

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
