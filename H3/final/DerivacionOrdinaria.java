package finalh3;

public class DerivacionOrdinaria
        implements EstrategiaDerivacion {

    @Override
    public void ejecutar(
            String documento,
            String destinatario) {

        System.out.println(
            "Derivación ORDINARIA: "
            + documento
            + " -> "
            + destinatario
        );
    }
}