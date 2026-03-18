package fundamentos_de_la_programacion;

import java.io.*;

public class tarea8_ejrc11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Puntos A: "); int a = Integer.parseInt(br.readLine());
        System.out.print("Puntos B: "); int b = Integer.parseInt(br.readLine());

        if (a == 6 && b <= 4) System.out.println("Gana A");
        else 
        	if (b == 6 && a <= 4) System.out.println("Gana B");
        else 
        	if (a == 5 && b == 5) System.out.println("Deben llegar a 7");
        else
        	if (a == 7 && b == 5) System.out.println("Gana A");
        else 
        	if (b == 7 && a == 5) System.out.println("Gana B");
        else 
        	if (a == 6 && b == 6) System.out.println("Muerte súbita");
        else System.out.println("En juego");
    }
}