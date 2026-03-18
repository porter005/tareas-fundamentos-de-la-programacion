package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc21_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());
        s = s + 1;
        if (s >= 60) {
            s = 0; m = m + 1;
            if (m >= 60) {
                m = 0; h = h + 1;
                if (h >= 24) h = 0;
            }
        }
        System.out.println(h + ":" + m + ":" + s);
    }
}
