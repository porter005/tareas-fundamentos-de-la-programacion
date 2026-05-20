using System;
using System.IO;
using System.Text;

class Program
{
    static string[][] productos;
    static string[][] ventas;
    static int tamventas = 100;

    public static string MostrarMenu(string[] opciones)
    {
        string cadena = "";
        foreach (string info in opciones)
        {
            cadena = cadena + info + "\n";
        }
        return cadena;
    }

    public static bool EsNumeroEntero(string dato)
    {
        foreach (char c in dato)
        {
            if (!char.IsDigit(c))
            {
                return false;
            }
        }
        return true;
    }

    public static bool EsNumeroDouble(string dato)
    {
        bool valido = false;
        foreach (char c in dato)
        {
            if (!char.IsDigit(c))
            {
                if (c == '.' && !valido)
                {
                    valido = true;
                }
                else
                {
                    return false;
                }
            }
        }
        return valido;
    }

    public static bool EvaluarNumerico(string dato, int tipo)
    {
        bool valido = false;
        switch (tipo)
        {
            case 1:
                valido = EsNumeroEntero(dato);
                break;
            case 2:
                valido = EsNumeroDouble(dato);
                break;
        }
        return valido;
    }

    public static string Dialogo(string texto)
    {
        Console.WriteLine(texto + " : ");
        string cadena = Console.ReadLine();
        return cadena;
    }

    public static string Leer(string texto)
    {
        string cadena = "";
        cadena = Dialogo(texto);
        if (cadena != null)
        {
            cadena = cadena.Trim();
            if (cadena == "")
                cadena = null;
        }
        else
        {
            cadena = null;
        }
        return cadena;
    }

    public static string DesplegarMenu(string Titulo1, string[] menu)
    {
        string cadena;
        cadena = Titulo1 + "\n\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "\n Que opcion deseas ";
        return Dialogo(cadena);
    }

    public static string RellenarEspacios(string dato, int tamano)
    {
        if (dato == null) dato = "";
        return dato.PadRight(tamano);
    }

    public static string Fecha()
    {
        return DateTime.Now.ToString("dd-MM-yyyy");
    }

    public static string IdTicketSiguiente(string idticket)
    {
        string idticketnext = "";
        int num = int.Parse(idticket) + 1;
        if (num < 10)
        {
            idticketnext = "00" + num.ToString().Trim();
        }
        else if ((num > 9) && (num < 100))
        {
            idticketnext = "0" + num.ToString().Trim();
        }
        else
        {
            idticketnext = num.ToString().Trim();
        }
        return idticketnext;
    }

    public static int ObtenerUltimaPosicion(string[][] matriz)
    {
        int ultimaPosicion = -1;
        for (int i = 0; i < matriz.Length; i++)
        {
            if (matriz[i][0] != null && matriz[i][0] != "")
            {
                ultimaPosicion = i;
            }
        }
        return ultimaPosicion;
    }

    public static string[][] CargarProductos()
    {
        string[][] producto = {
            new string[] { "001", "Expreso", "40", "10" },
            new string[] { "002", "Expreso doble", "40", "10" },
            new string[] { "003", "Expreso cortado", "40", "10" },
            new string[] { "004", "Expreso macchiato caramelo", "40", "10" },
            new string[] { "005", "Expreso americano Med", "49", "10" },
            new string[] { "006", "Expreso americano Gde", "52", "10" },
            new string[] { "007", "Capuchino Med", "65", "10" },
            new string[] { "008", "Capuchino Gde", "69", "10" },
            new string[] { "009", "Latte Med", "65", "10" },
            new string[] { "010", "Latte Gde", "69", "10" },
            new string[] { "011", "Macchiato caramelo Med", "72", "10" },
            new string[] { "012", "Macchiato caramelo Gde", "74", "10" },
            new string[] { "013", "Lechero Med", "63", "10" },
            new string[] { "014", "Lechero Gde", "69", "10" },
            new string[] { "015", "Chocolate mexicano Med", "60", "10" },
            new string[] { "016", "Chocolate mexicano Gde", "69", "10" },
            new string[] { "017", "Chocolate blanco Med", "72", "10" },
            new string[] { "018", "Chocolate blanco Gde", "74", "10" },
            new string[] { "019", "Cafe viernes Med", "72", "10" },
            new string[] { "020", "Cafe viernes Gde", "79", "10" },
            new string[] { "021", "Beso de angel Med", "65", "10" },
            new string[] { "022", "Beso de angel Gde", "69", "10" },
            new string[] { "023", "Pay de queso con fresas", "65", "10" },
            new string[] { "024", "Pay de limon", "65", "10" },
            new string[] { "025", "Pay de zanahoria", "65", "10" },
            new string[] { "026", "Pastel de chocolate", "70", "10" },
            new string[] { "027", "Pay de platano", "65", "10" },
            new string[] { "028", "Pay de manzana", "65", "10" }
        };
        return producto;
    }

