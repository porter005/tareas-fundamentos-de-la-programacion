package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc22_b {
    public static void main(String[] args) {
        int num;
        boolean hay_negativo = false;

        for (int i = 1; i <= 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número (" + i + " de 10):"));

            if (num < 0) {
                hay_negativo = true;
            }
        }

        if (hay_negativo) {
            JOptionPane.showMessageDialog(null, "Se ha introducido algún número negativo");
        } else {
            JOptionPane.showMessageDialog(null, "No hay ningún número negativo");
        }
    }
}
