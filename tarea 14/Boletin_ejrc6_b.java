package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin_ejrc6_b {
    public static void main(String[] args) {
        int num, suma = 0;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número:"));
            suma += num;
        } while (num != 0);

        JOptionPane.showMessageDialog(null, "La suma de todos los números es: " + suma);
    }
}
