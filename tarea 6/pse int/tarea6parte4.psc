Algoritmo tarea6parte4
    
    // 31. 
    Escribir "31. Ingrese N1, N2 y N3:"
    Leer n1, n2, n3
    prom = (n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5) 
    Si prom >= 6.0 Entonces
	Escribir "Promedio satisfactorio: ", prom 
    FinSi
	
    // 32. 
    Escribir "32. Kilómetros (K):"
    Leer k32
    litros = TRUNC(k32/12)
    costo = litros * 20 
    Si k32 > 500 Entonces
       costo = costo + 50 
    FinSi
    Escribir "Costo de viaje: ", costo
	
    // 33. 
    Escribir "33. Centímetros (C):"
    Leer c33
    km = (c33 * 500) / 1000
    Si km < 1 Entonces
	Escribir "Distancia: ", km * 1000, " metros" 
    SiNo
        Escribir "Distancia: ", km, " km"
    FinSi
	
    // 34. 
    Escribir "34. Ingrese número (X):"
    Leer x34
    res34 = RC(x34^2) 
    Si res34 <> x34 Entonces
	Escribir "Conversión realizada. Absoluto: ", res34 
    SiNo
        Escribir "Valor absoluto: ", res34
    FinSi
	
    // 35. El Complemento
    Escribir "35. Dígito (D):"
    Leer d35
    Si d35 >= 0 Y d35 <= 9 Entonces 
	Escribir "Complemento a 10: ", (10 - d35) 
    FinSi
	
FinAlgoritmo