package conbuilder;

public class Documento {

    private final String numero;
    private final String asunto;
    private final String tipo;
    private final String prioridad;
    private final String remitente;
    private final String destinatario;

    private Documento(DocumentoBuilder builder) {
        this.numero = builder.numero;
        this.asunto = builder.asunto;
        this.tipo = builder.tipo;
        this.prioridad = builder.prioridad;
        this.remitente = builder.remitente;
        this.destinatario = builder.destinatario;
    }

    public static class DocumentoBuilder {

        private String numero;
        private String asunto;
        private String tipo;
        private String prioridad;
        private String remitente;
        private String destinatario;

        public DocumentoBuilder numero(String numero) {
            this.numero = numero;
            return this;
        }

        public DocumentoBuilder asunto(String asunto) {
            this.asunto = asunto;
            return this;
        }

        public DocumentoBuilder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public DocumentoBuilder prioridad(String prioridad) {
            this.prioridad = prioridad;
            return this;
        }

        public DocumentoBuilder remitente(String remitente) {
            this.remitente = remitente;
            return this;
        }

        public DocumentoBuilder destinatario(String destinatario) {
            this.destinatario = destinatario;
            return this;
        }

        public Documento build() {
            if (numero == null || asunto == null) {
                throw new IllegalStateException(
                    "Numero y asunto son obligatorios"
                );
            }

            return new Documento(this);
        }
    }
}