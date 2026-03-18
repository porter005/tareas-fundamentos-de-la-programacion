package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc3_cuadrotexto {
    public static void main(String[] args) {
        double r = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio:"));
        double L = 2 * Math.PI * r;
        JOptionPane.showMessageDialog(null, "La longitud es: " + L);
    }
}