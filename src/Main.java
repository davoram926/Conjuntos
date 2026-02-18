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

    //
    // CASO DE ESTUDIO: 100 alumnos e idiomas
    //

    // UNIVERSO: 100 alumnos representados con IDs del 1 al 100
    Conjuntos<Integer> U = new Conjuntos<>(100);
    for (int i = 1; i <= 100; i++) {
        U.agregar(i);
    }

    // Conjuntos de idiomas
    // E = Español (28 alumnos), A = Alemán (30), F = Francés (42)
    Conjuntos<Integer> E = new Conjuntos<>(); // Español
    Conjuntos<Integer> AL = new Conjuntos<>(); // Alemán
    Conjuntos<Integer> FR = new Conjuntos<>(); // Francés

    // IDs 1-3: alumnos en los TRES idiomas a la vez (E∩A∩F = 3)
    for (int i = 1; i <= 3; i++) {
        E.agregar(i); AL.agregar(i); FR.agregar(i);
    }

    // IDs 4-8: alumnos en E y A, pero NO en F  (cubre E∩A = 8, ya hay 3)
    for (int i = 4; i <= 8; i++) {
        E.agregar(i); AL.agregar(i);
    }

    // IDs 9-15: alumnos en E y F, pero NO en A  (cubre E∩F = 10, ya hay 3)
    for (int i = 9; i <= 15; i++) {
        E.agregar(i); FR.agregar(i);
    }

    // IDs 16-17: alumnos en A y F, pero NO en E  (cubre A∩F = 5, ya hay 3)
    for (int i = 16; i <= 17; i++) {
        AL.agregar(i); FR.agregar(i);
    }

    // IDs 18-30: alumnos SOLO en Español  (E = 28: 3+5+7+13 = 28 ✓)
    for (int i = 18; i <= 30; i++) {
        E.agregar(i);
    }

    // IDs 31-50: alumnos SOLO en Alemán  (A = 30: 3+5+2+20 = 30 ✓)
    for (int i = 31; i <= 50; i++) {
        AL.agregar(i);
    }

    // IDs 51-80: alumnos SOLO en Francés  (F = 42: 3+7+2+30 = 42 ✓)
    for (int i = 51; i <= 80; i++) {
        FR.agregar(i);
    }

    // IDs 81-100: alumnos SIN idioma (quedan solo en U, 20 alumnos)

    // Verificacion de cardinalidades
    IO.println("U  (universo)  = " + U.size() + " alumnos");
    IO.println("E  (Espanol)   = " + E.size() + " alumnos");
    IO.println("A  (Aleman)    = " + AL.size() + " alumnos");
    IO.println("F  (Frances)   = " + FR.size() + " alumnos");

    // a) Alumnos sin idioma: sinIdioma = U - (E ∪ A ∪ F)
    // Primero unimos todos los idiomas, luego restamos al universo
    Conjuntos<Integer> unionTodos = E.union(AL).union(FR); // E ∪ A ∪ F
    Conjuntos<Integer> sinIdioma  = U.diferencia(unionTodos); // U - (E ∪ A ∪ F)

    // b) Alumnos con SOLO Frances: soloFrances = F - (E ∪ A)
    // Quitamos de F a todos los que tambien hablan E o A
    Conjuntos<Integer> unionEA     = E.union(AL);             // E ∪ A
    Conjuntos<Integer> soloFrances = FR.diferencia(unionEA);  // F - (E ∪ A)

    IO.println("a) Alumnos sin idioma  : " + sinIdioma.size());
    IO.println("b) Alumnos solo Frances: " + soloFrances.size());
}
