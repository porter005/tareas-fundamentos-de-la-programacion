package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc14_cuadrotexto {
    public static void main(String[] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Nota:"));
        switch (nota) {
            case 0: case 1: case 2: case 3: case 4:
                JOptionPane.showMessageDialog(null, "Insuficiente"); break;
            case 5: JOptionPane.showMessageDialog(null, "Suficiente"); break;
            case 6: JOptionPane.showMessageDialog(null, "Bien"); break;
            case 7: case 8: JOptionPane.showMessageDialog(null, "Notable"); break;
            case 9: case 10: JOptionPane.showMessageDialog(null, "Sobresaliente"); break;
        }
    }
}