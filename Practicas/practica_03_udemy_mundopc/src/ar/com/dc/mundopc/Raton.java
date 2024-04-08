package ar.com.dc.mundopc;

public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones = 0;
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++contadorRatones;
    }

    public static int getContadorRatones() {
        return contadorRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();
        sB.append("[Ratón] tipoEntrada: ").append(this.tipoEntrada);
        sB.append(", marca: ").append(this.marca);
        sB.append(", idRaton: ").append(this.idRaton).append("");
        return sB.toString();
    }
}
