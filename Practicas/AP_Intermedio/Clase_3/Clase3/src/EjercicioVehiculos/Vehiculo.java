package EjercicioVehiculos;

public class Vehiculo {
    private String patente;
    private Marca marca;
    private Integer kilometros;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Integer getKilometros() {
        return kilometros;
    }

    public void setKilometros(Integer kilometros) {
        this.kilometros = kilometros;
    }

    public Vehiculo(String patente, Marca marca, Integer kilometros){
        this.patente = patente;
        this.marca = marca;
        this.kilometros = kilometros;
    }

    public String getMarcaString(){
        return this.marca.toString();
    }

    public String mostrarVehiculo(){
        StringBuilder sB = new StringBuilder();
        sB.append("Patente: ").append(this.patente).append("\n");
        sB.append("Marca: ").append(this.marca.toString()).append("\n");
        sB.append("Kilometraje: ").append(this.kilometros).append("\n");
        return sB.toString();
    }
}
