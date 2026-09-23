//Patrón de diseño — Observer

//Requerimiento que pide el patrón

El requerimiento que lleva directamente a utilizar un patrón es:

> Cuando un pedido queda preparado, el estudiante debe recibir un aviso.

Esto significa que cuando ocurre un cambio importante en el pedido, otros objetos tienen que enterarse.

//Patrón elegido

--Observer--

//¿Cómo lo aplico?

Tengo un objeto que detecta el evento y otros objetos que quieren recibir ese evento.

En este caso:

* `PedidoPreparadoSubject` es el Subject.
* `Notificador` es la interfaz del Observer.
* `NotificadorEstudiante` es un Observer concreto.
* `Pedido` es el objeto que tiene el estado.

La idea sería:

```text
Pedido
  |
  | cambia a PREPARADO
  v
PedidoPreparadoSubject
  |
  | notificar()
  v
Notificador
  |
  v
NotificadorEstudiante
  |
  v
Estudiante
```

//Código corto

```java
interface Notificador {

    void actualizar(Pedido pedido);
}

class Pedido {

    private int id;
    private String estado;

    public Pedido(int id) {
        this.id = id;
        this.estado = "SOLICITADO";
    }

    public int getId() {
        return id;
    }

    public void preparar() {
        estado = "PREPARADO";
    }
}

class PedidoPreparadoSubject {

    private final List<Notificador> observadores =
            new ArrayList<>();

    public void suscribir(Notificador observador) {
        observadores.add(observador);
    }

    public void desuscribir(Notificador observador) {
        observadores.remove(observador);
    }

    public void notificar(Pedido pedido) {

        for (Notificador observador : observadores) {
            observador.actualizar(pedido);
        }
    }
}

class NotificadorEstudiante implements Notificador {

    @Override
    public void actualizar(Pedido pedido) {

        System.out.println(
                "Aviso: el pedido "
                        + pedido.getId()
                        + " está preparado."
        );
    }
}
```

//¿Por qué Observer?

Porque el problema real del comedor es que un cambio en el pedido puede generar una reacción en otro objeto.

Cuando el pedido queda preparado, no quiero que el pedido tenga que saber si el aviso se manda por correo, WhatsApp o una notificación del sistema.

El pedido solamente cambia de estado y se informa del evento.

Después puedo agregar otro observador sin cambiar la lógica principal.

Por ejemplo:

```text
PedidoPreparadoSubject
        |
        +----> NotificadorEstudiante
        |
        +----> NotificadorCorreo
        |
        +----> NotificadorWhatsApp
```

//¿Qué pasa si no uso Observer?

Podría hacer que `GestorDePedidos` llame directamente al correo:

```text
Pedido preparado
      |
      v
GestorDePedidos
      |
      v
CorreoUniversitario
```

Pero si después quiero agregar WhatsApp tendría que modificar el gestor nuevamente.

Con Observer, los observadores se pueden agregar de forma independiente.

//Relación con el diagrama

El patrón aparece también en `diagrama.md` mediante:

* `PedidoPreparadoSubject`
* `Notificador`
* `NotificadorEstudiante`

Así el patrón no está separado del diseño general, sino que forma parte del sistema de Sabor Andino.
