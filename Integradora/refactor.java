package integradora.comedor;
import java.util.ArrayList;
import java.util.List;
// Refactor: Franclin Aguilar Cayo

interface RepositorioPedidos {

    void guardarPedido(
            String estudiante,
            String tipoMenu,
            int cantidad,
            double total
    );
}

interface Notificador {

    void enviar(String mensaje);
}

class BaseDeDatosComedor implements RepositorioPedidos {

    @Override
    public void guardarPedido(
            String estudiante,
            String tipoMenu,
            int cantidad,
            double total
    ) {

        System.out.println(
                "[BD] Guardando pedido: "
                        + estudiante
                        + " - "
                        + tipoMenu
                        + " - cantidad: "
                        + cantidad
                        + " - total: "
                        + total
        );
    }
}

class CorreoUniversitario implements Notificador {

    @Override
    public void enviar(String mensaje) {

        System.out.println(
                "[CORREO] " + mensaje
        );
    }
}

public class GestorDePedidos {

    private final RepositorioPedidos repositorio;
    private final Notificador notificador;

    public GestorDePedidos(
            RepositorioPedidos repositorio,
            Notificador notificador
    ) {

        this.repositorio = repositorio;
        this.notificador = notificador;
    }

    public void procesarPedido(
            String estudiante,
            String tipoMenu,
            int cantidad
    ) {

        double precioBase;

        // Mantengo el switch porque en este archivo
        // solamente estoy curando la violación DIP.

        switch (tipoMenu) {

            case "estandar":
                precioBase = 12;
                break;

            case "vegetariano":
                precioBase = 14;
                break;

            case "beca":
                precioBase = 5;
                break;

            default:
                precioBase = 12;
                break;
        }

        double total = precioBase * cantidad;

        repositorio.guardarPedido(
                estudiante,
                tipoMenu,
                cantidad,
                total
        );

        System.out.println(
                "----- VALE DE COMEDOR -----"
        );

        System.out.println(
                estudiante
                        + ": "
                        + cantidad
                        + " x menú "
                        + tipoMenu
        );

        System.out.println(
                "TOTAL: "
                        + String.format("%.2f", total)
                        + " Bs"
        );

        notificador.enviar(
                "Pedido registrado: "
                        + cantidad
                        + " x "
                        + tipoMenu
                        + ", "
                        + estudiante
        );
    }

    public static void main(String[] args) {

        RepositorioPedidos repositorio =
                new BaseDeDatosComedor();

        Notificador notificador =
                new CorreoUniversitario();

        GestorDePedidos gestor =
                new GestorDePedidos(
                        repositorio,
                        notificador
                );

        gestor.procesarPedido(
                "Noelia",
                "vegetariano",
                2
        );
    }
}
```

## Qué se modificó

En el código original `GestorDePedidos` creaba directamente:

```java
new BaseDeDatosComedor();
new CorreoUniversitario();
```

Ahora trabaja con:

```java
RepositorioPedidos
Notificador
```

Las implementaciones concretas se pasan mediante el constructor.

De esta manera `GestorDePedidos` ya no depende directamente de una implementación concreta.

En este refactor solamente se corrigió **DIP**, mientras que las otras dos violaciones se mantienen porque la consigna pide detectar las tres y curar solamente una.
