package fundamentos_de_la_programacion;
import java.io.*;

public class tarea8_ejrc12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Día: "); int d = Integer.parseInt(br.readLine());
        System.out.print("Mes: "); int m = Integer.parseInt(br.readLine());
        System.out.print("Bisiesto (true/false): "); boolean bisiesto = Boolean.parseBoolean(br.readLine());

        boolean valida = false;
        if (m >= 1 && m <= 12) {
            if (m == 2) {
                if (bisiesto && d >= 1 && d <= 29) valida = true;
                else if (!bisiesto && d >= 1 && d <= 28) valida = true;
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                if (d >= 1 && d <= 30) valida = true;
            } else {
                if (d >= 1 && d <= 31) valida = true;
            }
        }
        System.out.println(valida ? "Fecha Válida" : "Inválida");
    }
}