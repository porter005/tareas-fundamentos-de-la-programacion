import sys
from datetime import datetime

productos = []
ventas = []
tamventas = 100

def MostrarMenu(opciones):
    cadena = ""
    for info in opciones:
        cadena = cadena + info + "\n"
    return cadena

def EsNumeroEntero(dato):
    for c in dato:
        if not c.isdigit():
            return False
    return True

def EsNumeroDouble(dato):
    valido = False
    for c in dato:
        if not c.isdigit():
            if c == '.' and not valido:
                valido = True
            else:
                return False
    return valido

def EvaluarNumerico(dato, tipo):
    if tipo == 1:
        return EsNumeroEntero(dato)
    elif tipo == 2:
        return EsNumeroDouble(dato)
    return False

def Dialogo(texto):
    print(texto + " : ")
    try:
        cadena = input()
        return cadena
    except (KeyboardInterrupt, EOFError):
        return None

def Leer(texto):
    cadena = Dialogo(texto)
    if cadena is not None:
        cadena = cadena.strip()
        if cadena == "":
            cadena = None
    else:
        cadena = None
    return cadena

def DesplegarMenu(Titulo1, menu):
    cadena = Titulo1 + "\n\n"
    cadena = cadena + MostrarMenu(menu)
    cadena = cadena + "\n Que opcion deseas "
    return Dialogo(cadena)

def RellenarEspacios(dato, tamano):
    if dato is None:
        dato = ""
    return dato.ljust(tamano)

def Fecha():
    return datetime.now().strftime("%d-%m-%yyyy")

def IdTicketSiguiente(idticket):
    num = int(idticket) + 1
    if num < 10:
        idticketnext = "00" + str(num).strip()
    elif num > 9 and num < 100:
        idticketnext = "0" + str(num).strip()
    else:
        idticketnext = str(num).strip()
    return idticketnext

def ObtenerUltimaPosicion(matriz):
    ultimaPosicion = -1
    for i in range(len(matriz)):
        if matriz[i][0] is not None and matriz[i][0] != "":
            ultimaPosicion = i
    return ultimaPosicion

def CargarProductos():
    producto = [
        [ "001", "Expreso", "40", "10" ],
        [ "002", "Expreso doble", "40", "10" ],
        [ "003", "Expreso cortado", "40", "10" ],
        [ "004", "Expreso macchiato caramelo", "40", "10" ],
        [ "005", "Expreso americano Med", "49", "10" ],
        [ "006", "Expreso americano Gde", "52", "10" ],
        [ "007", "Capuchino Med", "65", "10" ],
        [ "008", "Capuchino Gde", "69", "10" ],
        [ "009", "Latte Med", "65", "10" ],
        [ "010", "Latte Gde", "69", "10" ],
        [ "011", "Macchiato caramelo Med", "72", "10" ],
        [ "012", "Macchiato caramelo Gde", "74", "10" ],
        [ "013", "Lechero Med", "63", "10" ],
        [ "014", "Lechero Gde", "69", "10" ],
        [ "015", "Chocolate mexicano Med", "60", "10" ],
        [ "016", "Chocolate mexicano Gde", "69", "10" ],
        [ "017", "Chocolate blanco Med", "72", "10" ],
        [ "018", "Chocolate blanco Gde", "74", "10" ],
        [ "019", "Cafe viernes Med", "72", "10" ],
        [ "020", "Cafe viernes Gde", "79", "10" ],
        [ "021", "Beso de angel Med", "65", "10" ],
        [ "022", "Beso de angel Gde", "69", "10" ],
        [ "023", "Pay de queso con fresas", "65", "10" ],
        [ "024", "Pay de limon", "65", "10" ],
        [ "025", "Pay de zanahoria", "65", "10" ],
        [ "026", "Pastel de chocolate", "70", "10" ],
        [ "027", "Pay de platano", "65", "10" ],
        [ "028", "Pay de manzana", "65", "10" ]
    ]
    return producto

