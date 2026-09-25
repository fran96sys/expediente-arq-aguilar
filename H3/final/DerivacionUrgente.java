package finalh3;

public class DerivacionUrgente
        implements EstrategiaDerivacion {

    @Override
    public void ejecutar(
            String documento,
            String destinatario) {

        System.out.println(
            "Derivación URGENTE: "
            + documento
            + " -> "
            + destinatario
        );
    }
}