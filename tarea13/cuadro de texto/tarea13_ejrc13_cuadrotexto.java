package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc13_cuadrotexto {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce número:"));
        int original = num;
        int reves = 0;
        while (num > 0) {
            reves = (reves * 10) + (num % 10);
            num = num / 10;
        }
        if (original == reves) JOptionPane.showMessageDialog(null, "Es capicúa");
        else JOptionPane.showMessageDialog(null, "No lo es");
    }
}