package com.patronescreacionales.ejemplos.prototype.ejemplodocumentos.documento;

public interface IDocumento extends Cloneable {

    IDocumento clone();

    void print();

    void guardarDocumento();
}
