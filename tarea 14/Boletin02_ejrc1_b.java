package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc1_b {
    public static void main(String[] args) {
        int num, cuadrado;

        // Lectura inicial
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número:"));

        while (num >= 0) {
            cuadrado = num * num;
            JOptionPane.showMessageDialog(null, num + "² es igual a " + cuadrado);
            
            // Nueva lectura dentro del bucle
            String input = JOptionPane.showInputDialog("Introduzca otro número (negativo para salir):");
            num = Integer.parseInt(input);
        }
    }
}