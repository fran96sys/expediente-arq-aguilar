# Observer

Observer permite notificar automáticamente a diferentes componentes cuando cambia el estado de un documento.

GestorEstadoDocumento actúa como Subject.

NotificadorEmail y AuditoriaObserver actúan como Observers.

El Subject no necesita conocer directamente la implementación concreta de cada observador.