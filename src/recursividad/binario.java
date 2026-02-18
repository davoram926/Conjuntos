public class binario {
    

    public static String abinarios(int entero) {
        if (entero == 1) {
            return "1";
        } else {
            return abinarios(entero / 2) + (entero % 2);
        }
    } 


    public static void main(String[] args) {
        System.out.println(abinarios(5));
        System.out.println(abinarios(14));
    }

}


