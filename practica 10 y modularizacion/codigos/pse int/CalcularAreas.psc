Funcion MostrarMenu(opc Por Referencia)
	Escribir " "
	Escribir "--- MENÚ ---"
	Escribir "C - Círculo"
	Escribir "T - Triángulo"
	Escribir "S - Salir"
	Escribir "Elige una opción:"
	Leer opc
	opc <- Mayusculas(opc)
FinFuncion

Funcion num <- pedirdato(mensaje)
	Definir num Como Real
	Escribir mensaje
	Leer num
FinFuncion

Funcion area <- CalcularAreaCirculo(radio)
	Definir area Como Real
	area <- 3.1416 * radio * radio
FinFuncion

Funcion area <- CalcularAreaTriangulo(base, altura)
	Definir area Como Real
	area <- (base * altura) / 2
FinFuncion

Algoritmo CalcularAreas
	Definir opcio Como Caracter
	Definir radio, base, altura Como Real
	
	Repetir
		MostrarMenu(opcio) 
		
		Segun opcio Hacer
			"C":
				radio <- pedirdato("Ingresa el radio del circulo: ")
				Escribir "El area del circulo es: ", CalcularAreaCirculo(radio)
			"T":
				base <- pedirdato("Ingresa la base del triangulo: ")
				altura <- pedirdato("Ingresa la altura del triangulo: ")
				Escribir "El area del triangulo es: ", CalcularAreaTriangulo(base, altura)
			"S":
				Escribir "Saliendo del programa..."
			De Otro Modo:
				Escribir "OPCION NO VALIDA."
		FinSegun
		
	Hasta Que (opcio = "S")
FinAlgoritmo
