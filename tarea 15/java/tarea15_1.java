package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarea15_1 {
    public static void main(String[] args) throws IOException {
        // Configuración de lectura
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Introduce el número de la tabla: ");
        int num = Integer.parseInt(reader.readLine());

        // VARIANTE: Ciclo Para (for)
        System.out.println("--- Tabla con FOR ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        // VARIANTE: Ciclo Mientras (while)
        System.out.println("--- Tabla con WHILE ---");
        int j = 1;
        while (j <= 10) {
            System.out.println(num + " * " + j + " = " + (num * j));
            j++;
        }
    }
}