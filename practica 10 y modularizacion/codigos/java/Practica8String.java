
public class Practica8String {

    public static void main(String[] args) {
        String cadena = "nunca me digas que no puedo nunca me digas que creer no ves que tengo miedo no me pongas tus cadenas";
        String cadena2 = " perdóname si no te sigo pero me aburre caminar...";

        mostrarInfoBasica(cadena);
        
        String cadenaUnida = concatenarYExtraer(cadena, cadena2);
        
        int totalA = contarVocalesA(cadenaUnida);
        System.out.println("Existen " + totalA + " vocales 'a' en la cadena completa.");
    }

    public static void mostrarInfoBasica(String texto) {
        System.out.println("La longitud es: " + texto.length());
        System.out.println("En Mayúsculas: " + texto.toUpperCase());
        System.out.println("En Minúsculas: " + texto.toLowerCase());
    }
    public static String concatenarYExtraer(String t1, String t2) {
        String unido = t1.concat(t2);
        if (unido.length() > 100) {
            System.out.println("Subcadena desde pos 100: " + unido.substring(100));
        }
        return unido;
    }

    public static int contarVocalesA(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }
        return contador;
    }
}