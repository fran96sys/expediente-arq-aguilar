package conadapter;

public class SistemaNotificacionExterno {

    public void enviarMensajeExterno(String contenido) {
        System.out.println(
            "Servicio externo: " + contenido
        );
    }
}