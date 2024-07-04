package com.patronesdiseno.creacionales.prototype;

import com.patronesdiseno.creacionales.prototype.formasdocumento.Contrato;
import com.patronesdiseno.creacionales.prototype.formasdocumento.Reporte;
import com.patronesdiseno.creacionales.prototype.documento.IDocumento;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunPrototype {

    public static void main(String[] args) {

        // Crear prototipos de documentos
        Reporte reportePrototype = new Reporte("Reporte mensual", "Contenido del reporte mensual");
        Reporte reporteClone1 = reportePrototype.clone();


        Contrato contractoPrototype = new Contrato("Colaborador", "Compañía", "Terminos del contrato", Boolean.FALSE);
        IDocumento contractoClone1 = contractoPrototype.clone();

        //Para modificar un elemento de la copia cuando retonó la interfaz común, toca hacerle el casteo para poder acceder a sus atributos y métodos específicos del objeto
        IDocumento contractoClone2 = contractoPrototype.clone();
        ((Contrato) contractoClone2).setCopia(Boolean.TRUE);

        reporteClone1.print();
        System.out.println("");
        contractoClone1.print();
        System.out.println("");
        contractoClone2.print();

        System.out.println("Original " +contractoPrototype.getCopia());
        System.out.println("Copia " + ((Contrato)contractoClone2).getCopia());
        System.out.println(contractoClone1 == contractoClone2);

    }

}
