package com.patronesdiseno.creacionales.prototype.formasdocumento;

import com.patronesdiseno.creacionales.prototype.documento.IDocumento;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contrato implements IDocumento {

    private String parteAContrato;
    private String parteBContrato;
    private String terminos;
    private Boolean copia;

    /**
     *
     * @param parteAContrato persona / empresa
     * @param parteBContrato persona / empresa
     * @param terminos términos y condiciones
     */
    public Contrato(String parteAContrato, String parteBContrato, String terminos, Boolean copia) {
        this.parteAContrato = parteAContrato;
        this.parteBContrato = parteBContrato;
        this.terminos = terminos;
        this.copia = copia;
    }

    @Override
    public IDocumento clone() {
        //Clonado manual usando el constructor
        return new Contrato(this.parteAContrato, this.parteBContrato, this.terminos, this.copia);
    }

    @Override
    public void print() {
        System.out.println("Contrato entre las partes: " + parteAContrato + " and " + parteBContrato);
        System.out.println("Terminos: " + terminos);
    }

    @Override
    public void guardarDocumento() {
        System.out.println("Guardando contrato.");
    }
}
