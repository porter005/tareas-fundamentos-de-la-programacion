package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class tarea7_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Introduce un número entero: ");
        
            int num = Integer.parseInt(reader.readLine());
            
            if (num >= 0 && num <= 9) {
                System.out.println("Resultado: Es un dígito positivo.");
            } else {
                System.out.println("Resultado: No es un dígito positivo (es negativo o tiene más de una cifra).");
            }
              
        }
    }