def MostrarProducto(vproducto):
    codigo = RellenarEspacios(vproducto[0], 6)
    producto = RellenarEspacios(vproducto[1], 30)
    precio = RellenarEspacios(vproducto[2], 10)
    cantidad = RellenarEspacios(vproducto[3], 10)
    return codigo + producto + precio + cantidad

def MostrarListaCompleta(vproductos):
    salida = ""
    for ciclo in range(len(vproductos)):
        vproducto = [vproductos[ciclo][0], vproductos[ciclo][1], vproductos[ciclo][2], vproductos[ciclo][3]]
        cadena = MostrarProducto(vproducto)
        salida = salida + cadena + "\n"
    return salida

def FiltrarPorRango(vproductos, inicio, fin):
    salida = ""
    for i in range(inicio, fin + 1):
        existencia = int(vproductos[i][3])
        if existencia > 0:
            vproducto = [vproductos[i][0], vproductos[i][1], vproductos[i][2], vproductos[i][3]]
            salida = salida + MostrarProducto(vproducto) + "\n"
    return salida

def ExisteProducto(codigo, vproductos):
    enc = -1
    pos = 0
    tam = len(vproductos)
    for ciclo in range(tam):
        if vproductos[ciclo][0] == codigo.strip():
            enc = pos
        pos += 1
    return enc

def ModificarProducto(vproductos):
    info = MostrarListaCompleta(vproductos)
    codigo = Leer(info + "\nIntroduce el codigo del producto a modificar")
    if codigo is not None:
        posicion = ExisteProducto(codigo, vproductos)
        if posicion > -1:
            vproducto = [vproductos[posicion][0], vproductos[posicion][1], vproductos[posicion][2], vproductos[posicion][3]]
            precio = Leer("\nIntroduce el precio de " + MostrarProducto(vproducto) + " ")
            if precio is not None:
                if EvaluarNumerico(precio, 2) or EvaluarNumerico(precio, 1):
                    vproductos[posicion][2] = precio
                else:
                    print("no es un valor numerico")
            else:
                print(" dato nulo")
        else:
            print("no existe el codigo")
    else:
        print(" dato nulo")

def MenuProductos(vproductos):
    datosmenuproductos = [ "1.-Modificar ", "2.-Listado ", "3.-Salida " ]
    opcion = "0"
    while opcion != "3":
        opcion = DesplegarMenu("Opciones de Productos", datosmenuproductos)
        if opcion is None:
            print("opcion incorrecta ")
        else:
            if opcion == "1":
                ModificarProducto(vproductos)
            elif opcion == "2":
                print(MostrarListaCompleta(vproductos))
            elif opcion == "3":
                print("Salida del Sistema ")
            else:
                print("No existe esta opcion ")

def CrearVenta():
    return [[None] * 5 for _ in range(tamventas)]

def UltimoTicket(pos, mventa):
    idticket = "000"
    if pos > -1:
        idticket = mventa[pos][0]
    return idticket

def CrearTicket():
    return [[None] * 4 for _ in range(20)]

def ExisteTicketCodigo(mticket, codigo):
    enc = -1
    pos = ObtenerUltimaPosicion(mticket)
    for ciclo in range(pos + 1):
        if mticket[ciclo][0] == codigo.strip():
            enc = ciclo
            return enc
    return enc

def InsertarProductoTicket(mticket, datos, tamticket):
    sucedio = True
    posticket = ObtenerUltimaPosicion(mticket)
    enc = ExisteTicketCodigo(mticket, datos[0])

    if posticket < tamticket - 1:
        if enc > -1:
            cantidadactual = int(mticket[enc][3])
            mticket[enc][3] = str(cantidadactual + 1)
        else:
            posticket += 1
            mticket[posticket][0] = datos[0]
            mticket[posticket][1] = datos[1]
            mticket[posticket][2] = datos[2]
            mticket[posticket][3] = datos[3]
    else:
        sucedio = False
    return sucedio

def TotalProducto(precio, cantidad):
    total = float(precio) * float(cantidad)
    return f"{total:.2f}"

