import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Franclin Aguilar Cayo

// Contrato que deben cumplir los módulos interesados
interface ObservadorVencimiento {
    void actualizar(String nombreSocio, LocalDate fechaVencimiento);
}

// Clase que avisa cuando una membresía vence
class NotificadorMembresias {

    private List<ObservadorVencimiento> observadores = new ArrayList<>();

    public void suscribir(ObservadorVencimiento observador) {
        observadores.add(observador);
    }

    public void notificarVencimiento(String nombreSocio, LocalDate fechaVencimiento) {
        for (ObservadorVencimiento observador : observadores) {
            observador.actualizar(nombreSocio, fechaVencimiento);
        }
    }
}

// Módulo de WhatsApp
class ModuloWhatsApp implements ObservadorVencimiento {

    @Override
    public void actualizar(String nombreSocio, LocalDate fechaVencimiento) {
        System.out.println(
                "WhatsApp: Enviar aviso a " + nombreSocio
                + " porque su membresía venció el "
                + fechaVencimiento
        );
    }
}

// Módulo de Recepción
class ModuloRecepcion implements ObservadorVencimiento {

    @Override
    public void actualizar(String nombreSocio, LocalDate fechaVencimiento) {
        System.out.println(
                "Recepción: Mostrar aviso de membresía vencida para "
                + nombreSocio
        );
    }
}

// uso
public class Solucion {

    public static void main(String[] args) {

        NotificadorMembresias notificador = new NotificadorMembresias();

        ModuloWhatsApp whatsapp = new ModuloWhatsApp();
        ModuloRecepcion recepcion = new ModuloRecepcion();

        notificador.suscribir(whatsapp);
        notificador.suscribir(recepcion);

        notificador.notificarVencimiento(
                "Carlos Mendoza",
                LocalDate.of(2026, 9, 15)
        );
    }
}