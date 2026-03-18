Algoritmo tarea8_ejrc8
    Leer n // Número de 4 cifras
    d1 = Trunc(n / 1000)
    d2 = Trunc(n / 100) MOD 10
    d3 = Trunc(n / 10) MOD 10
    d4 = n MOD 10
    Si d1 = d4 Y d2 = d3 Entonces
        Escribir "Es Capicúa"
    Sino
        Escribir "No lo es"
    FinSi
FinAlgoritmo