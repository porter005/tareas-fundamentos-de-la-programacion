package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc13_b {
    public static void main(String[] args) {
        int num, cont_ceros = 0, cont_pos = 0, cont_neg = 0;
        int suma_pos = 0, suma_neg = 0;
        float media_pos, media_neg;

        for (int i = 1; i <= 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce número (" + i + " de 10):"));

            if (num == 0) {
                cont_ceros++;
            } else if (num > 0) {
                cont_pos++;
                suma_pos += num;
            } else {
                cont_neg++;
                suma_neg += num;
            }
        }

        String mensaje = "Cantidad de ceros: " + cont_ceros + "\n";

        if (cont_pos == 0) {
            mensaje += "No se puede hacer la media de los positivos\n";
        } else {
            media_pos = (float) suma_pos / cont_pos;
            mensaje += "Media de los positivos: " + media_pos + "\n";
        }

        if (cont_neg == 0) {
            mensaje += "No se puede hacer la media de los negativos\n";
        } else {
            media_neg = (float) suma_neg / cont_neg;
            mensaje += "Media de los negativos: " + media_neg + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}

