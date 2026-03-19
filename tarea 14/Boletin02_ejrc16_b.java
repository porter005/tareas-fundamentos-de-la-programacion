package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc16_b {
    public static void main(String[] args) {
        int num;
        String tabla = "";

        num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (0 a 10):"));

        for (int i = 0; i <= 10; i++) {
            tabla += num + " x " + i + " = " + (num * i) + "\n";
        }

        JOptionPane.showMessageDialog(null, "Tabla del " + num + ":\n" + tabla);
    }
}
