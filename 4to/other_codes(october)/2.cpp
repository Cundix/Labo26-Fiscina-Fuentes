#include <iostream>
#include <vector>
#include <string>
using namespace std ;

//3a
bool validar(int dato, int verificado)
{
    int suma = 0;
    bool res;
    while(dato > 0)
    {
        suma += dato % 10;
        dato = dato / 10
    }
    if (suma == verificado)
    {
        res = true;    
    } 
    else
    {
        res = false;
    }
    return res;
}
//3b

void Recorrer( vector <int> &vector1, vector <int> vector2)
{
    for (int i = 0; i < vector1.size(); i++)
    {
        bool verificado;
        verificado = validar(vector1[i], vector2[i]);
        if(verificado == false)
        {
            vector1[i] = 0;
            cout<<"posicion "<<i<<" reemplazada"<<endl;
        }
        else
        {
            cout<<i<<" no se reemplazo"<<endl;
        }
    }
    
}

void mostrar(vector <int> listado)
{
    for(int i = 0; i < listado.size(); i++)
    {
        if(listado[i] != 0)
        {
            cout<<"["<<i + 1<<"]:"<<listado[i]<<endl;
        }
    }
}





HAY QUE CAMBIAR "int i, int j" por "int i, j"

TIENE QUE RECIBIR CANT COMO ARGUMENTO

LA FUNCION RELLENA EL ARREGLO CON VALORES QUE VALEN I X J, EN
DONDE I ARRANCA EN 1 Y SE INCREMENTA DE A 1 Y LLEGA HASTA 9, Y 
J ARRANCA EN 10 Y SE INCREMENTA DE A 10.
LISTADO [0] QUEDA SIN TOCAR


bool eliminar(vector <int> &v, int valor)
{
    bool encontrado = false;
    int i = 0;

    while(i < v.size() -1)
    {
        if(v[i] == valor)
        {
            encontrado = true;
            v[i]=v[v.size() -1];

            v.pop_back();
        }
        else
        {
            i++
        }
    }
    return encontrado;
}

#include <iostream>
#include <vector>

using namespace std;

int main(void)
{
    int num1 = 0;
    int num2 = 0;
    vector <int> vector1;
    vector <int> vector2;
    while(num1 >= 0)
    {

        cout<<"Ingresar numero para vector 1"<<endl
        cin>>num1;
        if(num >= 0)
        {
            cout << "Ingresar numero para vector 2"<< endl;
            cin>>num2;
            
            vector1.push_back(num1);
            vector2.push_back(num2);
        }
    }
    Recorrer(vector1, vector2);
    mostrar(vector1);
}