def MostrarProductoTicket(mticket, pos):
    codigo = RellenarEspacios(mticket[pos][0], 6)
    producto = RellenarEspacios(mticket[pos][1], 30)
    precio = RellenarEspacios(mticket[pos][2], 10)
    cantidad = RellenarEspacios(mticket[pos][3], 5)
    totalproducto = RellenarEspacios(TotalProducto(mticket[pos][2], mticket[pos][3]), 10)
    return codigo + producto + precio + cantidad + totalproducto

def MostrarTicket(mticket):
    salida = ""
    pos = ObtenerUltimaPosicion(mticket)
    for ciclo in range(pos + 1):
        salida = salida + MostrarProductoTicket(mticket, ciclo) + "\n"
    return salida

def SubTotalTicket(mticket):
    subtotal = 0.0
    pos = ObtenerUltimaPosicion(mticket)
    for ciclo in range(pos + 1):
        subtotal = subtotal + float(TotalProducto(mticket[ciclo][2], mticket[ciclo][3]))
    return subtotal

def IvaTicket(mticket):
    subtotal = SubTotalTicket(mticket)
    if subtotal > 0:
        subtotal = 0.16 * subtotal
    else:
        subtotal = -1.0
    return subtotal

def TotalTicket(mticket):
    total = SubTotalTicket(mticket)
    if total > 0:
        total = IvaTicket(mticket) + total
    return total

def MostrarTicketVenta(mticket, idticket, fechaDia):
    salida = ""
    subtotal = f"{SubTotalTicket(mticket):.2f}"
    iva = f"{IvaTicket(mticket):.2f}"
    total = f"{TotalTicket(mticket):.2f}"
    salida = "Fecha " + fechaDia + " Ticket No." + idticket
    salida = salida + "\n" + MostrarTicket(mticket)
    salida = salida + "\n \n El total sin iva " + subtotal
    salida = salida + "\n el iva total es " + iva
    salida = salida + "\n el total de la venta fue " + total
    return salida

def CapturaVentaProducto(mticket, mproductos, idticket, tamticket):
    subopcion = ""
    while subopcion != "3" and subopcion is not None:
        menuSecciones = [ "1.-Cafes", "2.-Postres", "3.-Terminar seleccion" ]
        subopcion = DesplegarMenu("Hola Como estas, Que es lo que desea", menuSecciones)
        
        if subopcion is not None:
            if subopcion == "1":
                subcafes = ""
                while subcafes != "3" and subcafes is not None:
                    menuCafes = [ "1.-Especialidades Cargadas", "2.-Especialidades Calientes", "3.-Regresar" ]
                    subcafes = DesplegarMenu("Seccion de Cafes", menuCafes)
                    
                    if subcafes is not None:
                        if subcafes == "1":
                            info = FiltrarPorRango(mproductos, 0, 3)
                            ProcesarSeleccionCodigo(info, mticket, mproductos, tamticket)
                        elif subcafes == "2":
                            info = FiltrarPorRango(mproductos, 4, 21)
                            ProcesarSeleccionCodigo(info, mticket, mproductos, tamticket)
            elif subopcion == "2":
                info = FiltrarPorRango(mproductos, 22, 27)
                ProcesarSeleccionCodigo(info, mticket, mproductos, tamticket)

def ProcesarSeleccionCodigo(listado, mticket, mproductos, tamticket):
    codigo = Leer(listado + "\nIntroduce el codigo del producto")
    if codigo is not None:
        posp = ExisteProducto(codigo.strip(), mproductos)
        if posp > -1:
            if int(mproductos[posp][3]) > 0:
                cant = int(mproductos[posp][3]) - 1
                mproductos[posp][3] = str(cant)
                
                venta = [None] * 4
                venta[0] = mproductos[posp][0]
                venta[1] = mproductos[posp][1]
                venta[2] = mproductos[posp][2]
                venta[3] = "1"
                
                if not InsertarProductoTicket(mticket, venta, tamticket):
                    print("el Arreglo esta lleno \n")
            else:
                print("no hay productos para venta")
        else:
            print("el codigo no existe no se puede agregar\n")
    else:
        print("dato nulo\n")

