package Negocio;

public class Asignatura {
    
    private int codigo;
    private String nombre;
    private int numeroCreditos;

    public Asignatura() {
    }

    public Asignatura(int codigo, String nombre, int numeroCreditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    @Override
    public String toString() {
        return  "codigo=" + codigo + ", nombre=" + nombre + ", numeroCreditos=" + numeroCreditos;
    }
    
    
    
}
