package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc13_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num, cont_ceros = 0, cont_pos = 0, cont_neg = 0;
        int suma_pos = 0, suma_neg = 0;
        float media_pos, media_neg;
//Pide 10 números para mostrar la media de los positivos, la media de los negativos y la cantidad de ceros.
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce número: ");
            num = Integer.parseInt(br.readLine());

            if (num == 0) {
                cont_ceros++;
            } else if (num > 0) {
                cont_pos++;
                suma_pos += num;
            } else {
                cont_neg++;
                suma_neg += num;
            }
        }

        // Resultados
        System.out.println("Cantidad de ceros: " + cont_ceros);
        
        if (cont_pos == 0) {
            System.out.println("No se puede hacer la media de los positivos");
        } else {
            media_pos = (float) suma_pos / cont_pos;
            System.out.println("Media de los positivos: " + media_pos);
        }

        if (cont_neg == 0) {
            System.out.println("No se puede hacer la media de los negativos");
        } else {
            media_neg = (float) suma_neg / cont_neg;
            System.out.println("Media de los negativos: " + media_neg);
        }
    }
}