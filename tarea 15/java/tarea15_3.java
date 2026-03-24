package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class tarea15_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        
        do {
            System.out.println("\n1.- Suma\n2.- Multiplicación\n3.- División\n4.- Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(reader.readLine());
            
            if (opcion >= 1 && opcion <= 3) {
                System.out.print("Operando 1: ");
                double n1 = Double.parseDouble(reader.readLine());
                System.out.print("Operando 2: ");
                double n2 = Double.parseDouble(reader.readLine());
                
                switch (opcion) {
                    case 1: System.out.println("Resultado: " + (n1 + n2)); break;
                    case 2: System.out.println("Resultado: " + (n1 * n2)); break;
                    case 3: 
                        if (n2 != 0) System.out.println("Resultado: " + (n1 / n2));
                        else System.out.println("Error: División por cero.");
                        break;
                }
            }
        } while (opcion != 4);
        System.out.println("Programa terminado.");
    }
}
