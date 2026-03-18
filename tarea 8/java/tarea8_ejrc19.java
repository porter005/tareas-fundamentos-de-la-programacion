package fundamentos_de_la_programacion;

import java.io.*;

public class tarea8_ejrc19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Primer Octeto: ");
        int octeto = Integer.parseInt(br.readLine());

        if (octeto >= 1 && octeto <= 127) {
            System.out.println("Clase A - " + (octeto == 10 ? "Privada" : "Pública"));
        } else if (octeto >= 128 && octeto <= 191) {
            System.out.println("Clase B - " + (octeto == 172 ? "Privada" : "Pública"));
        } else if (octeto >= 192 && octeto <= 223) {
            System.out.println("Clase C - " + (octeto == 192 ? "Privada" : "Pública"));
        }
    }
}