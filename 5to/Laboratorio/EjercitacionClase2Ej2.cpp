#include <iostream>
#include <string>
#include <vector>
#define NUMERO_DE_PRODUCTOS_POR_GONDOLA 12

using namespace std;

struct producto
{
    string nombre; 
    float precio; 
    int codigoDeBarras;
    string marca; 
    bool vencimiento; 
};

producto mayorValor(vector<vector<producto>> gondola, float& promedio, int& contador)
{
    producto MayorValor = gondola[0][0];
    float sum;
    for(int i = 0; i < gondola.size(); i++)
    {
        for(int j = 0; j < gondola[i].size(); j++)
        {
            if(gondola[i][j].precio > MayorValor.precio)
            {
                MayorValor = gondola[i][j];
            }
            sum += gondola[i][j].precio;
            if(gondola[i][j].vencimiento == true)
            {
                contador++;
            }
        }
    }
    promedio = sum/NUMERO_DE_PRODUCTOS_POR_GONDOLA;
    return MayorValor;
}

int main(void)
{
    vector<vector<producto>> inventario = {
        { 
            {"Leche", 1200.50, 1001, "Serenis", false},
            {"Pan", 800.00, 1002, "Bimbo", false},
            {"Arroz", 1500.20, 1003, "Lucche", false},
            {"Fideos", 950.00, 1004, "Mataraz", true}
        },
        { 
            {"Yogur", 600.75, 2001, "LaMartona", false},
            {"Manteca", 1100.00, 2002, "Sancor", false},
            {"Queso", 2500.30, 2003, "Tregar", false},
            {"Jugo", 450.00, 2004, "Cepita", true}
        },
        { 
            {"Galletas", 720.00, 3001, "Terrabusi", false},
            {"Aceite", 3200.00, 3002, "Natura", false},
            {"Harina", 850.40, 3003, "Blancaflor", false},
            {"Azucar", 1100.00, 3004, "Ledesma", false}
        }
    };
    float promedio;
    int contador = 0;
    producto elQueTieneMasValor = mayorValor(inventario, promedio, contador);
    cout << "El producto con mayor valor es: " << elQueTieneMasValor.nombre << endl; 
    cout << inventario[2][3].nombre << endl; 
    cout << "El promedio de los productos es: " << promedio << endl;
    cout << "Los productos que tienen fecha de vencimiento son: " << contador << endl;
}