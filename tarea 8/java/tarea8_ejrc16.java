package fundamentos_de_la_programacion;

import java.io.*;

public class tarea8_ejrc16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("IP: "); String ip = br.readLine();
        System.out.print("Puerto: "); int puerto = Integer.parseInt(br.readLine());
        System.out.print("Protocolo: "); String proto = br.readLine();

        if (ip.equals("192.168.1.50")) {
            System.out.println("Tráfico Bloqueado");
        } else if ((puerto == 80 || puerto == 443) && proto.equalsIgnoreCase("TCP")) {
            System.out.println("Tráfico Permitido");
        } else if (puerto == 53 && proto.equalsIgnoreCase("UDP")) {
            System.out.println("Tráfico Permitido");
        } else {
            System.out.println("Bloqueado por defecto");
        }
    }
}
