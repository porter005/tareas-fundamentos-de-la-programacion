Algoritmo tarea8_ejrc7
    Leer x1, y1, r1, x2, y2, r2
    distCuadrado = (x2 - x1)^2 + (y2 - y1)^2
    radiosCuadrado = (r1 + r2)^2
    Si distCuadrado < radiosCuadrado Entonces
        Escribir "Traslapan"
    Sino
        Si distCuadrado = radiosCuadrado Entonces
            Escribir "Tangentes"
        Sino
            Escribir "No se tocan"
        FinSi
    FinSi
FinAlgoritmo