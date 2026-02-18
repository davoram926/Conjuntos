public class CuentaPalabras {

    public static int cuentaPalabras(String frase) {
        if (frase == null) {
            return 0;
        }

        frase = frase.trim();
        if (frase.isEmpty()) {
            return 0;
        }

        return cuentaPalabrasRec(frase, 0, false);
    }

    private static int cuentaPalabrasRec(String frase, int i, boolean enPalabra) {
        if (i >= frase.length()) {
            return 0;
        }

        char c = frase.charAt(i);
        if (c == ' ') {
            return cuentaPalabrasRec(frase, i + 1, false);
        }

        if (!enPalabra) {
            return 1 + cuentaPalabrasRec(frase, i + 1, true);
        }

        return cuentaPalabrasRec(frase, i + 1, true);
    }

    public static void main(String[] args) {
        System.out.println("Numero de palabras: " +
                cuentaPalabras("La hormiga ahorrativa traga mas saliva"));
    }
}