def RemoverProductoTicket(mticket, pos):
    tam = ObtenerUltimaPosicion(mticket)
    if tam > pos:
        for i in range(pos, tam):
            mticket[i] = mticket[i + 1]
        mticket[tam] = [None] * 4
    else:
        mticket[pos] = [None] * 4

def EliminarProductoTicket(mticket, pos):
    cantidad = int(mticket[pos][3])
    if cantidad > 1:
        mticket[pos][3] = str(cantidad - 1)
    else:
        RemoverProductoTicket(mticket, pos)

def Eliminar(mticket, mproductos):
    info = MostrarTicket(mticket)
    codigo = Leer(info + "\nIntroduce el codigo del producto a eliminar")
    if codigo is not None:
        pos = ExisteTicketCodigo(mticket, codigo)
        if pos > -1:
            posproducto = ExisteProducto(codigo, mproductos)
            nuevacantidad = str(int(mproductos[posproducto][3]) + 1)
            mproductos[posproducto][3] = nuevacantidad
            EliminarProductoTicket(mticket, pos)
    else:
        print("dato nulo")

def AgregarProductoAVenta(mticket, mventa, idticket):
    posventas = ObtenerUltimaPosicion(mventa)
    posticket = ObtenerUltimaPosicion(mticket)
    for i in range(posticket + 1):
        if mticket[i][0] is not None and mticket[i][0] != "":
            posventas += 1
            mventa[posventas][0] = idticket
            mventa[posventas][1] = mticket[i][0]
            mventa[posventas][2] = mticket[i][1]
            mventa[posventas][3] = mticket[i][2]
            mventa[posventas][4] = mticket[i][3]

def Pagar(idticket, mventa, mticket):
    posventas = ObtenerUltimaPosicion(mventa)
    post = ObtenerUltimaPosicion(mticket)

    if (posventas + post) < 99:
        AgregarProductoAVenta(mticket, mventa, idticket)
    else:
        print("Desbordamiento de Memoria de ventas")

def DevolucionTicket(mticket, mproductos):
    posmticket = ObtenerUltimaPosicion(mticket)
    for pos in range(posmticket + 1):
        codigo = mticket[pos][0]
        posp = ExisteProducto(codigo.strip(), mproductos)
        if posp > -1:
            cant = int(mticket[pos][3]) + int(mproductos[posp][3])
            mproductos[posp][3] = str(cant)

def MenuPuntoVenta(ventas_matriz, idticket, productos_matriz):
    pago = False
    tamticket = 50
    Vticket = [[None] * 4 for _ in range(tamticket)]

    idticket = IdTicketSiguiente(idticket)
    fechadia = Fecha()
    opcion = ""

    while opcion != "4":
        membrete = "Fecha del Dia " + fechadia + " Ticket No " + idticket
        membrete = membrete + "\n-----------------------------------------------------\n"

        Tickettexto = MostrarTicket(Vticket).strip()
        if Tickettexto != "":
            membrete = membrete + "\n" + Tickettexto + "\n"

        datosmenu = [ "1.-Agregar  ", "2.-Eliminar ", "3.-Pagar ", "4.-Salida " ]
        opcion = DesplegarMenu(membrete + "\n Menu de Punto de Venta", datosmenu)

        if opcion is None:
            print("dato incorrecto introducido")
        else:
            if opcion == "1":
                CapturaVentaProducto(Vticket, productos_matriz, idticket, tamticket)
            elif opcion == "2":
                Eliminar(Vticket, productos_matriz)
            elif opcion == "3":
                print(MostrarTicketVenta(Vticket, idticket, fechadia).strip())
                Pagar(idticket, ventas_matriz, Vticket)
                pago = True

                opcionesFinales = [ "1.-Volver al inicio (Modificar/Stock)", "2.-Finalizar programa" ]
                seleccionFinal = DesplegarMenu("¡Gracias por su compra!\n¿Que desea hacer ahora?", opcionesFinales)

                if seleccionFinal is not None and seleccionFinal == "2":
                    print("\n¡Vuelva pronto!")
                    sys.exit(0)
                opcion = "4"
            elif opcion == "4":
                print("Salida del Ventas ")
                if not pago:
                    print("No pago el ticket ")
                    DevolucionTicket(Vticket, productos_matriz)
                    print("eliminando ticket " + idticket)
            else:
                print("No existe esta opcion")

