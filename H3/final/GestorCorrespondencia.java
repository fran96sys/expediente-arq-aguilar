package finalh3;

import java.util.ArrayList;
import java.util.List;

public class GestorCorrespondencia {

    private EstrategiaDerivacion estrategia;

    private final List<Observador> observadores =
        new ArrayList<>();

    public GestorCorrespondencia(
            EstrategiaDerivacion estrategia) {

        this.estrategia = estrategia;
    }

    public void cambiarEstrategia(
            EstrategiaDerivacion estrategia) {

        this.estrategia = estrategia;
    }

    public void agregarObservador(
            Observador observador) {

        observadores.add(observador);
    }

    public void derivar(
            String documento,
            String destinatario) {

        estrategia.ejecutar(
            documento,
            destinatario
        );

        notificar(documento, "DERIVADO");
    }

    private void notificar(
            String documento,
            String estado) {

        for (Observador observador : observadores) {

            observador.actualizar(
                documento,
                estado
            );
        }
    }
}