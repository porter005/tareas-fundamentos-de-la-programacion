package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc4_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num, contador;
//Cuenta cuántos números se han introducido hasta que se teclea uno negativo.
        System.out.print("Introduzca un número: ");
        num = Integer.parseInt(br.readLine());
        contador = 0; 

        while (num >= 0) {
            contador++; // Incrementa el contador
            System.out.print("Introduzca otro número: ");
            num = Integer.parseInt(br.readLine());
        }
        
        System.out.println("Se han introducido: " + contador + " números");
    }
}
