package fundamentos_de_la_programacion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SistemaArqueoCaja {
    // PARTE 6: MODULARIZACIÓN - Uso de un lector global para todos los métodos
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int opc = 0;
        double fInicial = 0, vTotales = 0, gTotales = 0, eReal = 0;

        // PARTE 2: CICLO PRINCIPAL - Uso de do-while para mantener el sistema activo
        do {
            System.out.println("\n=== SISTEMA DE ARQUEO DE CAJA ===");
            System.out.println("1. Ingresar Fondo de Caja Inicial");
            System.out.println("2. Registrar Ventas del Turno");
            System.out.println("3. Registrar Gastos / Retiros");
            System.out.println("4. Realizar Corte de Caja (Resultado Final)");
            System.out.println("5. Salir del Sistema");
            System.out.print("Seleccione una opcion: ");

            opc = (int) capturarDatoSeguro(); // Captura defensiva para el menú

            // PARTE 3: SELECTOR DE OPCIONES - Uso de switch para gestionar el menú
            switch (opc) {
                case 1:
                    System.out.print("Ingrese el monto del Fondo Inicial: ");
                    fInicial = capturarDatoSeguro();
                    break;
                case 2:
                    vTotales = acumularMovimientos("Ventas");
                    break;
                case 3:
                    gTotales = acumularMovimientos("Gastos");
                    break;
                case 4:
                    System.out.print("Ingrese el Efectivo Real en Cajon: ");
                    eReal = capturarDatoSeguro();
                    mostrarResultadoCorte(fInicial, vTotales, gTotales, eReal);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
        } while (opc != 5);
    }

    // PARTE 1: CAPTURA DEFENSIVA - Valida texto antes de procesar el número
    public static double capturarDatoSeguro() throws IOException {
        double valor = 0;
        boolean esValido = false;

        while (!esValido) {
            String entrada = reader.readLine(); // Captura como texto (String)
            try {
                // PARTE 1.1: VALIDACIÓN - Intenta convertir el texto a número
                valor = Double.parseDouble(entrada);
                esValido = true;
            } catch (NumberFormatException e) {
                // Si hay letras, el programa no colapsa, atrapa el error aquí
                System.out.print("Error: Entrada rechazada (Solo numeros). Intente de nuevo: ");
            }
        }
        return valor;
    }

    // PARTE 4: CICLOS DE ACUMULACIÓN - Suma múltiples entradas
    public static double acumularMovimientos(String tipo) throws IOException {
        System.out.print("¿Cuantos movimientos de " + tipo + " desea ingresar?: ");
        int cant = (int) capturarDatoSeguro();
        double total = 0;

        for (int i = 1; i <= cant; i++) {
            System.out.print(tipo + " #" + i + ": ");
            total += capturarDatoSeguro(); // Acumulación técnica
        }
        return total;
    }

    // PARTE 5: CONDICIONALES DE CORTE - Determina el estado de la caja
    public static void mostrarResultadoCorte(double fondo, double ventas, double gastos, double real) {
        double teorico = (fondo + ventas) - gastos; // Formula oficial del examen
        double dif = real - teorico;

        System.out.println("\n--- BALANCE FINAL ---");
        System.out.println("Esperado en Sistema: $" + teorico);
        System.out.println("Efectivo Fisico:     $" + real);

        if (real == teorico) {
            System.out.println("Estado: CUADRADO (Diferencia: $0)");
        } else if (real < teorico) {
            System.out.println("Estado: FALTANTE de $" + Math.abs(dif));
        } else {
            System.out.println("Estado: SOBRANTE de $" + dif);
        }
        System.out.println("---------------------");
    }
}