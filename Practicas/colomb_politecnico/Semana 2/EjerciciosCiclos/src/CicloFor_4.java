public class CicloFor_4 {
    public static void main(String[] args) {
        Integer numeroDefinido = 3;
        Integer suma = 0;

        for (int i = 0; i <= numeroDefinido; i++){
            suma += i;
        }

        System.out.printf("Raiz cuadrada de %d: %.4f\n", suma, Math.sqrt(suma));
        System.out.printf("Numero aleatorio entre 1 y %d: %.0f\n", suma, Math.random()*suma);
        System.out.print("Divisores: " + CicloFor_2.mostrarDivisores(suma) + "\n");
        System.out.printf("Factorial de %d: %.0f\n", suma, CicloFor_1.factorial(suma));
        System.out.printf(CicloFor_3.esPerfecto(suma) ? "%d es perfecto." : "%d no es perfecto.", suma);
    }

}
