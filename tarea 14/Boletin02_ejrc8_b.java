package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc8_b {
    public static void main(String[] args) {
        int num, i;

        num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));

        i = 1;
        String resultado = ""; // Para acumular los números y mostrarlos juntos
        while (i <= num) {
            resultado += i + "\n";
            i++;
        }
        
        JOptionPane.showMessageDialog(null, "Números del 1 al " + num + ":\n" + resultado);
    }
}
