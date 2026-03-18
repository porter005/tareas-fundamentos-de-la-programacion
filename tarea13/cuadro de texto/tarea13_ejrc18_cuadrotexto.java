package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc18_cuadrotexto {
    public static void main(String[] args) {
        int d = Integer.parseInt(JOptionPane.showInputDialog("Día:"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Mes:"));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Año:"));
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalida");
        } else {
            if (m == 2 && (d >= 1 && d <= 28)) JOptionPane.showMessageDialog(null, "OK");
            else if ((m == 4 || m == 6 || m == 9 || m == 11) && (d >= 1 && d <= 30)) JOptionPane.showMessageDialog(null, "OK");
            else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d >= 1 && d <= 31)) JOptionPane.showMessageDialog(null, "OK");
            else JOptionPane.showMessageDialog(null, "Invalida");
        }
    }
}