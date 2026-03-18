Algoritmo tarea4
    // 1. 
    Escribir "1. Ingrese Altura, Subida diaria y Resbalón nocturno:"
    Leer H, S, R
    dias <- (H - R - 1) / (S - R) + 1 // Truncado por lógica de enteros
    Escribir "Días: ", TRUNC(dias)
    
    // 2. 
    Escribir "2. Ingrese Monedas (N) y Piratas (K):"
    Leer N, K
    capitan <- N - (K * TRUNC(N/K))
    Escribir "El capitán se lleva: ", capitan
    
    // 3. 
    Escribir "3. Ingrese minutos totales:"
    Leer minTotales
    horas <- TRUNC(minTotales / 60) MOD 24
    minutos <- minTotales MOD 60
    Escribir "Hora: ", horas, ":", minutos
    
    // 4. 
    Escribir "4. Ingrese cantidad de tornillos:"
    Leer X
    cajas <- TRUNC(X / 12)
    sueltos <- X - (cajas * 12)
    Escribir "Cajas: ", cajas, " Sueltos: ", sueltos
    
    // 5. 
    Escribir "5. Cantidad a retirar:"
    Leer monto
    entregado <- TRUNC(monto / 100) * 100
    perdido <- monto - entregado
    Escribir "Entregado: ", entregado, " Perdido: ", perdido
    
    // 6. 
    Escribir "6. Ingrese número de 2 cifras:"
    Leer num2
    dec <- TRUNC(num2 / 10)
    uni <- num2 - (dec * 10)
    Escribir "Invertido: ", (uni * 10) + dec
    
    // 7. 
    Escribir "7. Ingrese radio:"
    Leer r
    area <- TRUNC(3.14159 * r * r)
    Escribir "Área (entera): ", area
    
    // 8. 
    Escribir "8. Ingrese segundos totales:"
    Leer segs
    h <- TRUNC(segs / 3600)
    m <- TRUNC((segs % 3600) / 60)
    s <- segs % 60
    Escribir h, "h ", m, "m ", s, "s"
    
    // 9. 
    Escribir "9. Minutos de estancia:"
    Leer minEst
    horasCobro <- TRUNC((minEst + 59) / 60)
    Escribir "Horas a cobrar: ", horasCobro
    
    // 10. 
    A <- 5; B <- 10
    A <- A + B 
    B <- A - B 
    A <- A - B 
    Escribir "10. A: ", A, " B: ", B
    
    // 11. 
    Escribir "11. Ingrese número de 4 dígitos:"
    Leer n4
    d1 <- TRUNC(n4 / 1000)
    d2 <- TRUNC(n4 / 100) MOD 10
    d3 <- TRUNC(n4 / 10) MOD 10
    d4 <- n4 MOD 10
    Escribir "Hash: ", d1+d2+d3+d4
    
    // 12. 
    Escribir "12. Ingrese exponente N:"
    Leer expN
    Escribir "Computadoras: ", (2^expN) - 2
    
    // 13. 
    Escribir "13. Ingrese ID:"
    Leer idShard
    Escribir "Servidor: ", idShard MOD 3
    
    // 14. 
    Escribir "14. Dígito y Llave:"
    Leer sec, llave
    Escribir "Cifrado: ", (sec + llave) MOD 10
    
    // 15. 
    Escribir "15. Distancia (D) y Velocidad (V):"
    Leer dist, vel
    tiempo <- TRUNC((dist + vel - 1) / vel)
    Escribir "Segundos: ", tiempo
FinAlgoritmo