package com.patronescreacionales.ejemplos.prototype.ejemplodocumentos.formasdocumento;

import com.patronescreacionales.ejemplos.prototype.ejemplodocumentos.documento.IDocumento;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Reporte implements IDocumento {

    private String titulo;
    private String contenido;

    public Reporte(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    @Override
    public Reporte clone() {
        //Clonado automático usando la interfaz Cloneable
        try {
            return (Reporte) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void print() {
        System.out.println("Título reporte: " + titulo);
        System.out.println("Contenido reporte: " + contenido);
    }

    @Override
    public void guardarDocumento() {
        System.out.println("Guardando reporte.");
    }
}
