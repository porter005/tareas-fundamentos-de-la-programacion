Funcion MostrarMenu(opc Por Referencia)
	Escribir " "
	Escribir "======= MENÚ DE ÁREAS ======="
	Escribir "C - Área del Círculo"
	Escribir "T - Área del Triángulo"
	Escribir "R - Área del Rectángulo"
	Escribir "P - Área del Trapecio"
	Escribir "S - Salir"
	Escribir "Seleccione una opción:"
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
	area <- Pi * radio * radio
FinFuncion

Funcion area <- CalcularAreaTriangulo(base, altura)
	Definir area Como Real
	area <- (base * altura) / 2
FinFuncion

Funcion area <- CalcularAreaRectangulo(base, altura)
	Definir area Como Real
	area <- base * altura
FinFuncion

Funcion area <- CalcularAreaTrapecio(baseM, basem_menor, altura)
	Definir area Como Real
	area <- ((baseM + basem_menor) * altura) / 2
FinFuncion

Algoritmo CalcularAreas2
	Definir opcio Como Caracter
	Definir r, b, h, bMayor, bMenor Como Real
	
	Repetir
		MostrarMenu(opcio)
		
		Segun opcio Hacer
			"C":
				r <- pedirdato("Ingrese el radio del círculo:")
				Escribir "El área del círculo es: ", CalcularAreaCirculo(r)
			"T":
				b <- pedirdato("Ingrese la base del triángulo:")
				h <- pedirdato("Ingrese la altura del triángulo:")
				Escribir "El área del triángulo es: ", CalcularAreaTriangulo(b, h)
			"R":
				b <- pedirdato("Ingrese la base del rectángulo:")
				h <- pedirdato("Ingrese la altura del rectángulo:")
				Escribir "El área del rectángulo es: ", CalcularAreaRectangulo(b, h)
			"P":
				bMayor <- pedirdato("Ingrese la base mayor (B):")
				bMenor <- pedirdato("Ingrese la base menor (b):")
				h <- pedirdato("Ingrese la altura (h):")
				Escribir "El área del trapecio es: ", CalcularAreaTrapecio(bMayor, bMenor, h)
			"S":
				Escribir "Saliendo del sistema..."
			De Otro Modo:
				Escribir "Error: Opción no válida."
		FinSegun
		
	Hasta Que opcio = "S"
FinAlgoritmo