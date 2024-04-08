package ar.com.dc.mundopc;

public abstract class DispositivoEntrada {
    protected String tipoEntrada;
    protected String marca;

    public DispositivoEntrada(String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();
        sB.append("{[DispositivoEntrada] tipoEntrada: ").append(this.tipoEntrada);
        sB.append(", marca: ").append(this.marca).append("}");
        return sB.toString();
    }
}
