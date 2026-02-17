package conjuntos;

public interface Conjuntable<T> {
    boolean vacio();
    void limpia();
    void agregar(T elemento);
    void eliminar(T elemento);
    int contiene(T elemento);

    Conjuntos<T> union(Conjuntos<T> set);
    Conjuntos<T> interseccion(Conjuntos<T> set);
    Conjuntos<T> diferencia(Conjuntos<T> set);
    boolean subconjunto(Conjuntos<T> set);

}
