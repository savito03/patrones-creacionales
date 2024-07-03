package com.patronescreacionales.ejemplos.singleton.ejemplo;

public class ConectarBD {

    /**
     * Ejemplo de obtención de instancia para obtener la conexión
     */
    public void conectar() {
        ConfiguracionConexionBD config = ConfiguracionConexionBD.getInstance();
        String connection = config.getConnection();

        System.out.println(connection);
    }

    /**
     * Ejemplo para comprobar que las dos instancias son la misma
     */
    public void comprobarInstanciaUnica() {

        ConfiguracionConexionBD config = ConfiguracionConexionBD.getInstance();
        ConfiguracionConexionBD configIdentica = ConfiguracionConexionBD.getInstance();

        System.out.println(config.equals(configIdentica));
    }
}
