P1 Detecciones 
Principio, Dónde vive y por qué es una violación: 
I   
Interface Segregation: 
IEmpleadoDeFarmacia y Cajero, La interfaz tiene varios métodos, pero el Cajero no necesita 
hacer todos e Igual está obligado a implementarlos y termina lanzando excepciones. Sería 
mejor separar la interfaz según las funciones que realmente necesita cada empleado. 
L        
Liskov Substitution: 
Cajero.AutorizarVentaControlada(), AjustarPrecio() y VerLibroDeControlados(), Cajero 
implementa IEmpleadoDeFarmacia, pero no puede realizar algunas funciones que esa 
interfaz define. En lugar de cumplirlas lanza una excepción, por lo que no se puede usar un 
Cajero como cualquier otro empleado de farmacia sin tener problemas. 
O  
Open/Closed: 
GestorDePedidos.ProcesarPedido() El método tiene un switch para decidir el descuento 
según el tipo de cliente. Si mañana se agrega otro tipo de cliente con otro descuento, 
tenemos que modificar este método. 
D   
Dependency Inversion: 
GestorDePedidos.ProcesarPedido(), GestorDePedidos crea directamente 
BaseDeDatosMySql y CorreoSmtp. por lo que queda amarrado a esas implementaciones. Se 
corrige haciendo que GestorDePedidos dependa de interfaces y reciba esas dependencias 
mediante el constructor, permitiendo cambiar las implementaciones sin modificar la clase.