public class cadenainversa {
    

    public static  String reversa(String cadena) {
        if (cadena.length() == 1) {
            return cadena;
        }

        char primerLetra = cadena.charAt(0);
        String resto = cadena.substring(1);

        return reversa(resto) + primerLetra;

    }


    public static void main(String[] args) {
        System.out.println(reversa("hola"));
    }
}
