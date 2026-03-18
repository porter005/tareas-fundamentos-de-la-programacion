package fundamentos_de_la_programacion;
import java.io.*;

public class tarea8_ejrc2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ángulo A: "); int a = Integer.parseInt(br.readLine());
        System.out.print("Ángulo B: "); int b = Integer.parseInt(br.readLine());
        System.out.print("Ángulo C: "); int c = Integer.parseInt(br.readLine());

        if (a + b + c == 180 && a > 0 && b > 0 && c > 0) {
            if (a == 90 || b == 90 || c == 90) System.out.println("Rectángulo");
            else if (a > 90 || b > 90 || c > 90) System.out.println("Obtusángulo");
            else System.out.println("Acutángulo");
        } else {
            System.out.println("Ángulos Inválidos");
        }
    }
}
