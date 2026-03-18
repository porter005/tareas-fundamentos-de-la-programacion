package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc12_cuadrotexto {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce número:"));
        String res = "";
        while (num > 0) {
            res = res + (num % 10) + " ";
            num = num / 10;
        }
        JOptionPane.showMessageDialog(null, res);
    }
}
