/*
Realizar un programa que me permita cargar mi base de datos de juegos
Tendrá un menú que me permite agregar datos, mostrarlos y salir.

Agregamos las funcionalidades de borrar y modificar (hay que agregarlas en el menu, ya están en el enum)
La busqueda es por nombre. Si hay dos juegos con el mismo nombre, pregunto la versión. Sino, elijo ese juego.

Al iniciar el programa debo leer el archivo datos.bin y cargar el listado de juegos que ya habia ingresado en 
otra oportunidad
*/

#include <iostream>
#include <string>
#include <vector>
#include <fstream>

using namespace std;

enum OPCIONES {AGREGAR = 1, BORRAR, MODIFICAR, LISTAR, GUARDAR, SALIR}; 

#define ARCHIVOTXT "salida.txt"
#define ARCHIVOBIN "datos.bin"


struct fecha_t
{
    int dia;
    string mes;
    int anio;
};

struct juego_t
{
    string nombre;      //Nombre del juego
    string version;     //Versión del tipo 1.47.12
    fecha_t instalado;  //Fecha de instalación, formato con tres datos, día, nombre del mes y año    
    fecha_t usado;      //Fecha que lo usamos por ultima vez
    int nivel;          //Maximo nivel alcanzado (número)
    float calif;        //Que calificación le ponemos (número de 0 a 5 con un decimal)
};

/*
Opción UNO de carga: Directamente en el vector
Función: agregarJuegoUNO
*/

void agregarJuegoUNO (vector <juego_t *> & listado)
{
    int datop = listado.size();
    listado.push_back(new juego_t);

    cout << "Ingrese el nombre del juego: ";
    cin >> (listado[datop])->nombre;
    cout << "Ingrese la versión: ";
    cin >> (listado[datop])->version;
    cout << "Ingrese el día de la instalación: ";
    cin >> (listado[datop])->instalado.dia;     
    cout << "Ingrese el mes de la instalación (nombre del mes): ";
    cin >> (listado[datop])->instalado.mes;     
    cout << "Ingrese el año de la instalación: ";
    cin >> (listado[datop])->instalado.anio;     
    cout << "Ingrese el día que lo uso por última vez: ";
    cin >> (listado[datop])->usado.dia;     
    cout << "Ingrese el mes que lo uso por última vez (nombre del mes): ";
    cin >> (listado[datop])->usado.mes;     
    cout << "Ingrese el año que lo uso por última vez: ";
    cin >> (listado[datop])->usado.anio;     
    cout << "Ingrese el máximo nivel alcanzado: ";
    cin >> (listado[datop])->nivel;
    cout << "Ingrese el puntaje que le otorga al juego (0 a 5 con un decimal): ";
    cin >> (listado[datop])->calif;

    return;
}
    
/*
Opción DOS de carga: A través de variables auxiliares
La ventaja de este método es que la función para agregar juegos es siempre la misma.
Si cambian los campos de la estructura solo modifico la función de carga.
Funciones: agregarJuegoDOS, nuevoJuego y nuevaFecha
*/

fecha_t nuevaFecha (void)
{
    fecha_t nueva;

    cout << "Ingrese el día: ";
    cin >> nueva.dia;     
    cout << "Ingrese el mes (nombre del mes): ";
    cin >> nueva.mes;     
    cout << "Ingrese el año: ";
    cin >> nueva.anio;
    
    return nueva;  
}

juego_t nuevoJuego(void)
{
    juego_t nuevo;

    cout << "Ingrese el nombre del juego: ";
    cin >> nuevo.nombre;
    cout << "Ingrese la versión: ";
    cin >> nuevo.version;
    cout << "Ingrese la fecha de instalación" << endl;
    nuevo.instalado = nuevaFecha();
    cout << "Ingrese la fecha que lo usó por última vez" << endl;
    nuevo.usado = nuevaFecha();
    cout << "Ingrese el máximo nivel alcanzado: ";
    cin >> nuevo.nivel;
    cout << "Ingrese el puntaje que le otorga al juego (0 a 5 con un decimal): ";
    cin >> nuevo.calif;

    return nuevo;
}

