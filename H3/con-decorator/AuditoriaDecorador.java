package condecorator;

public class AuditoriaDecorator
        implements ProcesadorDocumento {

    private final ProcesadorDocumento procesador;

    public AuditoriaDecorator(
            ProcesadorDocumento procesador) {

        this.procesador = procesador;
    }

    @Override
    public void procesar(String documento) {

        procesador.procesar(documento);

        System.out.println(
            "Registrando auditoría del documento: "
            + documento
        );
    }
}