package InterfacesFuncionales;
import java.util.List;

@FunctionalInterface
public interface Operacion {
    List<Integer> operar(List<Integer> listaNumeros);
}
