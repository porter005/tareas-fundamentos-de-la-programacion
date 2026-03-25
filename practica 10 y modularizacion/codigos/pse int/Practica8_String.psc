Funcion cant <- ContarVocalesA(texto)
    Definir cant, i Como Entero
    cant <- 0
    Para i <- 0 Hasta Longitud(texto) - 1 Hacer
        Si Subcadena(texto, i, i) = "a" o Subcadena(texto, i, i) = "A" Entonces
            cant <- cant + 1
        FinSi
    FinPara
FinFuncion

Algoritmo Practica8_String
    Definir cadena, cadena2, subCade Como Caracter
    Definir total Como Entero
    
    cadena <- "nunca me digas que no puedo nunca me digas que creer no ves que tengo miedo no me pongas tus cadenas"
    
    Escribir "La cadena tiene una cantidad de caracteres:"
    Escribir Longitud(cadena)
    
    Escribir "Mayúsculas:"
    Escribir Mayusculas(cadena)
    
    cadena2 <- " perdóname si no te sigo pero me aburre caminar..."
    cadena <- Concatenar(cadena, cadena2)
    
    Escribir "Subcadena pos 100:"
    subCade <- Subcadena(cadena, 100, Longitud(cadena))
    Escribir subCade
    
    total <- ContarVocalesA(cadena)
    Escribir "Total de vocales A encontradas:"
    Escribir total
FinAlgoritmo