package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc1_cuadrotexto {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Introduzca primer coeficiente (a):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Introduzca segundo coeficiente (b):"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Introduzca tercer coeficiente (c):"));
        double d = (b * b) - (4 * a * c);
        if (d < 0) {
            JOptionPane.showMessageDialog(null, "No existen soluciones reales");
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Solución 1: " + x1 + "\nSolución 2: " + x2);
        }
    }
}