package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc21_b {
    public static void main(String[] args) {
        int sueldo, sueldo_max = 0, suma = 0;
        float media;

        for (int i = 1; i <= 10; i++) {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca sueldo (" + i + " de 10):"));

            if (sueldo > sueldo_max) {
                sueldo_max = sueldo;
            }
            
            suma += sueldo;
        }

        media = (float) suma / 10;
        String resultado = "Sueldo máximo: " + sueldo_max + "€\n" +
                           "Media de sueldos: " + media + "€";

        JOptionPane.showMessageDialog(null, resultado);
    }
}
