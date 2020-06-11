package Control;

import Interfaces.ReglasNegocio;
import Negocio.Alumno;
import Negocio.Asignatura;
import Negocio.Universidad;

public class ControlNegocio implements ReglasNegocio{
    
    private Universidad universidad = new Universidad();

    @Override
    public boolean agregarAlumno(Alumno alumno) {
        return universidad.agregarAlumno(alumno);
    }

    @Override
    public void eliminarAlumno(int DNI) {
       universidad.eliminarAlumno(DNI);
    }

    @Override
    public void modificarAlumno(int DNI, Alumno infoNueva) {
      universidad.modificarAlumno(DNI, infoNueva);
    }

    @Override
    public Alumno consultarAlumno(int DNI) {
        return universidad.consultarAlumno(DNI);
    }

    @Override
    public String verAlumnos() {
        return universidad.verAlumnos();
    }

    @Override
    public boolean agregarAsignatura(Asignatura asignatura) {
      return universidad.agregarAsignatura(asignatura);
    }

    @Override
    public void eliminarAsignatura(int codigo) {
       universidad.eliminarAsignatura(codigo);
    }

    @Override
    public void modificarAsignatura(int codigo, Asignatura infoNueva) {
      universidad.modificarAsignaturas(codigo, infoNueva);
    }

    @Override
    public Asignatura consultarAsignatura(int codigo) {
        return universidad.consultarAsignatura(codigo);
    }

    @Override
    public String verAsignaturas() {
        return universidad.verAsignaturas();
    }

    @Override
    public void matricularAsignaruta(int DNIAlumno, int codigoAsignatura) {
      universidad.matricularAsignatura(DNIAlumno, codigoAsignatura);
    }

    @Override
    public String verAsignarutaMatriculadas(int DNIAlumno) {
        return universidad.verMateriasMatriculadas(DNIAlumno);
    }

    @Override
    public String conocerAlumnosMatriculadosAsignatura(int codigoAsignaturaConsultar) {
        return universidad.conocerAlumnosMatriculadosAsignatura(codigoAsignaturaConsultar);
    }
  
}
