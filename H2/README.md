## Contexto

El diseño inicial del sistema de correspondencia concentraba varias responsabilidades en una clase principal encargada de registrar documentos, crear hojas de ruta, realizar derivaciones, generar reportes y enviar notificaciones.

## Cambios realizados

1. Se dividió la clase `GestorCorrespondencia` en servicios especializados como `DocumentoService`, `DerivacionService` y `ReporteService`, aplicando el principio de Responsabilidad Única (SRP).
2. Se reemplazó la lógica centralizada de procesamiento por tipo mediante el contrato `TipoDocumentoProcessor`, permitiendo agregar nuevas implementaciones sin modificar el servicio principal (OCP).
3. Se definieron interfaces para repositorios y notificaciones, de modo que los servicios dependan de abstracciones y no de clases concretas (DIP).
4. Se separaron las responsabilidades de negocio, persistencia y notificación para disminuir el acoplamiento.
5. El diseño posterior facilita las pruebas, el mantenimiento y la ampliación del sistema.

## Evolución respecto al H1

El H1 representó una primera aproximación conceptual del sistema. Durante el desarrollo se refinaron algunos nombres y responsabilidades, por ejemplo, el concepto inicial de `Área` se concretó como `Unidad`, y la derivación pasó a considerar tanto la unidad destinataria como el funcionario responsable.
