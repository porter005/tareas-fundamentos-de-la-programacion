
public class Practica8Character {

    public static void main(String[] args) {
        String frase = " 1973 Perdóname si no te sigo pero me Aburre caminar...";
        
        analizarCadena(frase);
        
        System.out.println("\nTexto convertido carácter por carácter:");
        imprimirEnMayusculas(frase);
    }

    public static void analizarCadena(String texto) {
        int car = 0, dig = 0, may = 0, min = 0;

        for (int i = 0; i < texto.length(); i++) {
            char ch = texto.charAt(i);
            
            if (Character.isLetter(ch)) {
                car++;
                if (Character.isUpperCase(ch)) {
                    may++;
                } else if (Character.isLowerCase(ch)) {
                    min++;
                }
            } else if (Character.isDigit(ch)) {
                dig++;
            }
        }

        System.out.println("Resultados del análisis:");
        System.out.println("Letras totales: " + car);
        System.out.println("Números: " + dig);
        System.out.println("Mayúsculas: " + may);
        System.out.println("Minúsculas: " + min);
    }

    public static void imprimirEnMayusculas(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(Character.toUpperCase(texto.charAt(i)));
        }
        System.out.println();
    }
}