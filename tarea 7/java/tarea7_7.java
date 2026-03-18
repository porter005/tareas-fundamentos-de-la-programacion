package fundamentos_de_la_programacion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarea7_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Introduce un número: ");
        
            String entrada = reader.readLine();
            double num = Double.parseDouble(entrada);
            
            if (num > 0) {
                System.out.println("El número es positivo.");
            } else if (num < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("El número es cero.");
            }    
        }
    }
