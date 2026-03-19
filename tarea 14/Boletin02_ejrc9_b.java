package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc9_b {
    public static void main(String[] args) {
        String resultado = "Cuenta atrás (7 en 7):\n";
        
        // Bucle for para el decremento
        for (int i = 100; i >= 0; i -= 7) {
            resultado += i + " ";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
