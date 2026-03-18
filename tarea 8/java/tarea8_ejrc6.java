package fundamentos_de_la_programacion;

import java.io.*;

public class tarea8_ejrc6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Esquina 1 (x1 y1): ");
        int x1 = Integer.parseInt(br.readLine()); int y1 = Integer.parseInt(br.readLine());
        System.out.print("Esquina 2 (x2 y2): ");
        int x2 = Integer.parseInt(br.readLine()); int y2 = Integer.parseInt(br.readLine());
        System.out.print("Punto (px py): ");
        int px = Integer.parseInt(br.readLine()); int py = Integer.parseInt(br.readLine());

        if ((px == x1 || px == x2) && (py >= y1 && py <= y2) || (py == y1 || py == y2) && (px >= x1 && px <= x2)) {
            System.out.println("Borde");
        } else if (px > x1 && px < x2 && py > y1 && py < y2) {
            System.out.println("Dentro");
        } else {
            System.out.println("Fuera");
        }
    }
}