package fundamentos_de_la_programacion;

import java.io.*;

public class tarea8_ejrc20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Tráfico (Voz/Video/Descarga): "); String t = br.readLine();
        System.out.print("Latencia (ms): "); int l = Integer.parseInt(br.readLine());

        if (t.equalsIgnoreCase("Voz") || t.equalsIgnoreCase("Video")) {
            if (l < 50) System.out.println("Prioridad Alta");
            else System.out.println("Prioridad Media");
        } else if (t.equalsIgnoreCase("Descarga")) {
            if (l < 150) System.out.println("Prioridad Baja");
            else System.out.println("Prioridad Mínima");
        }
    }
}