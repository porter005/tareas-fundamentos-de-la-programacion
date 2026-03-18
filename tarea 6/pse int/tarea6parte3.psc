Algoritmo tarea6parte3
    // 21. El Banquete
    Escribir "21. Platos totales (M) y servidos (P):"
    Leer m21, p21
    invitadosP = TRUNC(m21/2) 
    Si p21 < invitadosP Entonces
        Escribir "Invitados que quedan fuera: ", invitadosP - p21 
    FinSi
	
    // 22. Filas de Cine
    Escribir "22. Ticket (N):"
    Leer n22
    Si n22 >= 0 Entonces 
        Escribir "Fila: ", TRUNC((n22-1)/8)+1
    FinSi
	
    // 23. Empaquetado de Refrescos
    Escribir "23. Refrescos (R):"
    Leer r23
    sobrante = r23 - (TRUNC(r23/6)*6) 
    Si sobrante > 0 Entonces
        Escribir "Sobrante detectado: ", sobrante 
    FinSi
	
    // 24. Reparto de Cartas
    Escribir "24. Jugadores (J):"
    Leer j24
    Si j24 > 0 Entonces 
        Escribir "Cartas: ", TRUNC(52/j24)
    FinSi
	
    // 25. El Salto del Grillo
    Escribir "25. Distancia (D) y Salto (K):"
    Leer d25, k25
    Si d25 MOD k25 = 0 Entonces 
        Escribir "Saltos: ", TRUNC(d25/k25)
    FinSi
	
    // 26. Días a Semanas
    Escribir "26. Días (X):"
    Leer x26
    sem = TRUNC(x26/7)
    Si sem = 1 Entonces 
        Escribir sem, " semana"
    SiNo
        Escribir sem, " semanas"
    FinSi
	
    // 27. El Horario Laboral
    Escribir "27. Segundos (S):"
    Leer s27
    h27 = TRUNC(s27/3600)
    Si h27 > 24 Entonces
        h27 = h27 MOD 24
    FinSi
    Escribir "Horas calculadas: ", h27
	
    // 28. Reloj de Arena
    diff = 7 - 4
    Si diff = 3 Entonces 
        Escribir "Éxito del proceso: ", diff, " minutos."
    FinSi
	
    // 29. Año Bisiesto
    Escribir "29. Año (Y):"
    Leer y29
    Si y29 <> 0 Entonces 
        Escribir "Cómputo: ", TRUNC(y29/4)
    FinSi
	
    // 30. Perímetro Polígono
    Escribir "30. Lado (L):"
    Leer l30
    Si l30 > 0 Entonces 
        Escribir "Perímetro (6L): ", l30+l30+l30+l30+l30+l30
    FinSi
	
FinAlgoritmo