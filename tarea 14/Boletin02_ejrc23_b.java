package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc23_b {
    public static void main(String[] args) {
        int nota;
        boolean hay_suspensos = false;

        for (int i = 1; i <= 5; i++) {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Nota alumno " + i + ":"));

            if (nota < 5) {
                hay_suspensos = true;
            }
        }

        if (hay_suspensos) {
            JOptionPane.showMessageDialog(null, "Hay alumnos suspensos");
        } else {
            JOptionPane.showMessageDialog(null, "No hay ningún suspenso");
        }
    }
}