void agregarJuegoDOS (vector <juego_t *> & listado)
{
    juego_t * pAuxD = new juego_t;
    
    *pAuxD = nuevoJuego();
    listado.push_back(pAuxD);

    return;
}


void mostrarJuegos (vector <juego_t *> listado)
{
    int i;

    if (listado.empty())
    {
        cout << "***** No hay programas instalados. *****" << endl << endl;
    }
    else 
    {
        cout << "***** Los programas instalados son: *****" << endl;

        for ( i = 0; i < listado.size() ; i++)
        {
            // A continución va de las dos formas que se pueden acceder a los campos.
            // Una forma la use para el nombre y a otra para la versión.
            cout << "\tNombre: " << (listado[i])->nombre;
            cout << "\t- Versión: " << (*(listado[i])).version << endl;
            // Las dos formas para ver las estructuras anidadas
            cout << "\tUsada por última vez el " << (listado[i])->usado.dia;
            cout << " - " << (*(listado[i])).usado.mes << " - " << (*(listado[i])).usado.anio << endl;
            
            cout << "----------------------------------------" << endl;
        }
    }
    return;
}

void guardarJuegos (vector <juego_t *> listado)
{
    int i;
    ofstream archivoW;

    archivoW.open(ARCHIVOTXT); //,ios::app para no sobreescribirlo

    if(archivoW.is_open())
    {

        if (listado.empty())
        {
            archivoW << "***** No hay programas instalados. *****" << endl << endl;
        }
        else 
        {
            archivoW << "***** Los programas instalados son: *****" << endl;

            for ( i = 0; i < listado.size() ; i++)
            {
                // A continución va de las dos formas que se pueden acceder a los campos.
                // Una forma la use para el nombre y a otra para la versión.
                archivoW << "\tNombre: " << (listado[i])->nombre;
                archivoW << "\t- Versión: " << (*(listado[i])).version << endl;
                // Las dos formas para ver las estructuras anidadas
                archivoW << "\tUsada por última vez el " << (listado[i])->usado.dia;
                archivoW << " - " << (*(listado[i])).usado.mes << " - " << (*(listado[i])).usado.anio << endl;
                
                archivoW << "----------------------------------------" << endl;
            }
        }
    }
    else
    {
        cout << "No se pudo abrir el archivo de salida." << endl;
    }
    return;
}

void salvar (vector <juego_t *> listado)
{
    int i;
    ofstream archivoW1;

    archivoW1.open(ARCHIVOBIN,ios::binary);
    if (archivoW1.is_open())
    {
        for ( i = 0; i < listado.size(); i++)
        {
            archivoW1.write((char *) listado[i], sizeof(juego_t));

            int varint = 45;
            archivoW1.write((char *) &varint, sizeof(varint));


        }

        archivoW1.close();
    }
    return;
}

int main (void)
{
    int opcion;
    bool salgo = false;
    vector <juego_t *> listado;

    while (!salgo)
    {
        cout << "Elija una opción: " << endl;
        cout << "\t" << AGREGAR << " - Agregar Juego" << endl;
        cout << "\t" << LISTAR << " - Mostrar Juegos" << endl;
        cout << "\t" << GUARDAR << " - Guardar Juegos en un archivo" << endl;
        cout << "\t" << SALIR << " - Salir" << endl;
        cout << "\t---> ";
        cin >> opcion; 

        switch (opcion) {
            case AGREGAR:
                agregarJuegoUNO(listado);
                // salgo = true;Se puede cambiar esta linea por "agregarJuegoDOS(listado);" para usar el otro método
                break;
            case LISTAR:
                mostrarJuegos(listado);
                break;
            case GUARDAR:
                guardarJuegos(listado);
                break;            
            case SALIR:
                salvar(listado);
                salgo = true;
                break;            
            default:
                cout << "Que te crees, que podés poner cualquier cosa?????";
                break;        
        }
    }
    return 0;
}








