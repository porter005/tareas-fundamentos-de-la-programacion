package fundamentos_de_la_programacion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarea6parte1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       // 1.
        System.out.println("1. Caracol - Ingrese Altura(H), Subida(S), Resbalón(R):");
        int h = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        if (s >= h) {
            System.out.println("Días: 1");
        } else {
            int dias = (h - r - 1) / (s - r) + 1;
            System.out.println("Días: " + dias);
        }

       // 2.
        System.out.println("2. Reparto - Monedas(N), Piratas(K):");
        int n2 = Integer.parseInt(br.readLine());
        int k2 = Integer.parseInt(br.readLine());
        int q2 = n2 / k2;
        int capitan = 0;
        if (n2 % k2 != 0) {
            capitan = n2 - (q2 * k2);
        }
        System.out.println("Capitán se lleva: " + capitan);

        // 3.
        System.out.println("3. Tornillos - Total(X):");
        int x3 = Integer.parseInt(br.readLine());
        int cajas3 = x3 / 12;
        int sueltos3 = 0;
        if (x3 % 12 != 0) {
            sueltos3 = x3 - (cajas3 * 12);
        }
        System.out.println("Cajas: " + cajas3 + ", Sueltos: " + sueltos3);

        // 4.
        System.out.println("4. Cajero - Cantidad a retirar:");
        int cant4 = Integer.parseInt(br.readLine());
        int entrega4 = (cant4 / 100) * 100;
        if (entrega4 < cant4) {
            System.out.println("Pérdida del usuario: " + (cant4 - entrega4));
        }

        // 5. 
        System.out.println("5. Reloj - Total minutos:");
        int min5 = Integer.parseInt(br.readLine());
        int horas5 = min5 / 60;
        if (horas5 >= 24) {
            horas5 = horas5 % 24;
        }
        System.out.println("Hora actual: " + horas5 + ":" + (min5 % 60));

       // 6. 
        System.out.println("6. Segundos - Total:");
        int seg6 = Integer.parseInt(br.readLine());
        int h6 = seg6 / 3600;
        int m6 = (seg6 % 3600) / 60;
        int s6 = seg6 % 60;
        if (h6 > 23) h6 %= 24; 
        System.out.println("Formato: " + h6 + "h " + m6 + "m " + s6 + "s");

        // 7. 
        System.out.println("7. Parking - Minutos:");
        int min7 = Integer.parseInt(br.readLine());
        int hBase7 = min7 / 60;
        if (min7 % 60 > 0) {
            hBase7 = hBase7 + 1;
        }
        System.out.println("Horas a cobrar: " + hBase7);

        // 8. 
        System.out.println("8. Inversión - Número de 2 cifras:");
        int n8 = Integer.parseInt(br.readLine());
        int d8 = n8 / 10;
        int u8 = n8 % 10;
        if (n8 >= 10 && n8 <= 99) {
            System.out.println("Invertido: " + (u8 * 10 + d8));
        }

       // 9.
        System.out.println("9. Círculo - Radio entero:");
        int r9 = Integer.parseInt(br.readLine());
        int area9 = (int)(3.1416 * r9 * r9);
        if (area9 > 0) {
            System.out.println("Área truncada: " + area9);
        }

        // 10.
        System.out.println("10. Intercambio - Valor A y B:");
        int a10 = Integer.parseInt(br.readLine());
        int b10 = Integer.parseInt(br.readLine());
        int originalB = b10;
        a10 = a10 + b10;
        b10 = a10 - b10;
        a10 = a10 - b10;
        if (a10 == originalB) {
            System.out.println("Intercambio exitoso. A: " + a10 + " B: " + b10);
        }
    }
}
	
