package fundamentos_de_la_programacion;
import java.io.*;

public class tarea8_ejrc3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("x1 y1: ");
        int x1 = Integer.parseInt(br.readLine()); int y1 = Integer.parseInt(br.readLine());
        System.out.print("x2 y2: ");
        int x2 = Integer.parseInt(br.readLine()); int y2 = Integer.parseInt(br.readLine());

        int dx = Math.abs(x1 - x2);
        int dy = Math.abs(y1 - y2);

        if ((dx == 2 && dy == 1) || (dx == 1 && dy == 2)) {
            System.out.println("Movimiento Válido");
        } else {
            System.out.println("Inválido");
        }
    }
}