def MostrarVenta(venta):
    idticket = RellenarEspacios(venta[0], 6)
    codigo = RellenarEspacios(venta[1], 5)
    producto = RellenarEspacios(venta[2], 30)
    precio = RellenarEspacios(venta[3], 10)
    cantidad = RellenarEspacios(venta[4], 10)
    return idticket + codigo + producto + precio + cantidad

def MostrarListaVentas(ventas_matriz):
    posventas = ObtenerUltimaPosicion(ventas_matriz)
    salida = ""
    for ciclo in range(posventas + 1):
        venta = [ ventas_matriz[ciclo][0], ventas_matriz[ciclo][1], ventas_matriz[ciclo][2], ventas_matriz[ciclo][3], ventas_matriz[ciclo][4] ]
        salida = salida + MostrarVenta(venta) + "\n"
    return salida

def AgregarStock(vproductos):
    info = MostrarListaCompleta(vproductos)
    codigo = Leer(info + "\nIntroduce el codigo del producto a modificar")
    if codigo is not None:
        posicion = ExisteProducto(codigo, vproductos)
        if posicion > -1:
            vproducto = [ vproductos[posicion][0], vproductos[posicion][1], vproductos[posicion][3], "" ]
            cantidad = Leer("\nIntroduce la Cantidad de Stock a Agregar" + MostrarProducto(vproducto) + " ")
            if cantidad is not None:
                if EvaluarNumerico(cantidad, 2) or EvaluarNumerico(cantidad, 1):
                    nuevacantidad = str(int(cantidad) + int(vproducto[2]))
                    vproductos[posicion][3] = nuevacantidad
                else:
                    print("no es un valor numerico")
            else:
                print(" dato nulo")
        else:
            print("no existe el codigo")
    else:
        print(" dato nulo")

def MenuInventario(vproductos):
    datosmenuinventario = [ "1.-Listado ", "2.-Agregar ", "3.-Salida " ]
    opcion = "0"
    while opcion != "3":
        opcion = DesplegarMenu("Opciones de Inventarios", datosmenuinventario)
        if opcion is None:
            print("opcion incorrecta ")
        else:
            if opcion == "1":
                print(MostrarListaCompleta(vproductos))
            elif opcion == "2":
                AgregarStock(vproductos)
            elif opcion == "3":
                print("Salida del Sistema ")
            else:
                print("No existe esta opcion ")

def MenuPrincipal(vproductos, vventas):
    datosmenuprincipal = [ "1.-Productos ", "2.-Punto de Venta ", "3.- Inventario", "4.-Ventas", "5.-Salida " ]
    opcion = "0"
    while opcion != "5":
        idticket = ObtenerUltimoValorVentas(vventas)
        opcion = DesplegarMenu("Menu de Punto de Shingu Coffee Shop", datosmenuprincipal)
        if opcion is None:
            print("opcion incorrecta ")
        else:
            if opcion == "1":
                MenuProductos(vproductos)
            elif opcion == "2":
                MenuPuntoVenta(vventas, idticket, vproductos)
            elif opcion == "3":
                MenuInventario(vproductos)
            elif opcion == "4":
                print(MostrarListaVentas(vventas))
            elif opcion == "5":
                print("Salida del Sistema ")
            else:
                print("No existe esta opcion ")

def ObtenerUltimoValorVentas(ventas_matriz):
    ultimaposicion = ObtenerUltimaPosicion(ventas_matriz)
    ultimoValor = "000"
    if ultimaposicion >= 0:
        ultimoValor = ventas_matriz[ultimaposicion][0]
    return ultimoValor

if __name__ == "__main__":
    productos = CargarProductos()
    ventas = CrearVenta()
    MenuPrincipal(productos, ventas)