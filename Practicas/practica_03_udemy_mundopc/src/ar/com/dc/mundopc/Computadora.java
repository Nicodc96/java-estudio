package ar.com.dc.mundopc;

public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;

    private static int contadorComputadoras = 0;

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    private Computadora() {
        this.idComputadora = ++contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();
        sB.append("[Computadora] idComputadora: ").append(this.idComputadora);
        sB.append(", nombre: ").append(this.nombre);
        sB.append(", componentes: [\n");
        sB.append("{ monitor: ").append(this.monitor.toString()).append("}");
        sB.append(", \n{ raton: ").append(this.raton.toString()).append("}");
        sB.append(", \n{ teclado: ").append(this.teclado.toString()).append("}");
        return sB.toString();
    }
}
