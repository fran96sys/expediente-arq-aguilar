package conobserver;

public class NotificadorEmail implements Observador {

    @Override
    public void actualizar(String documento, String estado) {

        System.out.println(
            "Email: documento " + documento
            + " cambió a estado " + estado
        );
    }
}