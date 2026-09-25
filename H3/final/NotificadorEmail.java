package finalh3;

public class NotificadorEmail implements Observador {

    @Override
    public void actualizar(
            String documento,
            String estado) {

        System.out.println(
            "EMAIL: documento "
            + documento
            + " ahora está "
            + estado
        );
    }
}