package fundamentos_de_la_programacion;

import java.io.*;

public class tarea8_ejrc13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Peso: ");
        double p = Double.parseDouble(br.readLine());

        if (p < 52) System.out.println("Mosca");
        else if (p <= 63) System.out.println("Ligero");
        else if (p <= 75) System.out.println("Mediano");
        else if (p <= 91) System.out.println("Pesado");
        else System.out.println("Súper Pesado");
    }
}