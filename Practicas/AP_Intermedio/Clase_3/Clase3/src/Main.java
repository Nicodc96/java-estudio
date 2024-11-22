import java.util.*;
import java.util.stream.Collectors;

import EjercicioVehiculos.*;

public class Main {
    static List<Vehiculo> vehiculos = new ArrayList<>();

    public static void cargarVehiculos(){
        vehiculos.add(new Vehiculo("1111AAA", Marca.RENAULT, 10000));
        vehiculos.add(new Vehiculo("2222BBB", Marca.FIAT, 20000));
        vehiculos.add(new Vehiculo("3333CCC", Marca.FORD, 30000));
        vehiculos.add(new Vehiculo("4444DDD", Marca.VOLKSWAGEN, 100000));
        vehiculos.add(new Vehiculo("5555EEE", Marca.FIAT, 200000));
        vehiculos.add(new Vehiculo("6666FFF", Marca.FORD, 300000));
        vehiculos.add(new Vehiculo("7777GGG", Marca.CITROEN, 0));
    }

    public static void main(String[] args) {
        // -- Práctica de expresiones lamba en collections --

        // Carga de vehículos
        cargarVehiculos();

        // --  lista de kilómetros de todos los vehículos

         //showKilometres(vehiculos).forEach(System.out::println);

        // -- Mostrar lista de vehiculos según una marca

        // showByMarca(vehiculos, Marca.FORD).forEach(v -> System.out.println(v.mostrarVehiculo()));

        // -- Mostrar si existe al menos un vehiculo de una marca específica en una lista de vehiculos

        // System.out.println(checkIfMarcaExist(vehiculos, Marca.CITROEN)); // Existe
        // System.out.println(checkIfMarcaExist(vehiculos, Marca.FERRARI)); // No existe

        // -- Mostrar lista de vehiculos ordenado por kilometro

        // showSortedByKm(vehiculos).forEach(v -> System.out.println(v.mostrarVehiculo()));

        // -- Mostrar lista de marcas presente en una lista de vehiculos sin repetir

        // showMarcas(vehiculos).forEach(System.out::println);

        // -- Mostrar Map de vehiculos donde Key: Marca y Value: lista de vehiculos

//        toMap(vehiculos).forEach((m, list) -> {
//            System.out.println(m.toString());
//            list.forEach(v -> System.out.println(v.mostrarVehiculo()));
//        });

        // -- Mostrar suma de kilometros de una lista de vehiculos

        // System.out.println("Total km en lista: " + showTotalListKm(vehiculos));

        // -- Mostrar vehiculo con menor kilometraje de una lista de vehiculos

        System.out.println("Vehiculo con menos kilometraje:\n" + showVehicleLessKm(vehiculos).mostrarVehiculo());

        // -- Mostrar vehiculo con mayor kilometraje de una lista de vehiculos

        System.out.println("Vehiculo con más kilometraje:\n" + showVehicleHighestKm(vehiculos).mostrarVehiculo());
    }

    public static List<Integer> showKilometres(List<Vehiculo> list){
        return list.stream().map(Vehiculo::getKilometros).collect(Collectors.toList());
    }

    public static List<Vehiculo> showByMarca(List<Vehiculo> list, Marca marca){
        return list.stream().filter(v -> v.getMarca().equals(marca)).collect(Collectors.toList());
    }

    public static boolean checkIfMarcaExist(List<Vehiculo> list, Marca marca){
        return list.stream().anyMatch(v -> v.getMarca().equals(marca));
    }

    public static List<Vehiculo> showSortedByKm(List<Vehiculo> list){
        return list.stream().sorted(Comparator.comparing(Vehiculo::getKilometros)).collect(Collectors.toList());
    }

    public static List<String> showMarcas(List<Vehiculo> list){
        return list.stream().map(Vehiculo::getMarcaString).toList();
    }

    public static Map<Marca, List<Vehiculo>> toMap(List<Vehiculo> list) {
        return list.stream().collect(Collectors.groupingBy(Vehiculo::getMarca));
    }

    public static Integer showTotalListKm(List<Vehiculo> list){
        return list.stream().mapToInt(Vehiculo::getKilometros).sum();
    }

    public static Vehiculo showVehicleLessKm(List<Vehiculo> list){
        return list
                .stream()
                .filter(v -> v.getKilometros().equals(showKilometres(vehiculos).stream().sorted().findFirst().orElse(-1)))
                .findFirst().orElse(null);
    }

    public static Vehiculo showVehicleHighestKm(List<Vehiculo> list){
        return list
                .stream()
                .filter(v -> {
                    return v.getKilometros()
                            .equals(showKilometres(vehiculos)
                                    .stream().max(Comparator.naturalOrder())
                                    .orElse(-1));
                })
                .findFirst().orElse(null);
    }
}