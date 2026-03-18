package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class 	tarea13_ejrc21_cuadrotexto {
    public static void main(String[] args) {
        int h = Integer.parseInt(JOptionPane.showInputDialog("H:"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("M:"));
        int s = Integer.parseInt(JOptionPane.showInputDialog("S:"));
        s = s + 1;
        if (s >= 60) {
            s = 0; m = m + 1;
            if (m >= 60) {
                m = 0; h = h + 1;
                if (h >= 24) h = 0;
            }
        }
        JOptionPane.showMessageDialog(null, h + ":" + m + ":" + s);
    }
}