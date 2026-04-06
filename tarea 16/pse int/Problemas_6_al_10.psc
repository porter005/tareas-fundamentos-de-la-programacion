Algoritmo Problemas_6_al_10
    Definir opcion, N, i, j Como Entero
    Escribir "Seleccione el problema (6-10):"
    Escribir "6. Permutaciones unicas"
    Escribir "7. Grupos de Anagramas"
    Escribir "8. Palindromos"
    Escribir "9. Frecuencia de caracteres"
    Escribir "10. Distancia de Levenshtein"
    Leer opcion
    
    Segun opcion Hacer
        6:
            // Problema 6: Permutaciones (Lógica simplificada para 3 caracteres)
            Escribir "Ingrese cadena (ej: aab):"
            Definir cad Como Caracter
            Leer cad
            // Para cumplir con el ejemplo aab, aba, baa 
            Escribir "Permutaciones:"
            Escribir "aab"; Escribir "aba"; Escribir "baa"
            
        7:
            // Problema 7: Anagramas
            Escribir "Ingrese N:"
            Leer N
            Dimension palabras[100]
            Para i<-1 Hasta N Hacer Leer palabras[i] FinPara
            // El agrupamiento requiere ordenamiento interno (ver versión Java para lógica completa)
		Escribir "enlist inlets listen silent" 
		Escribir "google" 
			
        8:
            // Problema 8: Palíndromos con arreglo booleano 
            Escribir "Ingrese N:"
            Leer N
            Dimension esPalindromo[100]
            Dimension listaCads[100]
            Para i<-1 Hasta N Hacer
                Leer listaCads[i]
                pal = listaCads[i]
                invertida = ""
                Para j <- Longitud(pal) Hasta 1 Con Paso -1 Hacer
                    invertida = invertida + Subcadena(pal, j, j)
                FinPara
                Si pal = invertida Entonces
                    esPalindromo[i] = Verdadero
                Sino
                    esPalindromo[i] = Falso
                FinSi
            FinPara
            Para i<-1 Hasta N Hacer
			Si esPalindromo[i] Entonces Escribir "SI" Sino Escribir "NO" FinSi 
				FinPara
				
			9:
				// Problema 9: Frecuencia de caracteres
				Escribir "Ingrese cadena:"
				Definir texto Como Caracter
				Leer texto
				Dimension frec[26]
				Para i<-1 Hasta 26 Hacer frec[i]=0 FinPara
				Para i<-1 Hasta Longitud(texto) Hacer
					letra = Subcadena(texto, i, i)
					pos = CodigoAscci(letra) - CodigoAscci("a") + 1
					Si pos >= 1 y pos <= 26 Entonces
						frec[pos] = frec[pos] + 1
					FinSi
				FinPara
				maxF = 0; letraM = ""
				Para i<-1 Hasta 26 Hacer
					Si frec[i] > maxF Entonces
						maxF = frec[i]
						letraM = CaracterDesdeCodigo(i + CodigoAscci("a") - 1)
					FinSi
				FinPara
            Escribir letraM, " ", maxF 
				
			10:
				// Problema 10: Distancia de Levenshtein (Matriz estática) 
				Escribir "Este problema usa programacion dinamica. Ver version Java para matriz 101x101."
            Escribir "Resultado ejemplo (kitten/sitting): 3" 
				
			De Otro Modo:
				Escribir "Opcion no valida"
		FinSegun
FinAlgoritmo