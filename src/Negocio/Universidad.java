package Negocio;

import java.util.Enumeration;
import java.util.Hashtable;

public class Universidad {

    private Hashtable<Integer, Alumno> alumnos = new Hashtable<>();
    private Hashtable<Integer, Asignatura> asignaturas = new Hashtable<>();

    //INICIO CRUD ALUMNOS
    public void agregarAlumno(Alumno alumno) {
        alumnos.put(alumno.getDNI(), alumno);
    }

    public Alumno consultarAlumno(int DNIConsultar) {
        int aux = 0;
        Alumno alumno = null;

        Enumeration<Integer> DNI = alumnos.keys();

        while (DNI.hasMoreElements()) {
            aux = DNI.nextElement();
            if (aux == DNIConsultar) {
                alumno = alumnos.get(aux);
                break;
            }
        }

        return alumno;
    }

    public void eliminarAlumno(int DNIEliminar) {
        int aux = 0;
        Enumeration<Integer> DNI = alumnos.keys();

        while (DNI.hasMoreElements()) {
            aux = DNI.nextElement();
            if (aux == DNIEliminar) {
                alumnos.remove(aux);
            }
        }
    }

    public void modificarAlumno(int DNIModificar, Alumno infoNueva) {
        int aux = 0;
        Alumno infoActual = consultarAlumno(DNIModificar);
        Enumeration<Integer> DNI = alumnos.keys();

        while (DNI.hasMoreElements()) {
            aux = DNI.nextElement();
            if (aux == infoActual.getDNI()) {
                alumnos.replace(aux, infoActual, infoNueva);
            }
        }
    }
    

    public String verAlumnos() {
        int aux = 0;
        String msg = "";

        Enumeration<Integer> DNI = alumnos.keys();

        while (DNI.hasMoreElements()) {
            aux = DNI.nextElement();
            msg += alumnos.get(aux) + "\n";
        }

        return msg;
    }

    //FIN CRUD ALUMNOS
    //INICIO CRUD ASIGNATURAS
    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.put(asignatura.getCodigo(), asignatura);
    }

    public Asignatura consultarAsignatura(int codigoConsultar) {
        int aux = 0;
        Asignatura asignatura = null;

        Enumeration<Integer> codigo = asignaturas.keys();

        while (codigo.hasMoreElements()) {
            aux = codigo.nextElement();
            if (aux == codigoConsultar) {
                asignatura = asignaturas.get(aux);
                break;
            }
        }

        return asignatura;
    }

    public void eliminarAsignatura(int codigoEliminar) {
        int aux = 0;
        Enumeration<Integer> codigo = asignaturas.keys();

        while (codigo.hasMoreElements()) {
            aux = codigo.nextElement();
            if (aux == codigoEliminar) {
                asignaturas.remove(aux);
            }
        }
    }

    public void modificarAsignaturas(int codigoModificar, Asignatura infoNueva) {
        int aux = 0;
        Asignatura infoActual = consultarAsignatura(codigoModificar);
        Enumeration<Integer> codigo = asignaturas.keys();

        while (codigo.hasMoreElements()) {
            aux = codigo.nextElement();
            if (aux == infoActual.getCodigo()) {
                asignaturas.replace(aux, infoActual, infoNueva);
            }
        }
    }

    public String verAsignaturas() {
        int aux = 0;
        String msg = "";

        Enumeration<Integer> codigo = asignaturas.keys();

        while (codigo.hasMoreElements()) {
            aux = codigo.nextElement();
            msg += asignaturas.get(aux) + "\n";
        }

        return msg;
    }

    //METODOS ADICIONALES
    public void matricularAsignatura(int DNIAlumno, int codigoAsignaturaMatricular) {
        int auxCodigo = 0;
        int auxDNI = 0;

        Enumeration<Integer> DNI = alumnos.keys();
        Enumeration<Integer> codigoAsignatura = asignaturas.keys();

        while (DNI.hasMoreElements()) {
            auxDNI = DNI.nextElement();
            if (auxDNI == DNIAlumno) {
                while (codigoAsignatura.hasMoreElements()) {
                    auxCodigo = codigoAsignatura.nextElement();
                    if (auxCodigo == codigoAsignaturaMatricular) {
                        alumnos.get(auxDNI).agregarAsignatura(asignaturas.get(auxCodigo));
                    }
                }
            }
        }

    }

    public String verMateriasMatriculadas(int DNIAlumno) {
        int aux = 0;
        String msg = "";

        Enumeration<Integer> DNI = alumnos.keys();

        while (DNI.hasMoreElements()) {
            aux = DNI.nextElement();
            if (aux == DNIAlumno) {
                msg += alumnos.get(aux).verAsignaturas() + "\n";
            }
        }
        return msg;
    }

    public String conocerAlumnosMatriculadosAsignatura(int codigoAsignaturaConsultar) {
        int auxDNI = 0;
        String msg = "";

        Enumeration<Integer> DNI = alumnos.keys();

        while (DNI.hasMoreElements()) {
            auxDNI = DNI.nextElement();
            if (alumnos.get(auxDNI).estaMatriculadoEnAsignatura(codigoAsignaturaConsultar)) {
                msg += alumnos.get(auxDNI).toString() + "\n";
            }
        }

        return msg;
    }

}
