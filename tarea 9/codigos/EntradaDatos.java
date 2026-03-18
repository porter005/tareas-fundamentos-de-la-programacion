package fundamentos_de_la_programacion;

import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class EntradaDatos {
    public static void main(String[] args) throws IOException {
        // 1. SCANNER
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = leer.nextLine();

        // 2. BUFFERED READER
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingresa tu edad: ");
        int edad = Integer.parseInt(br.readLine());

        // 3. JOPTIONPANE (Gráfico)
        JOptionPane.showMessageDialog(null, "Hola " + nombre + ", tienes " + edad + " años.");
    }
}