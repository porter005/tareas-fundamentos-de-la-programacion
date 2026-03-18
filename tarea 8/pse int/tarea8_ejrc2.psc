Algoritmo tarea8_ejrc2
    Escribir "Ingrese ángulos A, B y C:"
    Leer a, b, c
    Si a + b + c = 180 Y a > 0 Y b > 0 Y c > 0 Entonces
        Si a = 90 O b = 90 O c = 90 Entonces
            Escribir "Rectángulo"
        Sino
            Si a > 90 O b > 90 O c > 90 Entonces
                Escribir "Obtusángulo"
            Sino
                Escribir "Acutángulo"
            FinSi
        FinSi
    Sino
        Escribir "Ángulos Inválidos"
    FinSi
FinAlgoritmo