package fundamentos_de_la_programacion;
import java.io.*;
public class tarea5parte1 {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//1
		System.out.print("1. Digito central (3 cifras): ");
        int n1 = Integer.parseInt(br.readLine());
        System.out.println("Resultado: " + ((n1 / 10) % 10));
        
        //2
        System.out.print("2. Cifras centrales (4 cifras): ");
        int n2 = Integer.parseInt(br.readLine());
        System.out.println("Resultado: " + ((n2 / 10) % 100));

        //3
        System.out.print("3.  Suma de extremos (3 cifras): ");
        int n3 = Integer.parseInt(br.readLine());
        System.out.println("Resultado: " + ((n3 / 100) + (n3 % 10)));

        //4
        System.out.print("4.  Primer digito (división única): ");
        int n4 = Integer.parseInt(br.readLine());
        System.out.println("Resultado: " + (n4 / 100));

        //5
        System.out.println("5.  Formador de números (A, B, C):");
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        System.out.println("Resultado: " + (A * 100 + B * 10 + C));

        //6
        System.out.println("6.  Banquete (Kilos M y Platos P):");
        int M = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        System.out.println("Fuera: " + ((M / 2) - P));

        //7
        System.out.print("7.  Fila de cine (Ticket N): ");
        int N = Integer.parseInt(br.readLine());
        System.out.println("Fila: " + ((N - 1) / 8 + 1));

        //8
        System.out.print("8.Sobrante Six-Pack (Sin %): ");
        int R = Integer.parseInt(br.readLine());
        System.out.println("Sobran: " + (R - ((R / 6) * 6)));

        //9
        System.out.print("9.  Cartas por jugador (J): ");
        int J = Integer.parseInt(br.readLine());
        System.out.println("Cartas: " + (52 / J));

        //10
        System.out.println("10. Saltos Grillo (Distancia D y Salto K):");
        int D_grillo = Integer.parseInt(br.readLine());
        int K_grillo = Integer.parseInt(br.readLine());
        System.out.println("Saltos: " + (D_grillo / K_grillo));

	}

}
