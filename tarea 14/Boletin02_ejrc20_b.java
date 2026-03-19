package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc20_b {
    public static void main(String[] args) {
        int nota, aprobados = 0, condicionados = 0, suspensos = 0;

        for (int i = 1; i <= 5; i++) {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Nota del alumno " + i + " (0-10):"));

            if (nota >= 5) {
                aprobados++;
            } else if (nota == 4) {
                condicionados++;
            } else {
                suspensos++;
            }
        }

        String resultado = "RESUMEN DE NOTAS\n" +
                           "Aprobados: " + aprobados + "\n" +
                           "Condicionados: " + condicionados + "\n" +
                           "Suspensos: " + suspensos;

        JOptionPane.showMessageDialog(null, resultado);
    }
}

