package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc10_cuadrotexto {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("a:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("b:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("c:"));
        
        String res = "";
        if (a > b && b > c) res = a + ", " + b + ", " + c;
        if (a > c && c > b) res = a + ", " + c + ", " + b;
        if (b > a && a > c) res = b + ", " + a + ", " + c;
        if (b > c && c > a) res = b + ", " + c + ", " + a;
        if (c > a && a > b) res = c + ", " + a + ", " + b;
        if (c > b && b > a) res = c + ", " + b + ", " + a;
        
        JOptionPane.showMessageDialog(null, res);
    }
}
