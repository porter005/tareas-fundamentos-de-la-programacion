package fundamentos_de_la_programacion;

import java.io.*;

public class tarea8_ejrc14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Temp: "); int t = Integer.parseInt(br.readLine());
        System.out.print("Hum: "); int h = Integer.parseInt(br.readLine());

        if (t > 30 && h > 80) System.out.println("Sofocante");
        else if (t < 15 && h > 80) System.out.println("Frío Húmedo");
        else System.out.println("Normal");
    }
}