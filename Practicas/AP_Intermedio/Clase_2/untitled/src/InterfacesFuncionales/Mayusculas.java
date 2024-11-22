package InterfacesFuncionales;

@FunctionalInterface
public interface Mayusculas<T, R> {
    R toUpperCase(T t);
}
