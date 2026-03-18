package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc5_cuadrotexto {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
        if (num >= 0) {
            JOptionPane.showMessageDialog(null, "Positivo");
        } else {
            JOptionPane.showMessageDialog(null, "Negativo");
        }
    }
}