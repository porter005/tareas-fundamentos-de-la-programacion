package fundamentos_de_la_programacion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarea6parte3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 21.
        System.out.println("21. Platos totales (M) y platos servidos (P):");
        int m21 = Integer.parseInt(br.readLine());
        int p21 = Integer.parseInt(br.readLine());
        int invitadosP = m21 / 2; 
        if (p21 < invitadosP) {
            System.out.println("Invitados fuera: " + (invitadosP - p21));
        }

        // 22. 
        System.out.println("22. Número de ticket (N):");
        int n22 = Integer.parseInt(br.readLine());
        if (n22 >= 0) { 
            int fila = (n22 - 1) / 8 + 1;
            System.out.println("Fila: " + fila);
        }

        // 23. 
        System.out.println("23. Cantidad de refrescos (R):");
        int r23 = Integer.parseInt(br.readLine());
        int sobrante = r23 - ((r23 / 6) * 6); 
        if (sobrante > 0) {
            System.out.println("Sobrante: " + sobrante); 
        }

        // 24. 
        System.out.println("24. Número de jugadores (J):");
        int j24 = Integer.parseInt(br.readLine());
        if (j24 > 0) { 
            System.out.println("Cartas por persona: " + (52 / j24));
        }

        // 25.
        System.out.println("25. Distancia (D) y Salto (K):");
        int d25 = Integer.parseInt(br.readLine());
        int k25 = Integer.parseInt(br.readLine());
        if (d25 % k25 == 0) { 
            System.out.println("Saltos exactos: " + (d25 / k25));
        }

        // 26.
        System.out.println("26. Días totales (X):");
        int x26 = Integer.parseInt(br.readLine());
        int semanas = x26 / 7;
        int resto26 = x26 % 7;
        if (semanas == 1) { 
            System.out.println(semanas + " semana y " + resto26 + " días");
        } else {
            System.out.println(semanas + " semanas y " + resto26 + " días");
        }

        // 27.
        System.out.println("27. Segundos laborales (S):");
        int s27 = Integer.parseInt(br.readLine());
        int horas27 = s27 / 3600;
        if (horas27 > 24) { 
            horas27 = horas27 % 24;
        }
        System.out.println("Horas: " + horas27);

        // 28.
        System.out.println("28. Ejecutar proceso (7-4)? (si=1):");
        int proc28 = Integer.parseInt(br.readLine());
        int diff = 7 - 4;
        if (diff == 3) { 
            System.out.println("Éxito: Diferencia de 3 minutos.");
        }

        // 29. 
        System.out.println("29. Año (Y):");
        int y29 = Integer.parseInt(br.readLine());
        if (y29 != 0) { 
            System.out.println("Resultado bisiesto (div/4): " + (y29 / 4));
        }

        // 30.
        System.out.println("30. Lado (L):");
        int l30 = Integer.parseInt(br.readLine());
        if (l30 > 0) {
            int perimetro = l30 + l30 + l30 + l30 + l30 + l30; 
            System.out.println("Perímetro: " + perimetro);
        }
    }
}