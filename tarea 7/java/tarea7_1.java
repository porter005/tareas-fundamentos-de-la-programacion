package fundamentos_de_la_programacion;
import java.io.*;
public class tarea7_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce la base: ");
        double base = Double.parseDouble(br.readLine());
        System.out.print("Introduce la altura: ");
        double altura = Double.parseDouble(br.readLine());
        System.out.println("El area es = " + (base * altura));
    }
}