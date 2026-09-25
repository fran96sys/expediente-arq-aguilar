package condecorator;

public class ProcesadorDocumentoBase
        implements ProcesadorDocumento {

    @Override
    public void procesar(String documento) {

        System.out.println(
            "Procesando documento: " + documento
        );
    }
}