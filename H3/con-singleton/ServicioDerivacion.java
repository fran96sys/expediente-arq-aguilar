package consingleton;

public class ServicioDerivacion {

    public void mostrarConfiguracion() {

        ConfiguracionSistema configuracion =
            ConfiguracionSistema.getInstance();

        System.out.println(
            configuracion.getNombreSistema()
        );
    }
}