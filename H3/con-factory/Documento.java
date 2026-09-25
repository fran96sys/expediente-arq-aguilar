package confactory;

public abstract class Documento {

    protected String numero;
    protected String asunto;

    public Documento(String numero, String asunto) {
        this.numero = numero;
        this.asunto = asunto;
    }

    public abstract void procesar();

    public String getNumero() {
        return numero;
    }

    public String getAsunto() {
        return asunto;
    }
}