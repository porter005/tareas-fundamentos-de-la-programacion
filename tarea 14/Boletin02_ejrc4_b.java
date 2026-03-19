package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc4_b {
    public static void main(String[] args) {
        int num, contador;

        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número:"));
        contador = 0;

        while (num >= 0) {
            contador++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro número (negativo para salir):"));
        }

        JOptionPane.showMessageDialog(null, "Se han introducido: " + contador + " números");
    }
}
