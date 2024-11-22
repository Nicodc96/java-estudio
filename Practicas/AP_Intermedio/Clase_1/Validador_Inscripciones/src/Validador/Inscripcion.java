package Validador;

public class Inscripcion {
    private static boolean tieneAprobadaCorrelativas(Alumno alumno, Materia materia){
        for (Materia correlativa : materia.getListaCorrelativas()){
            if (!Materia.existeMateriaEnLista(correlativa, alumno.getMateriasAprobadas())){
                return false;
            }
        }
        return true;
    }
    // Supongo que este método validará si se pudo inscribir, no?
    public static boolean aprobada(Alumno alumno, Materia materia){
        return !alumno.existenteAprobada(materia) && tieneAprobadaCorrelativas(alumno, materia);
    }
}
