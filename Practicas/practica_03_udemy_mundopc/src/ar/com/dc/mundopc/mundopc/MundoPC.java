package ar.com.dc.mundopc.mundopc;

import ar.com.dc.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Raton raton_1 = new Raton("USB-A", "Razer");
        Raton raton_2 = new Raton("PS/2", "Sony");
        Raton raton_3 = new Raton("USB-C", "Steelseries");

        Teclado teclado_1 = new Teclado("USB-C", "MadCatz");
        Teclado teclado_2 = new Teclado("USB-A", "Corsair");
        Teclado teclado_3 = new Teclado("USB-A", "Razer");

        Monitor monitor_1 = new Monitor("Samsung", 22.0);
        Monitor monitor_2 = new Monitor("HyperX", 26.2);
        Monitor monitor_3 = new Monitor("Phillips", 21.5);

        /* System.out.println("Cantidad Ratones: " + Raton.getContadorRatones());
        System.out.println("Cantidad Teclados: " + Teclado.getContadorTeclados());
        System.out.println("Cantidad Monitores: " + Monitor.getContadorMonitores()); */

        Computadora computadora_1 = new Computadora("PC-Box 01", monitor_1, teclado_2, raton_2);
        Computadora computadora_2 = new Computadora("DESKTOP Z-51B", monitor_2, teclado_1, raton_3);
        Computadora computadora_3 = new Computadora("PC-KL601", monitor_3, teclado_3, raton_1);
        Computadora computadora_4 = new Computadora("USK-PC z71", monitor_1, teclado_1, raton_3);

        //System.out.println("Cantidad Computadoras: " + Computadora.getContadorComputadoras());

        Orden orden_1 = new Orden();
        Orden orden_2 = new Orden();

        orden_1.agregarComputadora(computadora_1);
        orden_1.agregarComputadora(computadora_4);

        orden_2.agregarComputadora(computadora_2);
        orden_2.agregarComputadora(computadora_3);

        System.out.println(orden_1.mostrarOrden());
        System.out.println(orden_2.mostrarOrden());
    }
}
