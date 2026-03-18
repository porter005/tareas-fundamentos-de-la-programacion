Algoritmo Ejercicio22
    Leer num
    dec <- trunc(num/10)
    uni <- num MOD 10
    Si dec = 0 Entonces 
        // Lógica para unidades 0-9
    Sino
        Segun dec Hacer
            1: Escribir Sin Saltar "Diez"
            2: Escribir Sin Saltar "Veinte"
            3: Escribir Sin Saltar "Treinta"
				// ... así hasta noventa
        FinSegun
        Si uni <> 0 Entonces 
			Escribir Sin Saltar " y " 
		FinSi
		FinSi
    // Lógica para unidades según el caso
FinAlgoritmo
