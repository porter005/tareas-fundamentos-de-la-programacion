package fundamentos_de_la_programacion;
import javax.swing.JOptionPane;

public class Boletin02_ejrc19_b {
    public static void main(String[] args) {
        int codigo, litros, mas_600 = 0;
        float precio = 0, total_factura, facturacion_total = 0, litros_articulo_1 = 0;

        for (int i = 1; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Factura " + i + "\nCódigo (1, 2 o 3):"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Factura " + i + "\nCantidad litros:"));

            if (codigo == 1) {
                precio = 0.6f;
                litros_articulo_1 += litros;
            } else if (codigo == 2) {
                precio = 3.0f;
            } else if (codigo == 3) {
                precio = 1.25f;
            }

            total_factura = litros * precio;
            facturacion_total += total_factura;
            if (total_factura > 600) mas_600++;
        }

        String res = "Facturación: " + facturacion_total + "€\n" +
                     "Litros Art. 1: " + litros_articulo_1 + "\n" +
                     "Facturas > 600€: " + mas_600;
        JOptionPane.showMessageDialog(null, res);
    }
}
