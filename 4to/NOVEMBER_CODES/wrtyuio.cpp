//SONG CREATOR HELPER

#include <iostream>
#include <fstream>
#include <string>

using namespace std;

enum OPCIONES {AGREGAR = 1, EDITAR, LEER, LISTAR};
enum OPCIONESCANCION{VERSO = 1, PREESTRIBILLO, ESTRIBILLO, PUENTE, ATRAS};

int menuCancion(string titulo)
{
    int opc;

    cout<<"-----------------------"<<
        titulo <<
        "\n-----------------------"<<
        "\n"<<VERSO<<" - VERSE"<<
        "\n"<<PREESTRIBILLO <<" - PRECH"<<
        "\n"<<ESTRIBILLO<<" - CHORUS"<<
        "\n"<<PUENTE<<" - BRIDGE"<<
        "\n"<<ATRAS<<" - ATRAS"<<
        "\n-----------------------"<<endl;
        
    cin>>opc;
    cin.ignore();

    return opc;
}

void nuevacancion()
{
    string titulo;
    string nombrearch= titulo + ".txt";

    ofstream archivo;
    archivo.open(nombrearch);

    int escribir;
    bool salgo = 0;

    while((archivo.is_open()) && (salgo = 0))
    {
        escribir = menuCancion(titulo);

        int contV = 1;
        int contP = 1;
        int contE = 1;
        int contB = 1;

        string linea;

        bool escribi = 0;
        switch (escribir)
        {
            case VERSO:

                archivo<<"[VERSE "<< contV <<"]"<<endl;
                while(linea != "/fin")
                {
                    getline(cin, linea);
                    if(linea != "/fin") 
                    {
                        archivo<<endl;
                    }
                }

                /* code */
                break;
            case PREESTRIBILLO:
                /* code */
                break;
            case ESTRIBILLO:
                /* code */
                break;
            case PUENTE:
                /* code */
                break;
            case ATRAS:
                salgo = 1;
                break;
            default:
                break;
        }
    }
}

void menu()
{
    int op;
    cout<<"-----------------------"<<
        "\n  SONG CREATOR HELPER  "<<
        "\n-----------------------"<<
        "\n"<<AGREGAR<<" - CREAR NUEVO"<<
        "\n"<<EDITAR <<" - EDITAR"<<
        "\n"<<LEER <<" - EDITAR"<<
        "\n"<<LISTAR <<" - EDITAR"<<
        "\n-----------------------"<<endl;
        
        cin>>op;
        
        cin.ignore();
    switch (op)
    {
    case AGREGAR:

        nuevacancion();
        /* code */
        break;
    case EDITAR:
        /* code */
        break;
    case LEER:
        /* code */
        break;
    case LISTAR:
        /* code */
        break;

    default:
        break;
    }

}

int main (void)
{
    menu();



    return 0;
}

