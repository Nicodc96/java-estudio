package ar.com.dc.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes = 0;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 5;

    public int getIdOrden() {
        return idOrden;
    }

    public int getContadorOrdenes() {
        return contadorOrdenes;
    }

    public int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora p){
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[contadorComputadoras++] = p;
        } else{
            System.out.println("¡El límite de computadoras se ha alcanzado para esta órden!");
        }
    }

    public String mostrarOrden(){
        StringBuilder sB = new StringBuilder();
        sB.append("Orden ID: ").append(this.idOrden);
        sB.append("\nComputadoras: [\n");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            sB.append(this.computadoras[i].toString()).append("\n");
        }
        sB.append("]\n");
        return sB.toString();
    }
}
