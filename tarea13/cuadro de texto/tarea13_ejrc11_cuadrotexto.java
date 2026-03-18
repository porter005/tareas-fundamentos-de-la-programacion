package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc11_cuadrotexto {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce número:"));
        if (num < 10) JOptionPane.showMessageDialog(null, "1 cifra");
        else if (num < 100) JOptionPane.showMessageDialog(null, "2 cifras");
        else if (num < 1000) JOptionPane.showMessageDialog(null, "3 cifras");
        else if (num < 10000) JOptionPane.showMessageDialog(null, "4 cifras");
        else JOptionPane.showMessageDialog(null, "5 cifras");
    }
}