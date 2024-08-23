public class CicloWhile_4 {
    public static void main(String[] args) {
        System.out.println("Los primeros 25 valores de la serie sumatoria de a 11 son: ");
        System.out.println(serieSumatoria(11, 25));
    }

    public static String serieSumatoria(int suma, int limite){
        int i = 0;
        int valorNumero = 11;
        StringBuilder stringRespuesta = new StringBuilder();

        while(i < limite){
            stringRespuesta.append(i == limite - 1 ? valorNumero : valorNumero + " - ");
            valorNumero += suma;
            i++;
        }
        return stringRespuesta.toString();
    }
}
