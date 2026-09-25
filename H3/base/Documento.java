package base;

public class Documento {

    private String numero;
    private String asunto;
    private String tipo;
    private String prioridad;
    private String estado;

    public Documento(String numero, String asunto, String tipo, String prioridad) {
        this.numero = numero;
        this.asunto = asunto;
        this.tipo = tipo;
        this.prioridad = prioridad;
        this.estado = "REGISTRADO";
    }

    public void cambiarEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getEstado() {
        return estado;
    }
}