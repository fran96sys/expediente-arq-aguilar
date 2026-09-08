// CORRECCIÓN I — Interface Segregation
// FRANCLIN AGUILAR CAYO
// pd: lo hice en java, pero entrego en un archivo.cs
interface IRegistrarPedido {
    void registrarPedido(String medicamento, int cantidad);
}

interface IAutorizarVentaControlada {
    void autorizarVentaControlada(String medicamento);
}

interface IAjustarPrecio {
    void ajustarPrecio(String medicamento, double nuevoPrecio);
}

interface IVerLibroDeControlados {
    void verLibroDeControlados();
}

class Cajero implements IRegistrarPedido {

    public void registrarPedido(String medicamento, int cantidad) {
        System.out.println("[CAJA] Pedido: " + cantidad + " x " + medicamento);
    }
}
class Farmaceutico // implementa todos los métodos a diferencia de un cajero

// CORRECCIÓN D — Dependency Inversion
// FRANCLIN AGUILAR CAYO

interface IBaseDeDatos {
    void guardarPedido(String cliente, String medicamento,
                       int cantidad, double total);
}
interface ICorreo {
    void enviar(String mensaje);
}

class GestorDePedidos {

    private IBaseDeDatos baseDeDatos;
    private ICorreo correo;

    public GestorDePedidos(IBaseDeDatos baseDeDatos, ICorreo correo) {
        this.baseDeDatos = baseDeDatos;
        this.correo = correo;
    }
}

