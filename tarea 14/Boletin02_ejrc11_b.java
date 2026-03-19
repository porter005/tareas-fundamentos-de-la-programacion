package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc11_b {
    public static void main(String[] args) {
        long producto = 1;

        for (int i = 1; i < 20; i += 2) {
            producto = producto * i;
        }

        JOptionPane.showMessageDialog(null, "La multiplicación de los 10 primeros impares: " + producto);
    }
}
