Algoritmo Ejercicio19
    Leer d, m, a
    d <- d + 1
    Si d > 30 Entonces
        d <- 1
        m <- m + 1
        Si m > 12 Entonces
            m <- 1
            a <- a + 1
        FinSi
    FinSi
    Escribir d, "/", m, "/", a
FinAlgoritmo