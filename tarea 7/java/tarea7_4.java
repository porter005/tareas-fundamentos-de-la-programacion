package fundamentos_de_la_programacion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarea7_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double tipoCambio = 18.50;
        
        System.out.print("Introduce la cantidad en Pesos Mexicanos (MXN): ");
        double pesos = Double.parseDouble(br.readLine());
        
        double dolares = pesos / tipoCambio;
        
        System.out.println(pesos + " MXN equivalen a " + dolares + " USD");
    }
}