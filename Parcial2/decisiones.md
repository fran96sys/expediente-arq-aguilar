### Situación 1 — Vencimiento de membresías

Patrón elegido: Observer, Lo usaría porque cuando una membresía vence, varios módulos necesitan enterarse, como WhatsApp, Vencidos y Recepción. En lugar de que Socios llame directamente a cada uno, los módulos se suscriben y reciben la notificación. Si no se aplica, cada nuevo módulo obligaría a modificar Socios y aumentaría el acoplamiento.

### Situación 2 — Cálculo de tarifas
Patrón elegido: Strategy,Lo usaría porque el cálculo cambia según la franja horaria y las reglas pueden cambiar cada temporada. Cada forma de calcular la tarifa puede estar en una estrategia diferente, evitando tener muchos `if/else` dentro de Cobros. También evita repetir la misma lógica en Cotizaciones y Cobros.

### Situación 3 — Pasarela de pagos

Patrón elegido: Adapter, Lo usaría porque la pasarela tiene una interfaz diferente a la que maneja nuestro sistema, por ejemplo, montos en centavos y nombres de métodos en inglés. El Adapter permite traducir esa interfaz a una que entienda nuestro dominio. Así, si después cambiamos de proveedor, no sería necesario modificar todo el sistema.

## P2.3 — Conexión SOLID

Mi implementación de Observer se relaciona con el principio **Open/Closed Principle (OCP)**, porque permite agregar nuevos módulos interesados sin modificar la clase que notifica. La decisión concreta es que `NotificadorMembresias` trabaja con el contrato `ObservadorVencimiento` y no directamente con WhatsApp o Recepción. Así, para agregar Promociones solo se crea otra implementación y se suscribe.
