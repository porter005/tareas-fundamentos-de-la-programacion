package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc20_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d1 = Integer.parseInt(br.readLine());
        int m1 = Integer.parseInt(br.readLine());
        int a1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());
        int m2 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int total = (d2 - d1) + 30 * (m2 - m1) + 360 * (a2 - a1);
        System.out.println("Diferencia: " + total + " días");
    }
}