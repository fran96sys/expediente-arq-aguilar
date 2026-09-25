package conadapter;

public class ServicioDerivacion {

    private final Notificador notificador;

    public ServicioDerivacion(Notificador notificador) {
        this.notificador = notificador;
    }

    public void derivar(String documento) {
        System.out.println(
            "Documento derivado: " + documento
        );

        notificador.notificar(
            "Se realizó una nueva derivación"
        );
    }
}