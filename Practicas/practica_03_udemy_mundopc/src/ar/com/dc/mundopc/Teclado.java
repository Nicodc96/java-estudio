package ar.com.dc.mundopc;

public class Teclado extends DispositivoEntrada {
    private final int idTeclado;
    private static int contadorTeclados = 0;
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++contadorTeclados;
    }

    public static int getContadorTeclados() {
        return contadorTeclados;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();
        sB.append("[Teclado] tipoEntrada: ").append(this.tipoEntrada);
        sB.append(", marca: ").append(this.marca);
        sB.append(", idTeclado: ").append(this.idTeclado).append("");
        return sB.toString();
    }
}
