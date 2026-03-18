package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc19_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        d = d + 1;
        if (d > 30) {
            d = 1; m = m + 1;
            if (m > 12) { m = 1; a = a + 1; }
        }
        System.out.println(d + "/" + m + "/" + a);
    }
}
