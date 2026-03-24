package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarea15_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double suma = 0;
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Introduce la calificación del parcial " + i + ": ");
            // Leemos la línea y la convertimos a double
            double calif = Double.parseDouble(reader.readLine());
            suma += calif;
        }
        
        double promedio = suma / 3;
        System.out.println("Promedio final: " + promedio);
        
        if (promedio >= 7) {
            System.out.println("ALUMNO ACREDITADO");
        } else {
            System.out.println("ALUMNO NO ACREDITADO");
        }
    }
}