package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc17_cuadrotexto {
    public static void main(String[] args) {
        int d = Integer.parseInt(JOptionPane.showInputDialog("Día:"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Mes:"));
        if ((d >= 1 && d <= 30) && (m >= 1 && m <= 12)) {
            JOptionPane.showMessageDialog(null, "Correcta");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrecta");
        }
    }
}
