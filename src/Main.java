import conjuntos.Conjuntos;
import recursividad.binario;

void main() {

    Conjuntos<Integer> U = new Conjuntos<>();
    Conjuntos<Integer> A = new Conjuntos<>(4);
    Conjuntos<Integer> B = new Conjuntos<>(4);
    Conjuntos<Integer> F = new Conjuntos<>(4);
    Conjuntos<Integer> C;
    A.agregar(13);
    A.agregar(5);
    A.agregar(7);
    A.agregar(3);

    B.agregar(20);
    B.agregar(5);
    B.agregar(3);
    B.agregar(2);

    F.agregar(30);
    F.agregar(7);
    F.agregar(3);
    F.agregar(2);


//Vale brga no le entiendo
    IO.println("Alumnos que no estudiaban idiomas: " + Arrays.toString(A.getData()));

    String res = Arrays.toString(F.diferencia(A).diferencia(B).getData());


    IO.println("Alumnos que estudian solo francés: " + res);

    IO.println(binario.abinarios(4));


    IO.println(Arrays.toString(A.getData()));
    IO.println(Arrays.toString(B.getData()));

    C = A.union(B);
    IO.println(C); //utilizamos el metodo toString de Conjuntos

    try {
        while (C.hasNext()) { // recorremos el conjunto con el iterador
            IO.println(C.next());
        }
    } catch (Exception e) {
        IO.println(e.getMessage());
    }
}
