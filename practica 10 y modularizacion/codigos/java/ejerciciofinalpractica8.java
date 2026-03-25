
import javax.swing.JOptionPane;

public class ejerciciofinalpractica8 {

    public static void main(String[] args) {
        String fraseUsuario = JOptionPane.showInputDialog("Ingresa una frase para analizar:");
        
        if (fraseUsuario == null || fraseUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ingresaste ninguna frase.");
            return;
        }

        mostrarTransformaciones(fraseUsuario);
        analizarCaracteres(fraseUsuario);
        
        int totalA = contarVocalesA(fraseUsuario);
        JOptionPane.showMessageDialog(null, "En la frase existen " + totalA + " vocales 'A'");
    }

    public static void mostrarTransformaciones(String texto) {
        String mensaje = "--- Análisis de String ---\n"
                + "Frase original: " + texto + "\n"
                + "Longitud: " + texto.length() + " caracteres\n"
                + "Todo en Mayúsculas: " + texto.toUpperCase() + "\n"
                + "Todo en Minúsculas: " + texto.toLowerCase();
        
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void analizarCaracteres(String texto) {
        int letras = 0, digitos = 0, mayus = 0, minus = 0;

        for (int i = 0; i < texto.length(); i++) {
            char ch = texto.charAt(i);

            if (Character.isLetter(ch)) {
                letras++;
                if (Character.isUpperCase(ch)) {
                    mayus++;
                } else {
                    minus++;
                }
            } else if (Character.isDigit(ch)) {
                digitos++;
            }
        }

        String reporte = "--- Análisis de Character ---\n"
                + "Letras encontradas: " + letras + "\n"
                + "Números encontrados: " + digitos + "\n"
                + "Mayúsculas: " + mayus + "\n"
                + "Minúsculas: " + minus;

        JOptionPane.showMessageDialog(null, reporte);
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
