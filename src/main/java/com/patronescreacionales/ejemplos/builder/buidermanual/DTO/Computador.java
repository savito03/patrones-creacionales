package com.patronescreacionales.ejemplos.builder.buidermanual.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Computador {
    // Atributos de la computadora
    private String procesador;
    private int ram;
    private String almacenamiento;
    private String tarjetaGrafica;

    // Constructor privado para asegurar que solo se pueda construir a través del Builder
    private Computador(ComputadorBuilder builder) {
        this.procesador = builder.procesador;
        this.ram = builder.ram;
        this.almacenamiento = builder.almacenamiento;
        this.tarjetaGrafica = builder.tarjetaGrafica;
    }

    // Métodos getter
    public String getProcesador() {
        return procesador;
    }

    public int getRam() {
        return ram;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    // Clase estática Builder
    public static class ComputadorBuilder {
        private String procesador;
        private int ram;
        private String almacenamiento;
        private String tarjetaGrafica;

        // Métodos del Builder para setear cada atributo
        public ComputadorBuilder setProcesador(String procesador) {
            this.procesador = procesador;
            return this;
        }

        public ComputadorBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputadorBuilder setAlmacenamiento(String almacenamiento) {
            this.almacenamiento = almacenamiento;
            return this;
        }

        public ComputadorBuilder setTarjetaGrafica(String tarjetaGrafica) {
            this.tarjetaGrafica = tarjetaGrafica;
            return this;
        }

        // Método para construir el objeto Computadora
        public Computador build() {
            return new Computador(this);
        }
    }
}