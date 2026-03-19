package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc12_b {
    public static void main(String[] args) {
        double factorial = 1;
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));

        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }

        JOptionPane.showMessageDialog(null, "El factorial de " + num + " es: " + factorial);
    }
}
