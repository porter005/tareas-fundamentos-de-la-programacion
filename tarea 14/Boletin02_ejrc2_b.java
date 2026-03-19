package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc2_b {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número:"));

        while (num != 0) {
            if (num > 0) {
                JOptionPane.showMessageDialog(null, "Positivo");
            } else {
                JOptionPane.showMessageDialog(null, "Negativo");
            }
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro número (0 para salir):"));
        }
    }
}