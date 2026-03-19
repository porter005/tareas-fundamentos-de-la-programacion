package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc18_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   //Administra facturas calculando el total de ventas, los litros de un artículo específico y el conteo de facturas de alto valor.
        int codigo, litros, mas_600 = 0;
        float precio, total_factura, facturacion_total = 0, litros_articulo_1 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Factura nº " + i);
            System.out.print("  Código de producto: ");
            codigo = Integer.parseInt(br.readLine());
            System.out.print("  Cantidad en litros: ");
            litros = Integer.parseInt(br.readLine());
            System.out.print("  Precio por litro: ");
            precio = Float.parseFloat(br.readLine());

            total_factura = litros * precio; // Importe de la factura actual
            facturacion_total += total_factura; // Acumulado general

            if (codigo == 1) {
                litros_articulo_1 += litros;
            }
            if (total_factura > 600) {
                mas_600++;
            }
        }

        System.out.println("\n--- RESUMEN DE VENTAS ---");
        System.out.println("Facturación total: " + facturacion_total + "€");
        System.out.println("Litros vendidos del artículo 1: " + litros_articulo_1);
        System.out.println("Facturas superiores a 600€: " + mas_600);
    }
}
