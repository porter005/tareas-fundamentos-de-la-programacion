package fundamentos_de_la_programacion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarea7_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Introduce un numero entero: ");
        int num = Integer.parseInt(br.readLine());
        
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es PAR");
        } else {
            System.out.println("El numero " + num + " es IMPAR");
        }
    }
}