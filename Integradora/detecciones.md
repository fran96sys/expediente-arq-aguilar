//Detección de violaciones SOLID

En el esqueleto recibido encontré tres problemas relacionados con SOLID.

1. SRP — Single Responsibility Principle

Dónde: `GestorDePedidos.ProcesarPedido()`.

Por qué: la clase está haciendo varias cosas al mismo tiempo. Calcula el precio, guarda el pedido en la base de datos, imprime el vale y además envía el correo.

Si cambia cualquiera de esas partes, tengo que modificar `GestorDePedidos`.

----

2. OCP — Open/Closed Principle

Dónde: en el `switch (tipoMenu)` de `ProcesarPedido()`.

Por qué: si aparece un nuevo tipo de menú, por ejemplo `especial`, tengo que entrar a la clase y agregar otro `case`.

Eso significa que cada nuevo tipo de menú obliga a modificar el código existente.

---

3. DIP — Dependency Inversion Principle

Dónde: dentro de `GestorDePedidos`, específicamente:

```java
new BaseDeDatosComedor();
new CorreoUniversitario();
```

Por qué: `GestorDePedidos` depende directamente de clases concretas.

Si después quiero cambiar la base de datos o cambiar el correo por WhatsApp u otra forma de notificación, tendría que modificar el gestor.

Lo correcto es que el gestor dependa de abstracciones y que las implementaciones concretas se le pasen desde afuera.
