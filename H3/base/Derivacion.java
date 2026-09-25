package base;

public class Derivacion {

    private Documento documento;
    private Usuario destinatario;

    public Derivacion(Documento documento, Usuario destinatario) {
        this.documento = documento;
        this.destinatario = destinatario;
    }

    public void ejecutar() {
        documento.cambiarEstado("DERIVADO");

        System.out.println(
            "Documento " + documento.getNumero()
            + " derivado a " + destinatario.getNombre()
            + " - Unidad: " + destinatario.getUnidad().getNombre()
        );
    }

    public Documento getDocumento() {
        return documento;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }
}