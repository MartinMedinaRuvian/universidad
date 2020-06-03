package Vista;

import Control.ControlVista;

public class Test {

    public static void main(String[] args) {
        ControlVista control = new ControlVista();

        control.agregarAlumno("Martin", "Medina", 123, "calle1", "martin@gmail.com", 24);
        control.agregarAlumno("Yorgen", "Galvis", 1234, "calle2", "yorgen@gmail.com", 22);
        control.agregarAlumno("Brayan", "Medina", 1235, "calle3", "brayan@gmail.com", 20);
  

        System.out.println("Toda la tabla de alumnos:");
        System.out.println(control.verAlumnos());
        System.out.println("Consultar alumno:");
        System.out.println(control.consultarAlumno(123));
        System.out.println("");
        System.out.println("***************************************************");

        System.out.println("Asignaturas");

        control.agregarAsignatura(001, "Estrctura de datos", 4);
        control.agregarAsignatura(002, "POO2", 4);
        control.agregarAsignatura(003, "Electronica", 3);
        control.agregarAsignatura(004, "Metodologia de la investigacion", 2);


        System.out.println(control.verAsignaturas());

        System.out.println("Consultar asignaturas:");
        System.out.println(control.consultarAsignatura(003));
        System.out.println("");

        control.matricularAsignatura(123, 001);
        control.matricularAsignatura(123, 004);
        control.matricularAsignatura(1234, 002);
        control.matricularAsignatura(1234, 003);
        control.matricularAsignatura(1235, 001);

        System.out.println("Materias matriculasas por Martin:");
        System.out.println(control.verAsignaturasMatriculadasPorAlumno(123));

        System.out.println("Materias matriculasas por Yorgen:");
        System.out.println(control.verAsignaturasMatriculadasPorAlumno(1234));

        System.out.println("Materias matriculasas por Andrey:");
        System.out.println(control.verAsignaturasMatriculadasPorAlumno(1235));

        System.out.println("Alumnos matriculados en Estructura de datos:");
        System.out.println(control.conocerAlumnosMatriculadosAsignatura(001));

        System.out.println("ACTUALIZAR VALORES");
        control.modificarAlumno(123, "Martin de Jesus", "Medina Ruvian", 123, "calle1", "martin@gmail.com", 24);

        System.out.println("Alumnos con datos modificados");
        System.out.println(control.verAlumnos());

        control.modificarAsignatura(004, 004, "Investigacion", 2);

        System.out.println("Asignaturas con datos modificados");
        System.out.println(control.verAsignaturas());

        control.eliminarAlumno(1234);
        System.out.println("");
        System.out.println("Toda la tabla de alumnos despues de haber eliminado");
        System.out.println(control.verAlumnos());

        control.eliminarAsignatura(003);
        System.out.println("");
        System.out.println("Toda la tabla de asignaturas despues de haber eliminado");
        System.out.println(control.verAsignaturas());

    }
}
