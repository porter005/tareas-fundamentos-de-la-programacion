Algoritmo tarea8_ejrc3
    Escribir "Coordenadas iniciales (x1, y1):"
    Leer x1, y1
    Escribir "Coordenadas finales (x2, y2):"
    Leer x2, y2
    dx = Abs(x1 - x2)
    dy = Abs(y1 - y2)
    Si (dx = 2 Y dy = 1) O (dx = 1 Y dy = 2) Entonces
        Escribir "Movimiento Válido"
    Sino
        Escribir "Inválido"
    FinSi
FinAlgoritmo