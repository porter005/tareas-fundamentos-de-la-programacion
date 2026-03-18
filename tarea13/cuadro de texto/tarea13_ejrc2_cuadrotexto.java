package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc2_cuadrotexto {
    public static void main(String[] args) {
        double r = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio de un círculo:"));
        double area = Math.PI * Math.pow(r, 2);
        JOptionPane.showMessageDialog(null, "El área es: " + area);
    }
}