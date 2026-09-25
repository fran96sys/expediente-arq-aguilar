package constrategy;

public class GestorDerivacion {

    private EstrategiaDerivacion estrategia;

    public GestorDerivacion(
            EstrategiaDerivacion estrategia) {

        this.estrategia = estrategia;
    }

    public void cambiarEstrategia(
            EstrategiaDerivacion estrategia) {

        this.estrategia = estrategia;
    }

    public void ejecutar(
            String documento,
            String destinatario) {

        estrategia.derivar(documento, destinatario);
    }
}