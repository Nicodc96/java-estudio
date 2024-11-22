import Validador.*;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // ------ Registro de materias ------
        Materia algoritmos = new Materia("Algoritmos");
        Materia estructuraDeDatos = new Materia("Estructura de datos");
        Materia paradigmasProgramacion = new Materia("Paradigmas de programación");
        Materia disenoSistemas = new Materia("Diseño de Sistemas");
        Materia matematicaUno = new Materia("Matemática I");
        Materia matematicaDos = new Materia("Matemática II");

        // ------ Registro de correlativadades ------
        System.out.println(disenoSistemas.agregarCorrelativa(paradigmasProgramacion));
        System.out.println(disenoSistemas.agregarCorrelativa(algoritmos));
        System.out.println(disenoSistemas.agregarCorrelativa(estructuraDeDatos));
        System.out.println(disenoSistemas.agregarCorrelativa(matematicaUno));
        System.out.println(disenoSistemas.agregarCorrelativa(matematicaDos));

        System.out.println(matematicaDos.agregarCorrelativa(matematicaUno));

        System.out.println(estructuraDeDatos.agregarCorrelativa(algoritmos));
        System.out.println(estructuraDeDatos.agregarCorrelativa(matematicaUno));

        System.out.println(paradigmasProgramacion.agregarCorrelativa(algoritmos));
        System.out.println(paradigmasProgramacion.agregarCorrelativa(estructuraDeDatos));
        System.out.println(paradigmasProgramacion.agregarCorrelativa(matematicaUno));
        System.out.println(paradigmasProgramacion.agregarCorrelativa(matematicaDos));

        /* Las materias tendrían este orden entonces:
        *   Cuatrimestre I: Algoritmos, Matemática I
        *   Cuatrimestre II: Estructura de Datos, Matemática II
        *   Cuatrimestre III: Paradigmas de programación
        *   Cuatrimestre IV: Diseño de Sistemas
        * */

        // ------ Registro de 2 alumnos ------
        Alumno juan = new Alumno("Juan", "Pérez", "44101541");
        Alumno teresa = new Alumno("Teresa", "Rodriguez", "40155315");

        // ------ Registro de materias aprobadas de cada alumno ------

        /* Juan aprobó Matemática I, Algoritmos y Estructura de Datos */
        System.out.println(juan.agregarMateriaAprobada(matematicaUno));
        System.out.println(juan.agregarMateriaAprobada(algoritmos));
        System.out.println(juan.agregarMateriaAprobada(estructuraDeDatos));

        /* Teresa aprobó Matemática I, Matemática II, Algoritmos y Estructura de Datos */
        System.out.println(teresa.agregarMateriaAprobada(matematicaUno));
        System.out.println(teresa.agregarMateriaAprobada(matematicaDos));
        System.out.println(teresa.agregarMateriaAprobada(algoritmos));
        System.out.println(teresa.agregarMateriaAprobada(estructuraDeDatos));

        // ------------ Verificar inscripción ------------

        /* Juan quiere cursar Paradigmas de programación: ¿Puede? */
        System.out.println(Inscripcion.aprobada(juan, paradigmasProgramacion));
        // Rta -> No puede, debe aprobar Matemática II

        /* Teresa quiere cursar Diseño de Sistemas: ¿Puede? */
        System.out.println(Inscripcion.aprobada(teresa, disenoSistemas));
        // Rta -> No puede, debe aprobar Paradigmas de programación.

        /* Teresa quiere cursar Paradigmas de programación: ¿Puede? */
        System.out.println(Inscripcion.aprobada(teresa, paradigmasProgramacion));
        // Rta -> Puede cursar

        /* Juan quiere cursar Matemática I: ¿Puede? */
        System.out.println(Inscripcion.aprobada(juan, matematicaUno));
        // Rta -> No puede, ya la tiene aprobada
    }
}