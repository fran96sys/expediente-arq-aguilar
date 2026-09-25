package consingleton;

public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;

    private String nombreSistema;

    private ConfiguracionSistema() {
        nombreSistema = "Sistema de Gestión de Correspondencia";
    }

    public static synchronized ConfiguracionSistema getInstance() {

        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }

        return instancia;
    }

    public String getNombreSistema() {
        return nombreSistema;
    }
}