Algoritmo tarea8_ejrc16
    Leer ip, puerto, proto
    Si ip = "192.168.1.50" Entonces
        Escribir "Tráfico Bloqueado"
    Sino
        Si (puerto = 80 O puerto = 443) Y proto = "TCP" Entonces
            Escribir "Tráfico Permitido"
        Sino
            Si puerto = 53 Y proto = "UDP" Entonces
                Escribir "Tráfico Permitido"
            Sino
                Escribir "Bloqueado por defecto"
            FinSi
        FinSi
    FinSi
FinAlgoritmo