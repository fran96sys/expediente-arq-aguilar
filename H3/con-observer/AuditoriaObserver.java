package conobserver;

public class AuditoriaObserver implements Observador {

    @Override
    public void actualizar(String documento, String estado) {

        System.out.println(
            "Auditoría: documento " + documento
            + " -> " + estado
        );
    }
}