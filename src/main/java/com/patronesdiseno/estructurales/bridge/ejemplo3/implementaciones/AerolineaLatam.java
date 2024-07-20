package com.patronesdiseno.estructurales.bridge.ejemplo3.implementaciones;

public class AerolineaLatam implements IAerolinea{
    @Override
    public void comprarTiquete() {
        System.out.println("Tiquete comprado aerolínea Latam.");
    }
}
