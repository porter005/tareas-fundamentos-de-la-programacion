package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc15_cuadrotexto {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Día (1-7):"));
        switch (dia) {
            case 1: JOptionPane.showMessageDialog(null, "Lunes"); break;
            case 2: JOptionPane.showMessageDialog(null, "Martes"); break;
            case 3: JOptionPane.showMessageDialog(null, "Miércoles"); break;
            case 4: JOptionPane.showMessageDialog(null, "Jueves"); break;
            case 5: JOptionPane.showMessageDialog(null, "Viernes"); break;
            case 6: JOptionPane.showMessageDialog(null, "Sábado"); break;
            case 7: JOptionPane.showMessageDialog(null, "Domingo"); break;
        }
    }
}
