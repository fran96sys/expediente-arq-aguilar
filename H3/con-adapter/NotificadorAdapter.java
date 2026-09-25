package conadapter;

public class NotificadorAdapter implements Notificador {

    private final SistemaNotificacionExterno externo;

    public NotificadorAdapter(
            SistemaNotificacionExterno externo) {
        this.externo = externo;
    }

    @Override
    public void notificar(String mensaje) {
        externo.enviarMensajeExterno(mensaje);
    }
}