    public static string MostrarProducto(string[] vproducto)
    {
        string codigo = RellenarEspacios(vproducto[0], 6);
        string producto = RellenarEspacios(vproducto[1], 30);
        string precio = RellenarEspacios(vproducto[2], 10);
        string cantidad = RellenarEspacios(vproducto[3], 10);
        return string.Concat(codigo, producto, precio, cantidad);
    }

    public static string MostrarListaCompleta(string[][] vproductos)
    {
        string salida = "";
        for (int ciclo = 0; ciclo < vproductos.Length; ciclo++)
        {
            string[] vproducto = { vproductos[ciclo][0], vproductos[ciclo][1], vproductos[ciclo][2], vproductos[ciclo][3] };
            string cadena = MostrarProducto(vproducto);
            salida = salida + cadena + "\n";
        }
        return salida;
    }

    public static string FiltrarPorRango(string[][] vproductos, int inicio, int fin)
    {
        string salida = "";
        for (int i = inicio; i <= fin; i++)
        {
            int existencia = int.Parse(vproductos[i][3]);
            if (existencia > 0)
            {
                string[] vproducto = { vproductos[i][0], vproductos[i][1], vproductos[i][2], vproductos[i][3] };
                salida = salida + MostrarProducto(vproducto) + "\n";
            }
        }
        return salida;
    }

    public static int ExisteProducto(string codigo, string[][] vproductos)
    {
        int enc = -1;
        int pos = 0;
        int tam = vproductos.Length;
        for (int ciclo = 0; ciclo < tam; ciclo++)
        {
            if (string.Compare(vproductos[ciclo][0], codigo.Trim()) == 0)
            {
                enc = pos;
            }
            pos++;
        }
        return enc;
    }

    public static void ModificarProducto(string[][] vproductos)
    {
        string codigo, precio;
        int posicion;
        string info = MostrarListaCompleta(vproductos);
        codigo = Leer(info + "\nIntroduce el codigo del producto a modificar");
        if (codigo != null)
        {
            posicion = ExisteProducto(codigo, vproductos);
            if (posicion > -1)
            {
                string[] vproducto = { vproductos[posicion][0], vproductos[posicion][1], vproductos[posicion][2], vproductos[posicion][3] };
                precio = Leer("\nIntroduce el precio de " + MostrarProducto(vproducto) + " ");
                if (precio != null)
                {
                    if (EvaluarNumerico(precio, 2) || EvaluarNumerico(precio, 1))
                        vproductos[posicion][2] = precio;
                    else
                        Console.WriteLine("no es un valor numerico");
                }
                else
                {
                    Console.WriteLine(" dato nulo");
                }
            }
            else
            {
                Console.WriteLine("no existe el codigo");
            }
        }
        else
        {
            Console.WriteLine(" dato nulo");
        }
    }

    public static void MenuProductos(string[][] vproductos)
    {
        string[] datosmenuproductos = { "1.-Modificar ", "2.-Listado ", "3.-Salida " };
        string opcion = "0";
        do
        {
            opcion = DesplegarMenu("Opciones de Productos", datosmenuproductos);
            if (opcion == null)
            {
                Console.WriteLine("opcion incorrecta ");
            }
            else
            {
                switch (opcion)
                {
                    case "1": ModificarProducto(vproductos); break;
                    case "2": Console.WriteLine(MostrarListaCompleta(vproductos)); break;
                    case "3": Console.WriteLine("Salida del Sistema "); break;
                    default: Console.WriteLine("No existe esta opcion "); break;
                }
            }
        } while (opcion != "3");
    }

