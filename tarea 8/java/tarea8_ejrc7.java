package fundamentos_de_la_programacion;
import java.io.*;

public class tarea8_ejrc7   {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Centro 1 y Radio: ");
        double x1 = Double.parseDouble(br.readLine()); double y1 = Double.parseDouble(br.readLine()); double r1 = Double.parseDouble(br.readLine());
        System.out.print("Centro 2 y Radio: ");
        double x2 = Double.parseDouble(br.readLine()); double y2 = Double.parseDouble(br.readLine()); double r2 = Double.parseDouble(br.readLine());

        double distanciaCuadrado = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double radiosSumadosCuadrado = Math.pow(r1 + r2, 2);

        if (distanciaCuadrado < radiosSumadosCuadrado) System.out.println("Traslapan");
        else if (distanciaCuadrado == radiosSumadosCuadrado) System.out.println("Tangentes");
        else System.out.println("No se tocan");
    }
}