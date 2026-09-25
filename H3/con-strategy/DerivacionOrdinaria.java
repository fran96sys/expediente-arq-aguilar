package constrategy;

public class DerivacionOrdinaria
        implements EstrategiaDerivacion {

    @Override
    public void derivar(
            String documento,
            String destinatario) {

        System.out.println(
            "Derivación ordinaria de "
            + documento
            + " a "
            + destinatario
        );
    }
}