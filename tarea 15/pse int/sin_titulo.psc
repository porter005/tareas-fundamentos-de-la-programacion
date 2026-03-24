Algoritmo Evaluacion_Grupo
    Definir calif, suma, ciclo, num Como Entero
    Definir resultado, sumapromedio, promedio Como Real
    Definir opc Como Caracter
    opc <- 's'
    sumapromedio <- 0
    num <- 0
    Mientras (opc = 's' O opc = 'S') Hacer
        num <- num + 1
        suma <- 0
        ciclo <- 0
        Mientras ciclo < 3 Hacer
            ciclo <- ciclo + 1
            Escribir "Alumno ", num, " - Calif Parcial ", ciclo, ":"
            Leer calif
            suma <- suma + calif
        FinMientras
        resultado <- suma / 3
        sumapromedio <- sumapromedio + resultado
        Si resultado >= 7 Entonces
            Escribir "ALUMNO ACREDITADO"
        Sino
            Escribir "ALUMNO NO ACREDITADO"
        FinSi
        Escribir "¿Desea evaluar otro alumno? (s/n):"
        Leer opc
    FinMientras
    promedio <- sumapromedio / num
    Escribir "El promedio del grupo de ", num, " alumnos es: ", promedio
FinAlgoritmo