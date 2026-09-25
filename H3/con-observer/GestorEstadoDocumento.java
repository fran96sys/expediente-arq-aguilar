package conobserver;

import java.util.ArrayList;
import java.util.List;

public class GestorEstadoDocumento implements Sujeto {

    private final List<Observador> observadores =
        new ArrayList<>();

    private String documento;
    private String estado;

    public GestorEstadoDocumento(String documento) {
        this.documento = documento;
        this.estado = "REGISTRADO";
    }

    public void cambiarEstado(String nuevoEstado) {

        this.estado = nuevoEstado;

        notificarObservadores();
    }

    @Override
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {

        for (Observador observador : observadores) {
            observador.actualizar(documento, estado);
        }
    }
}