Algoritmo tarea8_ejrc6
    Escribir "Esquina 1 (x1, y1) y Esquina 2 (x2, y2):"
    Leer x1, y1, x2, y2
    Escribir "Punto (px, py):"
    Leer px, py
    Si (px = x1 O px = x2) Y (py >= y1 Y py <= y2) O (py = y1 O py = y2) Y (px >= x1 Y px <= x2) Entonces
        Escribir "Borde"
    Sino
        Si px > x1 Y px < x2 Y py > y1 Y py < y2 Entonces
            Escribir "Dentro"
        Sino
            Escribir "Fuera"
        FinSi
    FinSi
FinAlgoritmo