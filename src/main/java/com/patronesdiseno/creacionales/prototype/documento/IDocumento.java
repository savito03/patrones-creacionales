package com.patronesdiseno.creacionales.prototype.documento;

public interface IDocumento extends Cloneable {

    IDocumento clone();

    void print();

    void guardarDocumento();
}
