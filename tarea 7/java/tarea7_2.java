package fundamentos_de_la_programacion;
import java.io.*;
public class tarea7_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("C1: "); int c1 = Integer.parseInt(br.readLine());
        System.out.print("C2: "); int c2 = Integer.parseInt(br.readLine());
        System.out.print("C3: "); int c3 = Integer.parseInt(br.readLine());
        double prom = (c1 + c2 + c3) / 3.0;
        System.out.println("el promedio es = " + prom);
    }
}
