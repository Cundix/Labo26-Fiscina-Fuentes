#include <string>
#include <iostream>
#include <fstream>
#include <cstring>

using namespace std;

int main(void)
{
    fstream archivo;
    archivo.open("juegos.csv", ios::app | ios::out);

    if(archivo.is_open())
    {
        string nombre, mes;
        float version;
        int cant;
        cout << "ingresa la cantidad de juegos que querés ingresar" << endl;
        cin >> cant;
        for(int i = 0; i < cant; i++)
        {
            cin >> nombre
                >> mes
                >> version;
            archivo << nombre << "," << mes << "," << version << '\n';
            cout << "Juego " << i+1 << " ingresado" << endl;
        }
    }
}