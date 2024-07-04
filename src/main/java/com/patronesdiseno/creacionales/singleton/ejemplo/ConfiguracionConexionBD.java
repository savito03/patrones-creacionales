package com.patronesdiseno.creacionales.singleton.ejemplo;

public class ConfiguracionConexionBD {

    // Constructor privado para evitar instanciación directa
    private ConfiguracionConexionBD() {
    }

    // Clase interna estática para la instancia Singleton
    private static class SingletonHelper {
        // La instancia única de la clase
        private static final ConfiguracionConexionBD INSTANCIA = new ConfiguracionConexionBD();
    }

    // Método público para obtener la instancia única
    public static ConfiguracionConexionBD getInstance() {
        return SingletonHelper.INSTANCIA;
    }

    // Método para obtener la conexión (simulada aquí como un String)
    public String getConnection() {
        return "Conexión única a bd";
    }

}
