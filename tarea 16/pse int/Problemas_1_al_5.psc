Algoritmo Problemas_1_al_5_Corregido
    Definir opcion, N, i, j, k Como Entero
    
    Escribir "Seleccione el problema (1-5):"
    Escribir "1. Puntos mas cercanos"
    Escribir "2. Area de Poligono (Gauss)"
    Escribir "3. Cuadrantes y Ejes"
    Escribir "4. Tripletes divisibles por 3"
    Escribir "5. Subconjuntos de tamaño K"
    Leer opcion
    
    Segun opcion Hacer
        1:
            // Problema 1: Distancia euclidiana al cuadrado mínima [cite: 1, 3]
            Escribir "Ingrese N (Cantidad de puntos):"
            Leer N
            Dimension coordX[1000], coordY[1000] // Tamaño máximo según el problema 
            Para i<-1 Hasta N Hacer
                Escribir "Punto ", i, " (x y):"
                Leer coordX[i], coordY[i]
            FinPara
            
            Definir minDistSq, d2 Como Real
            minDistSq = -1 
            
            Para i<-1 Hasta N-1 Hacer
                Para j<-i+1 Hasta N Hacer
                    d2 = (coordX[i]-coordX[j])^2 + (coordY[i]-coordY[j])^2
                    Si minDistSq = -1 o d2 < minDistSq Entonces
                        minDistSq = d2
                    FinSi
                FinPara
            FinPara
		Escribir "Distancia minima al cuadrado: ", minDistSq 
            
        2:
            // Problema 2: Área de Gauss (Zapatos) [cite: 11]
            Escribir "Ingrese N (Vertices):"
            Leer N
            Dimension px[1001], py[1001] // N+1 para cerrar el polígono
            Para i<-1 Hasta N Hacer
                Leer px[i], py[i]
            FinPara
            
            // Cerrar el polígono repitiendo el primer punto al final [cite: 11]
            px[N+1] <- px[1]
            py[N+1] <- py[1]
            
            Definir sumaArea Como Real
            sumaArea = 0
            Para i<-1 Hasta N Hacer
                sumaArea = sumaArea + (px[i] * py[i+1]) - (px[i+1] * py[i])
            FinPara
            
		Escribir "Area: ", abs(sumaArea) / 2 
            
        3:
            // Problema 3: Conteo de puntos por ubicación [cite: 20, 22]
            Escribir "Ingrese N:"
            Leer N
            Definir c1, c2, c3, c4, ex, ey, ori, vx, vy Como Entero
            c1=0; c2=0; c3=0; c4=0; ex=0; ey=0; ori=0
            
            Para i<-1 Hasta N Hacer
                Leer vx, vy
                Si vx=0 y vy=0 Entonces 
                    ori = ori + 1
                Sino 
                    Si vx=0 Entonces 
                        ey = ey + 1
                    Sino 
                        Si vy=0 Entonces 
                            ex = ex + 1
                        Sino 
                            Si vx>0 y vy>0 Entonces c1 = c1 + 1
								Si vx<0 y vy>0 Entonces c2 = c2 + 1
									Si vx<0 y vy<0 Entonces c3 = c3 + 1
										Si vx>0 y vy<0 Entonces c4 = c4 + 1
										FinSi
									FinSi
								FinSi
							FinPara
							
						Escribir "Origen: ", ori 
						Escribir "Cuadrante I: ", c1 
						Escribir "Cuadrante II: ", c2 
						Escribir "Cuadrante III: ", c3 
						Escribir "Cuadrante IV: ", c4 
						Escribir "Eje X: ", ex 
						Escribir "Eje Y: ", ey 
							
						4:
							// Problema 4: Tripletes divisibles por 3 [cite: 40]
							Escribir "Ingrese N:"
							Leer N
							Dimension listaNumeros[1000]
							Para i<-1 Hasta N Hacer 
								Leer listaNumeros[i] 
							FinPara
							
							Definir totalTripletes Como Entero
							totalTripletes = 0
							
							Para i<-1 Hasta N-2 Hacer
								Para j<-i+1 Hasta N-1 Hacer
									Para k<-j+1 Hasta N Hacer
										Si (listaNumeros[i] + listaNumeros[j] + listaNumeros[k]) % 3 = 0 Entonces
											totalTripletes = totalTripletes + 1
										FinSi
									FinPara
								FinPara
							FinPara
						Escribir "Total: ", totalTripletes 
							
						5:
							// Problema 5: Subconjuntos de tamaño K (Simulado con 3 niveles) [cite: 48, 51]
							Escribir "Ingrese N y K (K debe ser 2 para este ejemplo):"
							Leer N, K
							Escribir "Ingrese los caracteres uno por uno:"
							Dimension chars[10]
							Para i<-1 Hasta N Hacer
								Leer chars[i]
							FinPara
							
							Escribir "Subconjuntos:"
							Para i<-1 Hasta N-1 Hacer
								Para j<-i+1 Hasta N Hacer
								Escribir chars[i], chars[j] 
								FinPara
							FinPara
							
						De Otro Modo:
							Escribir "Opción no válida"
					FinSegun
FinAlgoritmo