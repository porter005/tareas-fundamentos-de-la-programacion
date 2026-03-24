package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarea15_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String seguir = "s";
        double sumaPromediosGrupal = 0;
        int totalAlumnos = 0;

        while (seguir.equalsIgnoreCase("s")) {
            totalAlumnos++;
            double sumaCalificaciones = 0;
            System.out.println("Alumno #" + totalAlumnos);
            
            for (int i = 1; i <= 3; i++) {
                System.out.print("  Nota parcial " + i + ": ");
                sumaCalificaciones += Double.parseDouble(reader.readLine());
            }
            
            double promedioAlumno = sumaCalificaciones / 3;
            sumaPromediosGrupal += promedioAlumno;
            
            System.out.println("  Promedio: " + promedioAlumno + (promedioAlumno >= 7 ? " (Acreditado)" : " (No acreditado)"));
            
            System.out.print("¿Evaluar otro alumno? (s/n): ");
            seguir = reader.readLine();
        }
        
        if (totalAlumnos > 0) {
            System.out.println("\nPromedio general del grupo: " + (sumaPromediosGrupal / totalAlumnos));
        }
    }
}