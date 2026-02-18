public class ejercicioasteriscos {


    public static String asteriscos(String texto) {
        if (texto.length() == 1) {
            return texto; 
            
        }

        char primero = texto.charAt(0);
        char segundo = texto.charAt(1);
        
        if (primero == segundo) {
            return primero +"*" + asteriscos(texto.substring(1));
        } else {
            return primero + asteriscos(texto.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(asteriscos("hello"));
    }

}