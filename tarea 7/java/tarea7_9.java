package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class tarea7_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
            System.out.print("Calificación Parcial 1: ");
            double n1 = Double.parseDouble(reader.readLine());
            
            System.out.print("Calificación Parcial 2: ");
            double n2 = Double.parseDouble(reader.readLine());
            
            System.out.print("Calificación Parcial 3: ");
            double n3 = Double.parseDouble(reader.readLine());
             double promedio = (n1 + n2 + n3) / 3;
             System.out.printf("El promedio obtenido es: %.2f\n", promedio);
            
            if (promedio >= 7.0) {
                System.out.println("Resultado: ALUMNO ACREDITADO");
            } else {
                System.out.println("Resultado: ALUMNO NO ACREDITADO");
            } 
       
        }
    }
