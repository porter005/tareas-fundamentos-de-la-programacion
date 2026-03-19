package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin_ejrc5_b {
    public static void main(String[] args) {
        int n, num;

        n = (int) (Math.random() * 100) + 1;

        num = Integer.parseInt(JOptionPane.showInputDialog("Introduce número:"));

        while (num != n) {
            if (num > n) {
                JOptionPane.showMessageDialog(null, "Menor");
            } else {
                JOptionPane.showMessageDialog(null, "Mayor");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce número:"));
        }
        JOptionPane.showMessageDialog(null, "Acertaste...");
    }
}
