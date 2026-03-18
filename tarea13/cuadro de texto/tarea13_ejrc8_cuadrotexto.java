package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc8_cuadrotexto {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("N1:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("N2:"));
        if (n1 == n2) {
            JOptionPane.showMessageDialog(null, "Son iguales");
        } else {
            if (n1 > n2) {
                JOptionPane.showMessageDialog(null, n1 + " es mayor");
            } else {
                JOptionPane.showMessageDialog(null, n2 + " es mayor");
            }
        }
    }
}
