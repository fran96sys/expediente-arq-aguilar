package constrategy;

public class DerivacionUrgente
        implements EstrategiaDerivacion {

    @Override
    public void derivar(
            String documento,
            String destinatario) {

        System.out.println(
            "DERIVACIÓN URGENTE de "
            + documento
            + " a "
            + destinatario
        );
    }
}