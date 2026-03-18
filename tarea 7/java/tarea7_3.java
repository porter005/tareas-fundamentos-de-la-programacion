package fundamentos_de_la_programacion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarea7_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Introduce los grados Celsius: ");
        double celsius = Double.parseDouble(br.readLine());
        
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit");
    }
}