#include <string>
#include <iostream>

using namespace std;
//en bits ---> dividir por 4 para pasar a hex
#define SEG 12
#define DESP 24

struct tabla_t
{
    int LONG;
    int BASE;
};

struct dir_t
{
    int seg; 
    int desp;
};

int suma();

int buscarEnLaTabla();

void separar(int direccion, int & seg, int & desp)
{
    int punt;
    for(int i = 0; i != (SEG+DESP)/4 ; i ++)
    {

    }
}

int main (void)
{
    int direccion; 
    int seg, desp;
    cout<<"Ingresar direccion en hexa"<<endl<<"FORMATO SEG:"<<SEG<<"DESP: "<<DESP<<endl;
    getline(cin, direccion);

    separar(direccion, seg, desp);

}