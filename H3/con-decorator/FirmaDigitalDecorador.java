package condecorator;

public class FirmaDigitalDecorator
        implements ProcesadorDocumento {

    private final ProcesadorDocumento procesador;

    public FirmaDigitalDecorator(
            ProcesadorDocumento procesador) {

        this.procesador = procesador;
    }

    @Override
    public void procesar(String documento) {

        procesador.procesar(documento);

        System.out.println(
            "Aplicando firma digital al documento: "
            + documento
        );
    }
}