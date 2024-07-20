package com.patronesdiseno.estructurales.bridge.ejemplo3.implementaciones;

public class AerolineaAvianca implements IAerolinea{
    @Override
    public void comprarTiquete() {
        System.out.println("Tiquete comprado aerolínea Avianca.");
    }
}
