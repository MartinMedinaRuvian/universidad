package Interfaces;

import Negocio.Alumno;
import Negocio.Asignatura;

public interface ReglasNegocio {

    //CRUD ALUMNOS
    public boolean agregarAlumno(Alumno alumno);
    public void eliminarAlumno(int DNI); 
    public void modificarAlumno(int DNI, Alumno infoNueva);
    public Alumno consultarAlumno(int DNI);
    public String verAlumnos();

    //CRUD ASIGNATURA
    public boolean agregarAsignatura(Asignatura asignatura);
    public void eliminarAsignatura(int codigo);
    public void modificarAsignatura(int codigo, Asignatura infoNueva);
    public Asignatura consultarAsignatura(int codigo);
    public String verAsignaturas();
    
    //METODOS VARIOS
    public void matricularAsignaruta(int DNIAlumno, int codigoAsignatura);
    public String verAsignarutaMatriculadas(int DNIAlumno);
    public String conocerAlumnosMatriculadosAsignatura(int codigoAsignaturaConsultar);

}
