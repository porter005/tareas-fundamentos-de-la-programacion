package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc14_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nota = Integer.parseInt(br.readLine());
        switch (nota) {
            case 0: case 1: case 2: case 3: case 4: System.out.println("Insuficiente"); break;
            case 5: System.out.println("Suficiente"); break;
            case 6: System.out.println("Bien"); break;
            case 7: case 8: System.out.println("Notable"); break;
            case 9: case 10: System.out.println("Sobresaliente"); break;
        }
    }
}
