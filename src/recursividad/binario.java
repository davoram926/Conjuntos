package recursividad;

public class binario {
    

    public static String abinarios(int entero) {
        if (entero == 1) {
            return "1";
        } else {
            return abinarios(entero / 2) + (entero % 2);
        }
    }
}