    public static string[][] CrearVenta()
    {
        string[][] mventa = new string[tamventas][];
        for (int i = 0; i < tamventas; i++)
        {
            mventa[i] = new string[5];
        }
        return mventa;
    }

    public static string UltimoTicket(int pos, string[][] mventa)
    {
        string idticket = "000";
        if (pos > -1)
        {
            idticket = mventa[pos][0];
        }
        return idticket;
    }

    public static string[][] CrearTicket()
    {
        string[][] mticket = new string[20][];
        for (int i = 0; i < 20; i++)
        {
            mticket[i] = new string[4];
        }
        return mticket;
    }

    public static int ExisteTicketCodigo(string[][] mticket, string codigo)
    {
        int enc = -1;
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++)
        {
            if (string.Compare(mticket[ciclo][0], codigo.Trim()) == 0)
            {
                enc = ciclo;
                return enc;
            }
        }
        return enc;
    }

    public static bool InsertarProductoTicket(string[][] mticket, string[] datos, int tamticket)
    {
        bool sucedio = true;
        int posticket = ObtenerUltimaPosicion(mticket);
        int enc = ExisteTicketCodigo(mticket, datos[0]);

        if (posticket < tamticket)
        {
            if (enc > -1)
            {
                int cantidadactual = int.Parse(mticket[enc][3]);
                mticket[enc][3] = (cantidadactual + 1).ToString();
            }
            else
            {
                posticket++;
                mticket[posticket][0] = datos[0];
                mticket[posticket][1] = datos[1];
                mticket[posticket][2] = datos[2];
                mticket[posticket][3] = datos[3];
            }
        }
        else
        {
            sucedio = false;
        }
        return sucedio;
    }

    public static string TotalProducto(string precio, string cantidad)
    {
        double total = double.Parse(precio, System.Globalization.CultureInfo.InvariantCulture) * double.Parse(cantidad, System.Globalization.CultureInfo.InvariantCulture);
        return total.ToString("F2", System.Globalization.CultureInfo.InvariantCulture);
    }

    public static string MostrarProductoTicket(string[][] mticket, int pos)
    {
        string codigo = RellenarEspacios(mticket[pos][0], 6);
        string producto = RellenarEspacios(mticket[pos][1], 30);
        string precio = RellenarEspacios(mticket[pos][2], 10);
        string cantidad = RellenarEspacios(mticket[pos][3], 5);
        string totalproducto = RellenarEspacios(TotalProducto(mticket[pos][2], mticket[pos][3]), 10);
        return string.Concat(codigo, producto, precio, cantidad, totalproducto);
    }

    public static string MostrarTicket(string[][] mticket)
    {
        string salida = "";
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++)
        {
            salida = salida + MostrarProductoTicket(mticket, ciclo) + "\n";
        }
        return salida;
    }

    public static double SubTotalTicket(string[][] mticket)
    {
        double subtotal = 0;
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++)
        {
            subtotal = subtotal + double.Parse(TotalProducto(mticket[ciclo][2], mticket[ciclo][3]), System.Globalization.CultureInfo.InvariantCulture);
        }
        return subtotal;
    }

    public static double IvaTicket(string[][] mticket)
    {
        double subtotal = SubTotalTicket(mticket);
        if (subtotal > 0)
        {
            subtotal = 0.16 * subtotal;
        }
        else
        {
            subtotal = -1;
        }
        return subtotal;
    }

    public static double TotalTicket(string[][] mticket)
    {
        double total = SubTotalTicket(mticket);
        if (total > 0)
        {
            total = IvaTicket(mticket) + total;
        }
        return total;
    }

    public static string MostrarTicketVenta(string[][] mticket, string idticket, string fechaDia)
    {
        string salida = "";
        string subtotal = SubTotalTicket(mticket).ToString("F2", System.Globalization.CultureInfo.InvariantCulture);
        string iva = IvaTicket(mticket).ToString("F2", System.Globalization.CultureInfo.InvariantCulture);
        string total = TotalTicket(mticket).ToString("F2", System.Globalization.CultureInfo.InvariantCulture);
        salida = "Fecha " + fechaDia + " Ticket No." + idticket;
        salida = salida + "\n" + MostrarTicket(mticket);
        salida = salida + "\n \n El total sin iva " + subtotal;
        salida = salida + "\n el iva total es " + iva;
        salida = salida + "\n el total de la venta fue " + total;
        return salida;
    }

    public static void CapturaVentaProducto(string[][] mticket, string[][] mproductos, string idticket, int tamticket)
    {
        string subopcion = "";
        do
        {
            string[] menuSecciones = { "1.-Cafes", "2.-Postres", "3.-Terminar seleccion" };
            subopcion = DesplegarMenu("Hola Como estas, Que es lo que desea", menuSecciones);

            if (subopcion != null)
            {
                if (subopcion == "1")
                {
                    string subcafes = "";
                    do
                    {
                        string[] menuCafes = { "1.-Especialidades Cargadas", "2.-Especialidades Calientes", "3.-Regresar" };
                        subcafes = DesplegarMenu("Seccion de Cafes", menuCafes);

                        if (subcafes != null)
                        {
                            if (subcafes == "1")
                            {
                                string info = FiltrarPorRango(mproductos, 0, 3);
                                ProcesarSeleccionCodigo(info, mticket, mproductos, tamticket);
                            }
                            else if (subcafes == "2")
                            {
                                string info = FiltrarPorRango(mproductos, 4, 21);
                                ProcesarSeleccionCodigo(info, mticket, mproductos, tamticket);
                            }
                        }
                    } while (subcafes != null && subcafes != "3");

                }
                else if (subopcion == "2")
                {
                    string info = FiltrarPorRango(mproductos, 22, 27);
                    ProcesarSeleccionCodigo(info, mticket, mproductos, tamticket);
                }
            }
        } while (subopcion != null && subopcion != "3");
    }

    public static void ProcesarSeleccionCodigo(string listado, string[][] mticket, string[][] mproductos, int tamticket)
    {
        string codigo = Leer(listado + "\nIntroduce el codigo del producto");
        if (codigo != null)
        {
            int posp = ExisteProducto(codigo.Trim(), mproductos);
            if (posp > -1)
            {
                if (int.Parse(mproductos[posp][3]) > 0)
                {
                    int cant = int.Parse(mproductos[posp][3]) - 1;
                    mproductos[posp][3] = cant.ToString();

                    string[] venta = new string[4];
                    venta[0] = mproductos[posp][0];
                    venta[1] = mproductos[posp][1];
                    venta[2] = mproductos[posp][2];
                    venta[3] = "1";

                    if (!InsertarProductoTicket(mticket, venta, tamticket))
                    {
                        Console.WriteLine("el Arreglo esta lleno \n");
                    }
                }
                else
                {
                    Console.WriteLine("no hay productos para venta");
                }
            }
            else
            {
                Console.WriteLine("el codigo no existe no se puede agregar\n");
            }
        }
        else
        {
            Console.WriteLine("dato nulo\n");
        }
    }

    public static void RemoverProductoTicket(string[][] mticket, int pos)
    {
        int tam = ObtenerUltimaPosicion(mticket);
        if (tam > pos)
        {
            for (int i = pos; i < tam; i++)
            {
                mticket[i] = mticket[i + 1];
            }
            mticket[tam] = new string[4];
        }
        else
        {
            mticket[pos] = new string[4];
        }
    }

    public static void EliminarProductoTicket(string[][] mticket, int pos)
    {
        int cantidad = int.Parse(mticket[pos][3]);
        if (cantidad > 1)
        {
            mticket[pos][3] = (cantidad - 1).ToString();
        }
        else
        {
            RemoverProductoTicket(mticket, pos);
        }
    }

    public static void Eliminar(string[][] mticket, string[][] mproductos)
    {
        string codigo, info;
        info = MostrarTicket(mticket);
        codigo = Leer(info + "\nIntroduce el codigo del producto a eliminar");
        if (codigo != null)
        {
            int pos = ExisteTicketCodigo(mticket, codigo);
            if (pos > -1)
            {
                int posproducto = ExisteProducto(codigo, mproductos);
                string nuevacantidad = (int.Parse(mproductos[posproducto][3]) + 1).ToString();
                mproductos[posproducto][3] = nuevacantidad;
                EliminarProductoTicket(mticket, pos);
            }
        }
        else
        {
            Console.WriteLine("dato nulo");
        }
    }

    public static void AgregarProductoAVenta(string[][] mticket, string[][] mventa, string idticket)
    {
        int posventas = ObtenerUltimaPosicion(mventa);
        int posticket = ObtenerUltimaPosicion(mticket);
        for (int i = 0; i <= posticket; i++)
        {
            if (mticket[i][0] != null && mticket[i][0] != "")
            {
                posventas++;
                mventa[posventas][0] = idticket;
                mventa[posventas][1] = mticket[i][0];
                mventa[posventas][2] = mticket[i][1];
                mventa[posventas][3] = mticket[i][2];
                mventa[posventas][4] = mticket[i][3];
            }
        }
    }

    public static void Pagar(string idticket, string[][] mventa, string[][] mticket)
    {
        int posventas = ObtenerUltimaPosicion(mventa);
        int post = ObtenerUltimaPosicion(mticket);

        if ((posventas + post) < 100)
        {
            AgregarProductoAVenta(mticket, mventa, idticket);
        }
        else
        {
            Console.WriteLine("Desbordamiento de Memoria de ventas");
        }
    }

    public static void DevolucionTicket(string[][] mticket, string[][] mproductos)
    {
        int posmticket = ObtenerUltimaPosicion(mticket);

        for (int pos = 0; pos <= posmticket; pos++)
        {
            string codigo = mticket[pos][0];
            int posp = ExisteProducto(codigo.Trim(), mproductos);
            if (posp > -1)
            {
                int cant = int.Parse(mticket[pos][3]) + int.Parse(mproductos[posp][3]);
                mproductos[posp][3] = cant.ToString();
            }
        }
    }

    public static void MenuPuntoVenta(string[][] ventas, string idticket, string[][] productos)
    {
        string opcion, membrete;
        bool pago = false;
        int tamticket = 50;
        string[][] Vticket = new string[tamticket][];
        for (int i = 0; i < tamticket; i++) Vticket[i] = new string[4];

        idticket = IdTicketSiguiente(idticket);
        string fechadia = Fecha();
        opcion = "";

        do
        {
            membrete = "Fecha del Dia " + fechadia + " Ticket No " + idticket;
            membrete = membrete + "\n-----------------------------------------------------\n";

            string Tickettexto = MostrarTicket(Vticket).Trim();
            if (!string.IsNullOrEmpty(Tickettexto))
            {
                membrete = membrete + "\n" + Tickettexto + "\n";
            }

            string[] datosmenu = { "1.-Agregar  ", "2.-Eliminar ", "3.-Pagar ", "4.-Salida " };
            opcion = DesplegarMenu(membrete + "\n Menu de Punto de Venta", datosmenu);

            if (opcion == null)
            {
                Console.WriteLine("dato incorrecto introducido");
            }
            else
            {
                switch (opcion)
                {
                    case "1":
                        CapturaVentaProducto(Vticket, productos, idticket, tamticket);
                        break;
                    case "2":
                        Eliminar(Vticket, productos);
                        break;
                    case "3":
                        Console.WriteLine(MostrarTicketVenta(Vticket, idticket, fechadia).Trim());
                        Pagar(idticket, ventas, Vticket);
                        pago = true;

                        string[] opcionesFinales = { "1.-Volver al inicio (Modificar/Stock)", "2.-Finalizar programa" };
                        string seleccionFinal = DesplegarMenu("¡Gracias por su compra!\n¿Que desea hacer ahora?", opcionesFinales);

                        if (seleccionFinal != null && seleccionFinal == "2")
                        {
                            Console.WriteLine("\n¡Vuelva pronto!");
                            Environment.Exit(0);
                        }
                        opcion = "4"; 
                        break;
                    case "4":
                        Console.WriteLine("Salida del Ventas ");
                        if (!pago)
                        {
                            Console.WriteLine("No pago el ticket ");
                            DevolucionTicket(Vticket, productos);
                            Console.WriteLine("eliminando ticket " + idticket);
                        }
                        break;
                    default:
                        Console.WriteLine("No existe esta opcion");
                        break;
                }
            }
        } while (opcion != "4"); 
    }

    public static string MostrarVenta(string[] venta)
    {
        string idticket = RellenarEspacios(venta[0], 6);
        string codigo = RellenarEspacios(venta[1], 5);
        string producto = RellenarEspacios(venta[2], 30);
        string precio = RellenarEspacios(venta[3], 10);
        string cantidad = RellenarEspacios(venta[4], 10);
        return string.Concat(idticket, codigo, producto, precio, cantidad);
    }

    public static string MostrarListaVentas(string[][] ventas)
    {
        int posventas = ObtenerUltimaPosicion(ventas);
        string salida = "";
        for (int ciclo = 0; ciclo <= posventas; ciclo++)
        {
            string[] venta = { ventas[ciclo][0], ventas[ciclo][1], ventas[ciclo][2], ventas[ciclo][3], ventas[ciclo][4] };
            salida = salida + MostrarVenta(venta) + "\n";
        }
        return salida;
    }

    public static void AgregarStock(string[][] vproductos)
    {
        string codigo, cantidad;
        int posicion;
        string info = MostrarListaCompleta(vproductos);
        codigo = Leer(info + "\nIntroduce el codigo del producto a modificar");
        if (codigo != null)
        {
            posicion = ExisteProducto(codigo, vproductos);
            if (posicion > -1)
            {
                string[] vproducto = { vproductos[posicion][0], vproductos[posicion][1], vproductos[posicion][3], "" };
                cantidad = Leer("\nIntroduce la Cantidad de Stock a Agregar" + MostrarProducto(vproducto) + " ");
                if (cantidad != null)
                {
                    if (EvaluarNumerico(cantidad, 2) || EvaluarNumerico(cantidad, 1))
                    {
                        string nuevacantidad = (int.Parse(cantidad) + int.Parse(vproducto[2])).ToString();
                        vproductos[posicion][3] = nuevacantidad;
                    }
                    else
                    {
                        Console.WriteLine("no es un valor numerico");
                    }
                }
                else
                {
                    Console.WriteLine(" dato nulo");
                }
            }
            else
            {
                Console.WriteLine("no existe el codigo");
            }
        }
        else
        {
            Console.WriteLine(" dato nulo");
        }
    }

    public static void MenuInventario(string[][] vproductos)
    {
        string[] datosmenuinventario = { "1.-Listado ", "2.-Agregar ", "3.-Salida " };
        string opcion = "0";
        do
        {
            opcion = DesplegarMenu("Opciones de Inventarios", datosmenuinventario);
            if (opcion == null)
                Console.WriteLine("opcion incorrecta ");
            else
                switch (opcion)
                {
                    case "1": Console.WriteLine(MostrarListaCompleta(vproductos)); break;
                    case "2": AgregarStock(vproductos); break;
                    case "3": Console.WriteLine("Salida del Sistema "); break;
                    default: Console.WriteLine("No existe esta opcion "); break;
                }
        } while (opcion != "3");
    }

    public static void MenuPrincipal(string[][] vproductos, string[][] vventas)
    {
        string[] datosmenuprincipal = { "1.-Productos ", "2.-Punto de Venta ", "3.- Inventario", "4.-Ventas", "5.-Salida " };
        string opcion = "0";
        string idticket;
        do
        {
            idticket = ObtenerUltimoValorVentas(vventas);
            opcion = DesplegarMenu("Menu de Punto de Shingu Coffee Shop", datosmenuprincipal);
            if (opcion == null)
            {
                Console.WriteLine("opcion incorrecta ");
            }
            else
            {
                switch (opcion)
                {
                    case "1": MenuProductos(vproductos); break;
                    case "2": MenuPuntoVenta(vventas, idticket, vproductos); break;
                    case "3": MenuInventario(vproductos); break;
                    case "4": Console.WriteLine(MostrarListaVentas(vventas)); break;
                    case "5": Console.WriteLine("Salida del Sistema "); break;
                    default: Console.WriteLine("No existe esta opcion "); break;
                }
            }
        } while (opcion != "5");
    }

    public static string ObtenerUltimoValorVentas(string[][] ventas)
    {
        int ultimaposicion = ObtenerUltimaPosicion(ventas);
        string ultimoValor = "000";
        if (ultimaposicion >= 0)
        {
            ultimoValor = ventas[ultimaposicion][0];
        }
        return ultimoValor;
    }

    static void Main(string[] args)
    {
        productos = CargarProductos();
        ventas = CrearVenta();
        MenuPrincipal(productos, ventas);
    }
}