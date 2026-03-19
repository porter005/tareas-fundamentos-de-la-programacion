package fundamentos_de_la_programacion;
import javax.swing.JOptionPane;

public class Boletin02_ejrc3_b {
    public static void main(String[] args) {
        int num;

        String input = JOptionPane.showInputDialog("Introduzca un número:");
        num = Integer.parseInt(input);

        while (num != 0) {
            if (num % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Par");
            } else {
                JOptionPane.showMessageDialog(null, "Impar");
            }
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro número (0 para salir):"));
        }
    }
}
