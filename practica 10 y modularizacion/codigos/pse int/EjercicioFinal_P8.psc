Subproceso AnalizarTodo(frase)
	Definir i, l, d, ma, mi Como Entero
	Definir c Como Caracter
	l<-0; d<-0; ma<-0; mi<-0
	
	Para i<-0 Hasta Longitud(frase)-1 Hacer
		c <- Subcadena(frase, i, i)
		
		Si c >= "0" y c <= "9" Entonces
			d <- d + 1
		FinSi
		
		Si (c >= "a" y c <= "z") o (c >= "A" y c <= "Z") Entonces
			l <- l + 1
			Si c = Mayusculas(c) Entonces
				ma <- ma + 1
			Sino
				mi <- mi + 1
			FinSi
		FinSi
	FinPara
	
	Escribir "--- RESULTADOS ---"
	Escribir "Letras: ", l
	Escribir "Números: ", d
	Escribir "Mayúsculas: ", ma
	Escribir "Minúsculas: ", mi
FinSubproceso

Algoritmo EjercicioFinal_P8
	Definir usuario_frase Como Caracter
	Escribir "Ingresa una frase:"
	Leer usuario_frase
	
	Escribir "Longitud: ", Longitud(usuario_frase)
	Escribir "En Mayúsculas: ", Mayusculas(usuario_frase)
	
	AnalizarTodo(usuario_frase)
FinAlgoritmo