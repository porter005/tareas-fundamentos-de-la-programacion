Subproceso AnalizarTexto(cadena)
    Definir i, letras, num, may, min Como Entero
    Definir letra Como Caracter
    letras <- 0; num <- 0; may <- 0; min <- 0
    
    Para i <- 0 Hasta Longitud(cadena) - 1 Hacer
        letra <- Subcadena(cadena, i, i)
        Si letra >= "0" y letra <= "9" Entonces
            num <- num + 1
        FinSi
        Si (letra >= "a" y letra <= "z") o (letra >= "A" y letra <= "Z") Entonces
            letras <- letras + 1
            Si letra = Mayusculas(letra) Entonces
                may <- may + 1
            Sino
                min <- min + 1
            FinSi
        FinSi
    FinPara
    
    Escribir "Letras encontradas:"
    Escribir letras
    Escribir "Números encontrados:"
    Escribir num
    Escribir "Mayúsculas:"
    Escribir may
    Escribir "Minúsculas:"
    Escribir min
FinSubproceso

Algoritmo Practica8_Character
    Definir frase Como Caracter
    frase <- " 1973 Perdóname si no te sigo pero me Aburre caminar..."
    AnalizarTexto(frase)
FinAlgoritmo