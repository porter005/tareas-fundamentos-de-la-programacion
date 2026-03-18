package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc16_cuadrotexto {
    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes:"));
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                JOptionPane.showMessageDialog(null, "31 días"); break;
            case 4: case 6: case 9: case 11:
                JOptionPane.showMessageDialog(null, "30 días"); break;
            case 2:
                JOptionPane.showMessageDialog(null, "28 días"); break;
        }
    }
}