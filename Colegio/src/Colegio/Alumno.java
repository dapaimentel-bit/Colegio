package Colegio;

public class Alumno {

    private int id;
    private String nombre;


    public Alumno() {
    }

    // Constructor con parámetros
    public Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getter y Setter de id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter y Setter de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno [id=" + id + ", nombre=" + nombre + "]";
    }
}