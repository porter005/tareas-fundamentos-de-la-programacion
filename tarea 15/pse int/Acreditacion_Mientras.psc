Algoritmo Acreditacion_Mientras
    Definir calif, suma, ciclo Como Entero
    Definir resultado Como Real
    suma <- 0
    ciclo <- 0
    Mientras ciclo < 3 Hacer
        ciclo <- ciclo + 1
        Escribir "Introduce la calificación del parcial ", ciclo, ":"
        Leer calif
        suma <- suma + calif
    FinMientras
    resultado <- suma / 3
    Si resultado >= 7 Entonces
        Escribir "ALUMNO ACREDITADO"
    Sino
        Escribir "ALUMNO NO ACREDITADO"
    FinSi
FinAlgoritmo