package fundamentos_de_la_programacion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarea7_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Introduce la velocidad: ");
        double velocidad = Double.parseDouble(br.readLine());
        
        System.out.print("Introduce el tiempo: ");
        double tiempo = Double.parseDouble(br.readLine());
        
        double distancia = velocidad * tiempo;
        
        System.out.println("La distancia recorrida por el automovil es: " + distancia);
    }
}