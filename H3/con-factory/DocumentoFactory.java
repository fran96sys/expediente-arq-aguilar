package confactory;

public class DocumentoFactory {

    public static Documento crear(
            String tipo,
            String numero,
            String asunto) {

        if ("ENTRANTE".equalsIgnoreCase(tipo)) {
            return new DocumentoEntrante(numero, asunto);
        }

        if ("SALIENTE".equalsIgnoreCase(tipo)) {
            return new DocumentoSaliente(numero, asunto);
        }

        throw new IllegalArgumentException(
            "Tipo de documento no soportado: " + tipo
        );
    }
}