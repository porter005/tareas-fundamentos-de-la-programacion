Algoritmo Sistema_Arqueo_Caja
	// PARTE 6: MODULARIZACIÓN - El Proceso principal esta limpio y solo declara variables 
	Definir opc Como Entero
	Definir fInicial, vTotales, gTotales, eReal Como Real
	
	fInicial <- 0
	vTotales <- 0
	gTotales <- 0
	eReal <- 0
	
	// PARTE 2: CICLO PRINCIPAL - Uso de Repetir-Hasta Que para mantener el sistema activo 
	Repetir
		Escribir ""
		Escribir "=== SISTEMA DE ARQUEO DE CAJA ==="
		Escribir "1. Ingresar Fondo de Caja Inicial"
		Escribir "2. Registrar Ventas del Turno"
		Escribir "3. Registrar Gastos / Retiros"
		Escribir "4. Realizar Corte de Caja (Resultado Final)"
		Escribir "5. Salir del Sistema"
		Escribir "Seleccione una opcion:"
		
		CapturarDato(opc)
		
		// PARTE 3: SELECTOR DE OPCIONES - Uso de Segun-Hacer para gestionar el menu 
		Segun opc Hacer
			1:
				Escribir "Ingrese el monto del Fondo Inicial:"
				CapturarDato(fInicial)
			2:
				vTotales <- AcumularMovimientos("Ventas")
			3:
				gTotales <- AcumularMovimientos("Gastos")
			4:
				Escribir "Ingrese el Efectivo Real en Cajon:"
				CapturarDato(eReal)
				MostrarResultadoCorte(fInicial, vTotales, gTotales, eReal)
			5:
				Escribir "Saliendo..."
			De Otro Modo:
				// Manejo de opciones invalidas segun rubrica 
				Escribir "Opcion invalida. Intente de nuevo."
		FinSegun
	Hasta Que opc = 5
FinAlgoritmo

// PARTE 1: CAPTURA DEFENSIVA - SubProceso que valida texto antes de convertir a numero
SubProceso CapturarDato(valor Por Referencia)
	Definir cad Como Caracter
	Definir esNum Como Logico
	Definir i, n Como Entero
	Definir c Como Caracter
	
	Repetir
		Leer cad 
		n <- Longitud(cad)
		esNum <- Verdadero
		
		Si n = 0 Entonces
			esNum <- Falso
		Sino
			// PARTE 1.1: VALIDACION ALGORITMICA - Recorre la cadena con Subcadena 
			Para i <- 1 Hasta n Hacer
				c <- Subcadena(cad, i, i)
				Si NO (c >= "0" Y c <= "9" O c = ".") Entonces
					esNum <- Falso
				FinSi
			FinPara
		FinSi
		
		Si NO esNum Entonces
		Escribir "Error: Entrada rechazada (Programacion Defensiva). Ingrese solo numeros:" 
		FinSi
	Hasta Que esNum
	
	valor <- ConvertirANumero(cad)
FinSubProceso

// PARTE 4: CICLOS DE ACUMULACION - Uso de Para para sumar movimientos 
Funcion total <- AcumularMovimientos(tipoMovimiento)
	Definir cant, i Como Entero
	Definir total, monto Como Real
	Escribir "Cuantos movimientos de ", tipoMovimiento, " va a ingresar?"
	CapturarDato(cant)
	total <- 0
	Para i <- 1 Hasta cant Hacer
		Escribir tipoMovimiento, " #", i, ":"
		CapturarDato(monto)
		total <- total + monto // Acumulacion sin sobrescribir [cite: 38]
	FinPara
FinFuncion

// PARTE 5: CONDICIONALES DE CORTE - Logica para determinar Faltante, Sobrante o Cuadrado 
SubProceso MostrarResultadoCorte(fondo, ventas, gastos, real)
	Definir teorico, dif Como Real
	teorico <- (fondo + ventas) - gastos 
	dif <- real - teorico
	
	Escribir "--- BALANCE FINAL ---"
	Escribir "Esperado en Sistema: $", teorico
	Escribir "Efectivo Fisico:     $", real
	
	Si real = teorico Entonces
	Escribir "Estado: CUADRADO (Diferencia: $0)" 
	Sino
		Si real < teorico Entonces
		Escribir "Estado: FALTANTE de $", (teorico - real) 
		Sino
		Escribir "Estado: SOBRANTE de $", (real - teorico) 
		FinSi
	FinSi
FinSubProceso