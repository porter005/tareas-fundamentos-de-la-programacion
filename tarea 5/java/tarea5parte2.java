package fundamentos_de_la_programacion;
import java.io.*;
public class tarea5parte2 {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//11
        System.out.print("11. Dias a Semanas (X): ");
		int X_dias = Integer.parseInt(br.readLine());
        System.out.println(X_dias/7 + " semanas y " + X_dias%7 + " dias");

        //12
        System.out.print("12.  Horas completas (Segundos S): ");
        int S_seg = Integer.parseInt(br.readLine());
        System.out.println("Horas: " + (S_seg / 3600));

        //13
        System.out.println("13. Reloj arena (7-4): " + (7 - 4));

        //14
        System.out.print("14.  Bisiestos hasta año Y: ");
        int Y_bis = Integer.parseInt(br.readLine());
        System.out.println("Bisiestos: " + (Y_bis / 4));

        //15
        System.out.print("15. [cite: 26] Perimetro Hexagono (Lado L): ");
        int L_hex = Integer.parseInt(br.readLine());
        System.out.println("Perimetro: " + (L_hex + L_hex + L_hex + L_hex + L_hex + L_hex));

        //16
        System.out.println("16.  Promedio Ponderado (N1, N2, N3):");
        double n_1 = Double.parseDouble(br.readLine());
        double n_2 = Double.parseDouble(br.readLine());
        double n_3 = Double.parseDouble(br.readLine());
        System.out.println("Final: " + (n_1 * 0.2 + n_2 * 0.3 + n_3 * 0.5));

        //17
        System.out.print("17.  Costo viaje (KM K): ");
        int K_viaje = Integer.parseInt(br.readLine());
        System.out.println("Costo: $" + ((K_viaje / 12) * 20));

        //18
        System.out.print("18. Escala Mapa (cm C): ");
        double C_mapa = Double.parseDouble(br.readLine());
        System.out.println("Kilometros: " + ((C_mapa * 500) / 1000));

        //19
        System.out.print("19.  Valor Absoluto (X): ");
        double X_abs = Double.parseDouble(br.readLine());
        System.out.println("Absoluto: " + Math.sqrt(X_abs * X_abs));

        //20
        System.out.print("20.  Complemento a 10 (D): ");
        int D_comp = Integer.parseInt(br.readLine());
        System.out.println("Falta: " + (10 - D_comp));
	}

}
