package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc20_cuadrotexto {
    public static void main(String[] args) {
        int d1 = Integer.parseInt(JOptionPane.showInputDialog("Día 1:"));
        int m1 = Integer.parseInt(JOptionPane.showInputDialog("Mes 1:"));
        int a1 = Integer.parseInt(JOptionPane.showInputDialog("Año 1:"));
        int d2 = Integer.parseInt(JOptionPane.showInputDialog("Día 2:"));
        int m2 = Integer.parseInt(JOptionPane.showInputDialog("Mes 2:"));
        int a2 = Integer.parseInt(JOptionPane.showInputDialog("Año 2:"));
        int total = (d2 - d1) + 30 * (m2 - m1) + 360 * (a2 - a1);
        JOptionPane.showMessageDialog(null, "Diferencia: " + total + " días");
    }
}