package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarea6parte2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 11. 
        System.out.print("11. Ingrese número de 4 dígitos para Checksum: ");
        int n11 = Integer.parseInt(br.readLine());
        int d1 = n11 / 1000;
        int d2 = (n11 / 100) % 10;
        int d3 = (n11 / 10) % 10;
        int d4 = n11 % 10;
        if (n11 >= 1000 && n11 <= 9999) {
            System.out.println("Checksum: " + (d1 + d2 + d3 + d4)); 
        }

        // 12. 
        System.out.print("12. Ingrese exponente (potencia de 2): ");
        int exp12 = Integer.parseInt(br.readLine());
        int totalHosts = (int) Math.pow(2, exp12);
        if (totalHosts > 2) {
            System.out.println("Hosts disponibles: " + (totalHosts - 2)); 
        }

        // 13. 
        System.out.print("13. Ingrese ID de usuario: ");
        int id13 = Integer.parseInt(br.readLine());
        int server = id13 % 3;
        if (server == 0) System.out.println("Servidor: Alpha"); 
        if (server == 1) System.out.println("Servidor: Beta");  
        if (server == 2) System.out.println("Servidor: Gamma"); 

        // 14. 
        System.out.print("14. Ingrese Dígito y Llave: ");
        int digito14 = Integer.parseInt(br.readLine());
        int llave14 = Integer.parseInt(br.readLine());
        int suma14 = digito14 + llave14;
        if (suma14 >= 10) suma14 -= 10; 
        System.out.println("Cifrado: " + suma14);

        // 15. 
        System.out.print("15. Distancia y Velocidad: ");
        int d15 = Integer.parseInt(br.readLine());
        int v15 = Integer.parseInt(br.readLine());
        int t15 = d15 / v15;
        if (d15 % v15 > 0) t15 += 1; 
        System.out.println("Tiempo total: " + t15);

        // 16.
        System.out.print("16. Número de 3 cifras: ");
        int n16 = Integer.parseInt(br.readLine());
        if (n16 >= 100 && n16 <= 999) {
            System.out.println("Dígito central: " + (n16 / 10 % 10));
        }

        // 17. 
        System.out.print("17. Número de 4 cifras: ");
        int n17 = Integer.parseInt(br.readLine());
        if (n17 >= 1000 && n17 <= 9999) {
            System.out.println("Centro: " + (n17 / 10 % 100)); 
        }

        // 18. 
        System.out.print("18. Ingrese número de 3 cifras: ");
        int n18 = Integer.parseInt(br.readLine());
        if (n18 > 0) {
            int primero = n18 / 100;
            int ultimo = n18 % 10;
            System.out.println("Suma extremos: " + (primero + ultimo));
        }

        // 19. 
        System.out.print("19. Ingrese número de 3 cifras: ");
        int n19 = Integer.parseInt(br.readLine());
        int primerD = n19 / 100;
        if (primerD >= 1 && primerD <= 9) {
            System.out.println("Primer dígito: " + primerD); 
        }

        // 20. 
        System.out.print("20. Ingrese 3 dígitos (A, B, C): ");
        int a20 = Integer.parseInt(br.readLine());
        int b20 = Integer.parseInt(br.readLine());
        int c20 = Integer.parseInt(br.readLine());
        if (a20 < 10 && b20 < 10 && c20 < 10) {
            System.out.println("Número formado: " + (a20 * 100 + b20 * 10 + c20));
        }
    }
}
