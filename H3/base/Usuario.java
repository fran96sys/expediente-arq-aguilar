package base;

public class Usuario {

    private Long id;
    private String nombre;
    private Unidad unidad;

    public Usuario(Long id, String nombre, Unidad unidad) {
        this.id = id;
        this.nombre = nombre;
        this.unidad = unidad;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Unidad getUnidad() {
        return unidad;
    }
}