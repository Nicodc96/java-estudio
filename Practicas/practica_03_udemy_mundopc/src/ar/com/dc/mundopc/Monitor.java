package ar.com.dc.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores = 0;

    private Monitor(){
        this.idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();
        sB.append("[Monitor] idMonitor: ").append(this.idMonitor);
        sB.append(", marca: ").append(this.marca);
        sB.append(", tamaño: ").append(this.tamanio).append("");
        return sB.toString();
    }
}
