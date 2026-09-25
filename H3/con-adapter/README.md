# Adapter

Adapter permite utilizar un sistema externo cuya interfaz no coincide con la interfaz esperada por nuestro sistema.

Nuestro sistema espera Notificador.notificar().

El sistema externo ofrece enviarMensajeExterno().

NotificadorAdapter traduce una llamada a la otra sin modificar el sistema externo.

Esto reduce el acoplamiento entre nuestra aplicación y la implementación externa.