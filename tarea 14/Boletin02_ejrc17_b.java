package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc17_b {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            StringBuilder tabla = new StringBuilder("TABLA DEL " + i + "\n");
            tabla.append("---------------\n");
            
            for (int j = 1; j <= 10; j++) {
                tabla.append(i).append(" x ").append(j).append(" = ").append(i * j).append("\n");
            }
            
            // Muestra la tabla completa actual
            JOptionPane.showMessageDialog(null, tabla.toString());
        }
    }
}
