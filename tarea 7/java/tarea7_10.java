package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class tarea7_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
            System.out.println("--- MENÚ DE OPERACIONES ---");
            System.out.println("1. Suma");
            System.out.println("2. Multiplicación");
            System.out.println("3. División");
            System.out.print("Elija una opción: ");
            int opcion = Integer.parseInt(reader.readLine());
            
            System.out.print("Ingrese el primer número: ");
            double n1 = Double.parseDouble(reader.readLine());
            System.out.print("Ingrese el segundo número: ");
            double n2 = Double.parseDouble(reader.readLine());
            
            double resultado;
            
            switch (opcion) {
                case 1:
                    resultado = n1 + n2;
                    System.out.println("Resultado de la suma: " + resultado);
                    break;
                case 2:
                    resultado = n1 * n2;
                    System.out.println("Resultado de la multiplicación: " + resultado);
                    break;
                case 3:
                    if (n2 != 0) {
                        resultado = n1 / n2;
                        System.out.println("Resultado de la división: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Intente del 1 al 3.");             
            }     
        }
    }
