package Validador;
import java.util.ArrayList;
import java.util.List;

public class Materia {
    private static Integer idReferencia = 100;
    private Integer idMateria;
    private String nombre;
    private List<Materia> listaCorrelativas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId(){
        return this.idMateria;
    }

    public List<Materia> getListaCorrelativas(){
        return this.listaCorrelativas;
    }

    private Materia(){
        this.listaCorrelativas = new ArrayList<>();
    }

    public Materia(String nombre){
        super();
        this.nombre = nombre;
        this.idMateria = idReferencia++;
    }

    private boolean existenteCorrelativa(Materia materiaCorrelativa){
        if (this.listaCorrelativas == null){
            this.listaCorrelativas = new ArrayList<>();
            return false;
        }
        for (Materia m : this.listaCorrelativas){
            if (m.getId().equals(materiaCorrelativa.getId())){
                return true;
            }
        }
        return false;
    }

    public String agregarCorrelativa(Materia materiaCorrelativa){
        StringBuilder sB = new StringBuilder();
        sB.append(!this.existenteCorrelativa(materiaCorrelativa) ? "Materia correlativa agregada!" : "Ya existe la materia como correlativa!");
        if (!this.existenteCorrelativa(materiaCorrelativa)){
            this.listaCorrelativas.add(materiaCorrelativa);
        }
        return sB.toString();
    }

    public static boolean existeMateriaEnLista(Materia materiaAVerificar, List<Materia> listaMaterias){
        for (Materia m : listaMaterias){
            if (m.getId().equals(materiaAVerificar.getId())){
                return true;
            }
        }
        return false;
    }
}
