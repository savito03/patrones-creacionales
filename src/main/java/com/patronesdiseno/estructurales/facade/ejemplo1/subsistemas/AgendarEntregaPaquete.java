package com.patronesdiseno.estructurales.facade.ejemplo1.subsistemas;

public class AgendarEntregaPaquete {

    public void agendarEntrega(String numeroPaquete, String destino, String destinatario) {
        System.out.println("Agendando entrega del paquete " + numeroPaquete + " con destino a " + destino + " .");
        System.out.println("Destinatario: " + destinatario);

    }
}
