package fundamentos_de_la_programacion;
import javax.swing.JOptionPane;

public class Boletin02_ejrc18_b {
    public static void main(String[] args) {
        int codigo, litros, mas_600 = 0;
        float precio, total_factura, facturacion_total = 0, litros_articulo_1 = 0;

        for (int i = 1; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Factura nº " + i + "\nCódigo del producto:"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Factura nº " + i + "\nCantidad en litros:"));
            precio = Float.parseFloat(JOptionPane.showInputDialog("Factura nº " + i + "\nPrecio por litro:"));

            total_factura = litros * precio;
            facturacion_total += total_factura;

            if (codigo == 1) {
                litros_articulo_1 += litros;
            }
            if (total_factura > 600) {
                mas_600++;
            }
        }

        String resumen = "RESUMEN DE VENTAS\n" +
                         "Facturación total: " + facturacion_total + "€\n" +
                         "Litros del artículo 1: " + litros_articulo_1 + "\n" +
                         "Facturas > 600€: " + mas_600;

        JOptionPane.showMessageDialog(null, resumen);
    }
}
