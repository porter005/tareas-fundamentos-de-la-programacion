package fundamentos_de_la_programacion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BloqueUno {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Seleccione problema (1-5):");
        int op = Integer.parseInt(br.readLine());

        switch (op) {
            case 1 -> problema1();
            case 2 -> problema2();
            case 3 -> problema3();
            case 4 -> problema4();
            case 5 -> problema5();
        }
    }

    // 1. Puntos más cercanos 
    static void problema1() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n], y = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        long minDist = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long d2 = (long) Math.pow(x[i] - x[j], 2) + (long) Math.pow(y[i] - y[j], 2);
                if (d2 < minDist) minDist = d2;
            }
        }
        System.out.println(minDist); 
    }

    // 2. Área de Polígono (Fórmula de Gauss) 
    static void problema2() throws IOException {
        int n = Integer.parseInt(br.readLine());
        double[] x = new double[n], y = new double[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Double.parseDouble(st.nextToken());
            y[i] = Double.parseDouble(st.nextToken());
        }
        double area = 0;
        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;
            area += (x[i] * y[next]) - (x[next] * y[i]); 
        }
        System.out.printf("%.1f\n", Math.abs(area) / 2.0); 
    }

    // 3. Conteo por Cuadrantes [cite: 20, 21]
    static void problema3() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] c = new int[7]; // 0:Ori, 1-4:Cuad, 5:EjeX, 6:EjeY
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (x == 0 && y == 0) c[0]++;
            else if (x == 0) c[6]++;
            else if (y == 0) c[5]++;
            else if (x > 0 && y > 0) c[1]++;
            else if (x < 0 && y > 0) c[2]++;
            else if (x < 0 && y < 0) c[3]++;
            else c[4]++;
        }
        String[] labels = {"Origen", "Cuadrante I", "Cuadrante II", "Cuadrante III", "Cuadrante IV", "Eje X", "Eje Y"};
        for (int i = 0; i < 7; i++) System.out.println(labels[i] + ": " + c[i]); 
    }

    // 4. Suma de combinaciones divisible por 3 [cite: 40]
    static void problema4() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                for (int k = j + 1; k < n; k++)
                    if ((arr[i] + arr[j] + arr[k]) % 3 == 0) count++;
        System.out.println(count);
    }

    // 5. Subconjuntos de tamaño K (Backtracking) [cite: 48, 49]
    static void problema5() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char[] chars = br.readLine().replaceAll(" ", "").toCharArray();
        java.util.Arrays.sort(chars);
        backtrack(chars, k, 0, "");
    }

    static void backtrack(char[] s, int k, int start, String curr) {
        if (curr.length() == k) {
            System.out.println(curr);
            return;
        }
        for (int i = start; i < s.length; i++) {
            backtrack(s, k, i + 1, curr + s[i]); 
        }
    }
}