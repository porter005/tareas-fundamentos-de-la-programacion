package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc10_b {
    public static void main(String[] args) {
        int num, suma_total = 0;

        for (int i = 1; i <= 15; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número (" + i + " de 15):"));
            suma_total = suma_total + num;
        }

        JOptionPane.showMessageDialog(null, "La suma total es de: " + suma_total);
    }
}
