package Control;

import Negocio.Alumno;
import Negocio.Asignatura;

public class ControlVista {
  private ControlNegocio control = new ControlNegocio();
  
  //INICIO CRUD ALUMNO
  public boolean agregarAlumno(String nombre, String apellido, int DNI, String direccion, String email, int edad){
     return control.agregarAlumno(new Alumno(nombre, apellido, DNI, direccion, email, edad));
  }
  
  public void eliminarAlumno(int DNI){
      control.eliminarAlumno(DNI);
  }
  
  public void modificarAlumno(int DNI, String nuevoNombre, String nuevoApellido, int nuevoDNI, String nuevaDireccion, String nuevoEmail, int nuevaEdad){
      
      Alumno infoNueva = new Alumno(nuevoNombre, nuevoApellido, nuevoDNI, nuevaDireccion, nuevoEmail, nuevaEdad);
      
      control.modificarAlumno(DNI, infoNueva);
  }
  
  public String consultarAlumno(int DNI){
      String msg = "";
      if (control.consultarAlumno(DNI) != null) {
          msg = control.consultarAlumno(DNI).toString();
      }else{
          msg = "No existe el alumno con DNI " + DNI;
      }
      return msg;
  }
  
  public String verAlumnos(){
      return control.verAlumnos();
  }
  //FIN CRUD ALUMNO
  
  //INICIO CRUD ASIGNATURA
  public boolean agregarAsignatura(int codigo, String nombre, int numeroCreditos){
    return control.agregarAsignatura(new Asignatura(codigo, nombre, numeroCreditos));
  }
  
  public void eliminarAsignatura(int codigo){
      control.eliminarAsignatura(codigo);
  }
  
  public void modificarAsignatura(int codigo, int nuevoCodigo, String nuevoNombre, int nuevoNumeroCreditos){
      
      Asignatura infoNueva = new Asignatura(nuevoCodigo, nuevoNombre, nuevoNumeroCreditos);
      
      control.modificarAsignatura(codigo, infoNueva);
  }
  
  public String consultarAsignatura(int codigo){
      String msg = "";
      if (control.consultarAsignatura(codigo) != null) {
          msg = control.consultarAsignatura(codigo).toString();
      }else{
          msg = "No existe la asignatura con el código " + codigo;
      }
      return msg;
  }
  
  public String verAsignaturas(){
      return control.verAsignaturas();
  }
  
  
  //OTROS METODOS
  public void matricularAsignatura(int DNIAlumno, int codigoAsignatura){
     control.matricularAsignaruta(DNIAlumno, codigoAsignatura);
  }
  
  public String verAsignaturasMatriculadasPorAlumno(int DNI){
      return control.verAsignarutaMatriculadas(DNI);
  }
  
  public String conocerAlumnosMatriculadosAsignatura(int codigo){
      return control.conocerAlumnosMatriculadosAsignatura(codigo);
  }
  
}
