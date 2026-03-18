package fundamentos_de_la_programacion;
import java.io.*;

public class tarea13_ejrc1_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca primer coeficiente (a):");
        double a = Double.parseDouble(br.readLine());
        System.out.println("Introduzca segundo coeficiente (b):");
        double b = Double.parseDouble(br.readLine());
        System.out.println("Introduzca tercer coeficiente (c):");
        double c = Double.parseDouble(br.readLine());
        double d = (b * b) - (4 * a * c);
        if (d < 0) {
            System.out.println("No existen soluciones reales");
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Solución 1: " + x1);
            System.out.println("Solución 2: " + x2);
        }
    }
}