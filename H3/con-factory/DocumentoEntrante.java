package confactory;

public class DocumentoEntrante extends Documento {

    public DocumentoEntrante(String numero, String asunto) {
        super(numero, asunto);
    }

    @Override
    public void procesar() {
        System.out.println("Procesando documento entrante: " + numero);
    }
}