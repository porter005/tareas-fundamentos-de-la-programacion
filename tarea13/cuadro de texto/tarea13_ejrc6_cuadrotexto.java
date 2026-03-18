package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc6_cuadrotexto {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce n1:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce n2:"));
        if (n1 % n2 == 0) {
            JOptionPane.showMessageDialog(null, "Son múltiplos");
        } else {
            JOptionPane.showMessageDialog(null, "No son múltiplos");
        }
    }
}