package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc7_b {
    public static void main(String[] args) {
        int num, suma = 0, elementos = 0;
        float media;

        String input = JOptionPane.showInputDialog("Introduzca un número:");
        num = Integer.parseInt(input);

        while (num >= 0) {
            suma += num;
            elementos++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro número (negativo para salir):"));
        }

        if (elementos == 0) {
            JOptionPane.showMessageDialog(null, "Imposible hacer la media");
        } else {
            media = (float) suma / elementos;
            JOptionPane.showMessageDialog(null, "La media es de: " + media);
        }
    }
}

