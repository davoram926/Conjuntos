public class Orejitas {
    

    public static int orejitas(int n) {

        if (n == 0) {
            return 0;
        }
        

        if (n % 2 == 1) {  
            return 1 + 1 + orejitas(n - 1);
        } else {           
            return 1 + 1 + 1 + orejitas(n - 1);
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("orejitas(0) = " + orejitas(0));  
        System.out.println("orejitas(1) = " + orejitas(1));  
        System.out.println("orejitas(2) = " + orejitas(2));  
        System.out.println("orejitas(5) = " + orejitas(5));  
    }
}