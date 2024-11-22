package Validador;
import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;
    private List<Materia> materiasAprobadas;

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setApellido(String nuevoApellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setDni(String nuevoDni){
        this.dni = nuevoDni;
    }

    public String getDni(){
        return this.dni;
    }

    public List<Materia> getMateriasAprobadas(){
        return this.materiasAprobadas;
    }

    private Alumno(){
        this.materiasAprobadas = new ArrayList<>();
    }

    public Alumno(String nombre, String apellido, String dni){
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public boolean existenteAprobada(Materia materia){
        if (this.materiasAprobadas == null) {
            this.materiasAprobadas = new ArrayList<>();
            return false;
        }
        for (Materia m : this.materiasAprobadas) {
            if (m.getId().equals(materia.getId())) {
                return true;
            }
        }
        return false;
    }

    public String agregarMateriaAprobada(Materia materia){
        StringBuilder sB = new StringBuilder();
        sB.append(!existenteAprobada(materia) ? "Materia " + materia.getNombre() + " aprobada agregada!" : "Ya aprobó la materia " + materia.getNombre() + "!");
        if (!existenteAprobada(materia)){
            this.materiasAprobadas.add(materia);
        }
        return sB.toString();

    }
}
