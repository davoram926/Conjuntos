import conjuntos.Conjuntos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Conjuntos<Integer> A = new Conjuntos<>(4);
    Conjuntos<Integer> B = new Conjuntos<>(4);
    Conjuntos<Integer> F = new Conjuntos<>(4);
    Conjuntos<Integer> C ;
    A.agregar(13);
    A.agregar(5);
    A.agregar(7);
    A.agregar(3);

    B.agregar(20);
    B.agregar(5);
    B.agregar(3);
    B.agregar(2);

    IO.println(Arrays.toString(A.getData()));
    IO.println(Arrays.toString(B.getData()));

    C = A.union(B);
    IO.println(C); //utilizamos el metodo toString de Conjuntos

    try {
        while (C.hasNext()) { // recorremos el conjunto con el iterador
            IO.println( C.next());
        }
    } catch (Exception e) {
        IO.println(e.getMessage());
    }

    //Haciendo tareaita cn mi amiwo el deivi
}
