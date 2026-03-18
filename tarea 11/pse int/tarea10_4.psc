Algoritmo tarea10_4
Escribir "Ingrese el segundo octeto:" 
    Leer segundo
Escribir "Ingrese el tercer octeto:" 
    Leer tercer
    
Si segundo == 0 Entonces 
	Si tercer == 5 Entonces 
		Escribir "Acceso concedido a Contabilidad" 
        Sino
		Escribir "Acceso denegado: Subred incorrecta" 
        FinSi
    Sino 
        Escribir "Acceso denegado: Red externa" 
		FinSi
FinAlgoritmo