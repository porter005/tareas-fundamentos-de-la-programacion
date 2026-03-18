package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc19_cuadrotexto {
    public static void main(String[] args) {
        int d = Integer.parseInt(JOptionPane.showInputDialog("Día:"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Mes:"));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Año:"));
        d = d + 1;
        if (d > 30) {
            d = 1;
            m = m + 1;
            if (m > 12) {
                m = 1;
                a = a + 1;
            }
        }
        JOptionPane.showMessageDialog(null, d + "/" + m + "/" + a);
    }
}