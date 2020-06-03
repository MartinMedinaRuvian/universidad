
package Negocio;

import java.util.LinkedList;

public class Alumno {
    private String nombre;
    private String apellido;
    private int DNI;
    private String direccion;
    private String email;
    private int edad;
    private LinkedList<Asignatura> asignaturas = new LinkedList<>();

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int DNI, String direccion, String email, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
        this.email = email;
        this.edad = edad;
    }
    
    public void agregarAsignatura(Asignatura asignatura){
        asignaturas.add(asignatura);
    }
    
    public String verAsignaturas(){
        String msg = "";
        for(Asignatura a: asignaturas){
            msg += a.toString() + "\n";
        }
        return msg;
    }
    
    public boolean estaMatriculadoEnAsignatura(int codigo){
        boolean correcto = false;
        
        for(Asignatura a: asignaturas){
            if (a.getCodigo() == codigo) {
                correcto = true;
                break;
            }
        }
        
        return correcto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", direccion=" + direccion + ", email=" + email + ", edad=" + edad;
    }

    
    
    
}
