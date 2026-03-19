package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc19_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int codigo, litros, mas_600 = 0;
        float precio = 0, total_factura, facturacion_total = 0, litros_articulo_1 = 0;
//Gestión de facturas con precios fijos por código
        for (int i = 1; i <= 5; i++) {
            System.out.println("Factura nº " + i);
            System.out.print("  Código: ");
            codigo = Integer.parseInt(br.readLine());
            System.out.print("  Litros: ");
            litros = Integer.parseInt(br.readLine());

            // Asignación de precio según código
            switch (codigo) {
                case 1: precio = 0.6f; litros_articulo_1 += litros; break;
                case 2: precio = 3.0f; break;
                case 3: precio = 1.25f; break;
                default: precio = 0; break;
            }

            total_factura = litros * precio;
            facturacion_total += total_factura;
            if (total_factura > 600) mas_600++;
        }

        System.out.println("\nRESUMEN:");
        System.out.println("Total: " + facturacion_total + "€");
        System.out.println("Litros Art. 1: " + litros_articulo_1);
        System.out.println("Facturas > 600€: " + mas_600);
    }
}