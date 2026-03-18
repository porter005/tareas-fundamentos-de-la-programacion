package fundamentos_de_la_programacion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarea6parte4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 31. 
        System.out.println("31. Ingrese tres notas (N1, N2, N3):");
        double n1 = Double.parseDouble(br.readLine());
        double n2 = Double.parseDouble(br.readLine());
        double n3 = Double.parseDouble(br.readLine());
       double promedio = (n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5);
        if (promedio >= 6.0) {
           System.out.println("Promedio satisfactorio: " + promedio);
        }

        // 32. 
        System.out.println("32. Kilómetros a recorrer (K):");
        int k32 = Integer.parseInt(br.readLine());
        int costo = (k32 / 12) * 20; 
        if (k32 > 500) { 
            costo += 50; 
        }
        System.out.println("Costo total: " + costo);

        // 33. 
        System.out.println("33. Centímetros en el mapa (C):");
        double c33 = Double.parseDouble(br.readLine());
        double km = (c33 * 500) / 1000; 
        if (km < 1) {
           System.out.println("Resultado: " + (km * 1000) + " metros");
        } else {
            System.out.println("Resultado: " + km + " km");
        }

        // 34. 
        System.out.println("34. Ingrese un número (X):");
        double x34 = Double.parseDouble(br.readLine());
        double resultado34 = Math.sqrt(x34 * x34); 
        if (resultado34 != x34) {
            System.out.println("El número era negativo, se convirtió a positivo: " + resultado34); 
        } else {
            System.out.println("Valor absoluto: " + resultado34);
        }

        // 35.
        System.out.print("35. Ingrese un dígito (0-9): ");
        int d35 = Integer.parseInt(br.readLine());
        if (d35 >= 0 && d35 <= 9) { 
            System.out.println("Complemento (10 - D): " + (10 - d35));
        }
    }
}