package fundamentos_de_la_programacion;

import java.io.*;

public class tarea8_ejrc9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Lados A B C (C el mayor): ");
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        double c = Double.parseDouble(br.readLine());

        double sumaCatetos = (a * a) + (b * b);
        double hipotenusaSq = c * c;

        if (Math.abs(sumaCatetos - hipotenusaSq) < 0.0001) System.out.println("Rectángulo");
        else if (sumaCatetos > hipotenusaSq) System.out.println("Acutángulo");
        else System.out.println("Obtusángulo");
    }
}