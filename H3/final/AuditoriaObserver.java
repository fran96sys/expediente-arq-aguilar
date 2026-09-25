package finalh3;

public class AuditoriaObserver implements Observador {

    @Override
    public void actualizar(
            String documento,
            String estado) {

        System.out.println(
            "AUDITORÍA: "
            + documento
            + " -> "
            + estado
        );
    }
}