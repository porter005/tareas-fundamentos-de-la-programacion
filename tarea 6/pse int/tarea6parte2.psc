Algoritmo tarea6parte2
    // 11.
    Escribir "11. Número de 4 dígitos:"
    Leer n
    d1 = TRUNC(n/1000)
    d2 = TRUNC(n/100) MOD 10
    d3 = TRUNC(n/10) MOD 10
    d4 = n MOD 10
    Si n >= 1000 Y n <= 9999 Entonces
        Escribir "Checksum: ", (d1 + d2 + d3 + d4) 
    FinSi
	
    // 12. 
	Escribir "12. Ingrese el exponente para calcular hosts (2^n):"
	Leer expo
	total_hosts = 2 ^ expo 
	Si total_hosts > 2 Entonces
		disponibles = total_hosts - 2
    Escribir "Hosts disponibles: ", disponibles 
	FinSi
	
    // 13. 
    Escribir "13. ID de Usuario:"
    Leer id_u
    res = id_u MOD 3
    Si res = 0 Entonces Escribir "Servidor: Alpha"
	FinSi 
    Si res = 1 Entonces Escribir "Servidor: Beta" 
    FinSi
    Si res = 2 Entonces Escribir "Servidor: Gamma" 
    FinSi
	
    // 14. 
    Escribir "14. Dígito y Llave:"
    Leer d, ll
    suma = d + ll
    Si suma >= 10 Entonces
        suma = suma - 10 
    FinSi
    Escribir "Cifrado: ", suma
	
    // 15. 
    Escribir "15. Distancia y Velocidad:"
    Leer dist, vel
    tiempo = TRUNC(dist/vel)
    Si dist MOD vel > 0 Entonces
        tiempo = tiempo + 1 
    FinSi
    Escribir "Tiempo: ", tiempo
	
    // 16. 
    Escribir "16. Número 3 cifras:"
    Leer n16
    Si n16 >= 100 Y n16 <= 999 Entonces
        Escribir "Central: ", TRUNC(n16/10) MOD 10 
    FinSi
	
    // 17. 
    Escribir "17. Número 4 cifras:"
    Leer n17
    Si n17 >= 1000 Y n17 <= 9999 Entonces
        Escribir "Centro: ", TRUNC(n17/10) MOD 100 
    FinSi
	
    // 18. 
    Escribir "18. Número positivo:"
    Leer n18
    Si n18 > 0 Entonces
        Escribir "Suma: ", TRUNC(n18/100) + (n18 MOD 10) 
    FinSi
	
    // 19. 
    Escribir "19. Número 3 cifras:"
    Leer n19
    p19 = TRUNC(n19/100)
    Si p19 >= 1 Y p19 <= 9 Entonces
        Escribir "Dígito inicial: ", p19 
    FinSi
	
    // 20. 
    Escribir "20. Tres dígitos (A, B, C):"
    Leer a, b, c
    Si a < 10 Y b < 10 Y c < 10 Entonces
        Escribir "Resultado: ", (a*100 + b*10 + c) 
    FinSi
FinAlgoritmo