package fundamentos_de_la_programacion;
import java.io.*;

public class tarea8_ejrc4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Edad: "); int edad = Integer.parseInt(br.readLine());
        System.out.print("Fuerza (0-100): "); int fuerza = Integer.parseInt(br.readLine());
        System.out.print("Visión (0.0-1.0): "); double vision = Double.parseDouble(br.readLine());

        if (edad >= 18 && edad <= 25) {
            if (fuerza > 80 && vision >= 0.8) System.out.println("Fuerzas Especiales");
            else if (fuerza > 50) System.out.println("Infantería");
            else System.out.println("No apto");
        } else if (edad > 25) {
            if (vision >= 0.9) System.out.println("Estratega");
            else System.out.println("No apto");
        } else {
            System.out.println("No apto");
        }
    }
}