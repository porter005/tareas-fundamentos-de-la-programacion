package fundamentos_de_la_programacion;
import java.io.*;

public class tarea8_ejrc1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese el peso W: ");
        int w = Integer.parseInt(br.readLine());

        if (w > 2 && w % 2 == 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
