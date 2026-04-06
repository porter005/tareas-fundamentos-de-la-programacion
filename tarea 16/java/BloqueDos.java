package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class BloqueDos {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Seleccione problema (6-10):");
        String input = br.readLine();
        if (input == null) return;
        int op = Integer.parseInt(input);

        switch (op) {
            case 6 -> problema6();
            case 7 -> problema7();
            case 8 -> problema8();
            case 9 -> problema9();
            case 10 -> problema10();
        }
    }

    // 6. Permutaciones únicas (Backtracking)
    static void problema6() throws IOException {
        char[] arr = br.readLine().toCharArray();
        Arrays.sort(arr);
        boolean[] used = new boolean[arr.length];
        permute(arr, used, "");
    }

    static void permute(char[] arr, boolean[] used, String current) {
        if (current.length() == arr.length) {
            System.out.println(current);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i] || (i > 0 && arr[i] == arr[i-1] && !used[i-1])) continue;
            used[i] = true;
            permute(arr, used, current + arr[i]);
            used[i] = false;
        }
    }

    // 7. Anagramas agrupados
    static void problema7() throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) words[i] = br.readLine();
        
        Map<String, List<String>> groups = new TreeMap<>();
        for (String s : words) {
            char[] t = s.toCharArray();
            Arrays.sort(t);
            String key = new String(t);
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        for (List<String> list : groups.values()) {
            Collections.sort(list);
            System.out.println(String.join(" ", list));
        }
    }

    // 8. Palíndromos
    static void problema8() throws IOException {
        int n = Integer.parseInt(br.readLine());
        boolean[] res = new boolean[n]; 
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String rev = new StringBuilder(s).reverse().toString();
            res[i] = s.equals(rev);
        }
        for (boolean b : res) System.out.println(b ? "SI" : "NO");
    }

    // 9. Frecuencia de caracteres
    static void problema9() throws IOException {
        String s = br.readLine();
        int[] f = new int[26];
        for (char c : s.toCharArray()) if (c >= 'a' && c <= 'z') f[c - 'a']++;
        int max = 0; char best = 'a';
        for (int i = 0; i < 26; i++) {
            if (f[i] > max) {
                max = f[i];
                best = (char) ('a' + i);
            }
        }
        System.out.println(best + " " + max); 
    }

    // 10. Distancia de Levenshtein (Programación Dinámica)
    static void problema10() throws IOException {
        String s1 = br.readLine();
        String s2 = br.readLine();
        int[][] dp = new int[s1.length() + 1][s2.length() + 1]; 
        
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) dp[i][j] = j;
                else if (j == 0) dp[i][j] = i;
                else {
                    int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + cost);
                }
            }
        }
        System.out.println(dp[s1.length()][s2.length()]); 
    }
}