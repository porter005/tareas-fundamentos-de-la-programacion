package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarea15_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double totalManoObra = 0;
        int conteoManoObra = 0;
        int op;

        do {
            System.out.println("\n--- CONTROL DE INSUMOS ---");
            System.out.println("1.- Mano de Obra\n2.- Salir");
            System.out.print("Opción: ");
            op = Integer.parseInt(reader.readLine());

            if (op == 1) {
                String continuar;
                do {
                    conteoManoObra++;
                    System.out.print("Valor del concepto " + conteoManoObra + ": ");
                    totalManoObra += Double.parseDouble(reader.readLine());
                    System.out.print("¿Agregar otro de esta categoría? (s/n): ");
                    continuar = reader.readLine();
                } while (continuar.equalsIgnoreCase("s"));
            }
        } while (op != 2);

        System.out.println("Total Mano de Obra: $" + totalManoObra + " (" + conteoManoObra + " conceptos)");
    }
}