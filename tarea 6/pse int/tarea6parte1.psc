Algoritmo tarea6parte1
   // 1. 
    Escribir "1. Caracol - H, S, R:"
    Leer h, s, r
    Si s >= h Entonces
        Escribir "Días: 1"
    SiNo
        Escribir "Días: ", (h-r-1)/(s-r)+1
    FinSi
	
   // 2.
    Escribir "2. Monedas y Piratas:"
    Leer n, k
    q = TRUNC(n/k)
    Si n % k <> 0 Entonces
        capitan = n - (q * k)
    SiNo
        capitan = 0
    FinSi
    Escribir "Capitán se lleva: ", capitan
	
    // 3. 
    Escribir "3. Tornillos:"
    Leer x
    cajas = TRUNC(x/12)
    sueltos = 0
    Si x % 12 <> 0 Entonces
        sueltos = x - (cajas * 12)
    FinSi
    Escribir "Cajas: ", cajas, " Sueltos: ", sueltos
	
   // 4. 
    Escribir "4. Cantidad Cajero:"
    Leer cant
    entrega = TRUNC(cant/100) * 100
    Si entrega < cant Entonces
        Escribir "Pérdida: ", cant - entrega
    FinSi
	
    // 5.
    Escribir "5. Minutos totales:"
    Leer m_totales
    horas = TRUNC(m_totales/60)
    Si horas >= 24 Entonces
        horas = horas % 24
    FinSi
    Escribir "Hora: ", horas, ":", m_totales % 60
	
    // 6. 
    Escribir "6. Segundos totales:"
    Leer s_totales
    h6 = TRUNC(s_totales/3600)
    m6 = TRUNC((s_totales % 3600)/60)
    s6 = s_totales % 60
    Si h6 > 23 Entonces h6 = h6 MOD 24
	FinSi
    Escribir h6, "h ", m6, "m ", s6, "s"
	
    // 7. 
    Escribir "7. Minutos parking:"
    Leer min_p
    h_base = TRUNC(min_p/60)
    Si min_p % 60 > 0 Entonces
        h_base = h_base + 1
    FinSi
    Escribir "Horas a cobrar: ", h_base
	
   // 8. 
    Escribir "8. Numero 2 cifras:"
    Leer num8
    d8 = TRUNC(num8/10)
    u8 = num8 % 10
    Si num8 >= 10 Y num8 <= 99 Entonces
        Escribir "Invertido: ", (u8 * 10 + d8)
    FinSi
	
    // 9. 
    Escribir "9. Radio:"
    Leer r9
    area = TRUNC(3.1416 * r9 * r9)
    Si area > 0 Entonces
        Escribir "Área entera: ", area
    FinSi
	
    // 10.
    Escribir "10. Valor A y B:"
    Leer A, B
    originalB = B
    A = A + B
    B = A - B
    A = A - B
    Si A == originalB Entonces
        Escribir "Intercambio OK. A:", A, " B:", B
    FinSi
FinAlgoritmo