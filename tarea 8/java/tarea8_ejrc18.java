package fundamentos_de_la_programacion;
import java.io.*;

public class tarea8_ejrc18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("S1 S2 S3: ");
        double s1 = Double.parseDouble(br.readLine());
        double s2 = Double.parseDouble(br.readLine());
        double s3 = Double.parseDouble(br.readLine());

        if (Math.abs(s1 - s2) > 20 || Math.abs(s1 - s3) > 20 || Math.abs(s2 - s3) > 20) {
            System.out.println("Error de Sensor");
        } else {
            double prom = (s1 + s2 + s3) / 3.0;
            if (prom > 80) System.out.println("Alerta de Incendio");
            else if (prom > 60) System.out.println("Alerta de Sobrecalentamiento");
            else System.out.println("Estado Normal");
        }
    }
}