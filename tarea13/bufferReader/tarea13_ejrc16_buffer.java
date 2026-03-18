package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc16_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mes = Integer.parseInt(br.readLine());
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: System.out.println("31 días"); break;
            case 4: case 6: case 9: case 11: System.out.println("30 días"); break;
            case 2: System.out.println("28 días"); break;
        }
    }
}