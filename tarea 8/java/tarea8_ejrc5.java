package fundamentos_de_la_programacion;
import java.io.*;

public class tarea8_ejrc5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Año: ");
        int y = Integer.parseInt(br.readLine());

        if (y % 2 == 0 && y % 10 != 0 && y % 4 == 2 && y >= 2000 && y <= 3000) {
            System.out.println("Año de Oro");
        } else {
            System.out.println("Año Ordinario");
        }
    }
}