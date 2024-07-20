package com.patronesdiseno.estructurales.composite.ejemplo1;

import com.patronesdiseno.creacionales.singleton.ejemplo.ConectarBD;
import com.patronesdiseno.estructurales.composite.ejemplo1.composite.GrupoDeProductos;
import com.patronesdiseno.estructurales.composite.ejemplo1.composite.IProducto;
import com.patronesdiseno.estructurales.composite.ejemplo1.composite.ProductoIndividual;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunComposite {

    public static void main(String[] args) {

        IProducto martillo = new ProductoIndividual("Martillo");
        IProducto destornillador = new ProductoIndividual("Destornillador");

        GrupoDeProductos herramientasManuales = new GrupoDeProductos("Herramientas Manuales");
        herramientasManuales.agregar(martillo);
        herramientasManuales.agregar(destornillador);

        IProducto sierra = new ProductoIndividual("Sierra");
        GrupoDeProductos herramientasElectricas = new GrupoDeProductos("Herramientas Eléctricas");
        herramientasElectricas.agregar(sierra);

        GrupoDeProductos todasLasHerramientas = new GrupoDeProductos("Todas las Herramientas");
        todasLasHerramientas.agregar(herramientasManuales);
        todasLasHerramientas.agregar(herramientasElectricas);

        todasLasHerramientas.mostrar();

    }

}
