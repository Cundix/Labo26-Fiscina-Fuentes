#include <iostream>
#include <fstream>
#include <string>
#include <vector>

using namespace std; 

struct crypto_t
{
    string nombre;
    float venta;
    float compra;
    string codigo; 
};

// Hola Profe, si en esto nos va bien (no estamos usando ChatGPT para ser honestos) nos podrías subir uno o

int ej1()
{
    ofstream archivo;
    string nombre, persona; 
    bool salir = false;
    cout << "ingresá el nombre de un archivo" << endl;
    cin >> nombre;
    archivo.open(nombre);


    if(archivo.is_open())
    {
        while(!salir)
        {
            getline(cin, persona);
            if(persona != "/salir")
            {
                archivo << persona << endl;
            }
            else salir = true; 
        }
    }
    archivo.close();
    return 0;
}


// medio q el programa ya está hecho asi que es 2.a y 2.b esto...
float ej2_promedio(string nombre, int & cantidad)
{
    ifstream archivo;
    float suma = 0;
    archivo.open(nombre);
    float numero; 
    if(archivo.is_open())
    {
        while(archivo >> numero)
        {
            suma = suma + numero;
            cout << "Se sumó: " << numero << endl;
        }
        cout << "El promedio es: " << suma / cantidad << endl; 
        archivo.close();
    }
    else cout << "No se pudo abrir el archivo!!!!" << endl; 
    return suma / cantidad;

}

void crear_bin()
{
    float numeros[] = {1, 2, 4, 349};
    ofstream archivo("datos.bin", ios::binary);
    archivo.write((char *) numeros, sizeof(numeros));
    archivo.close();
}



int ej3(string nombre)
{
    ifstream archivo;
    archivo.open(nombre, ios::in | ios::binary);
    if(archivo.is_open())
    {
        float byte;
        while (archivo.read((char *)&byte, sizeof(float)))
        {
            cout << byte << " ";
        }
        archivo.close();
    }

    else cout << "No se pudo abrir" << endl;
    return 0;
}

int ej4_crypto(string nombre, vector<crypto_t> my_vector)
{
    ifstream archivo;
    archivo.open(nombre, ios::app);
    if(archivo.is_open())
    {
        float byte;
        while (archivo.read((char *)&byte, sizeof(float)))
        {
            cout << byte << " ";
        }
        archivo.close();
    }

    else cout << "No se pudo abrir" << endl;
    return 0;
}

int main(void)
{
    cout << "¿Que ej querés ejecutar?";
    int caso;
    cin >> caso;
    switch (caso)
        {
        case 1:
            ej1();
            break;

        case 2: { // ns pq esto pero si no no le gusta al compilador
            int cantidad = 4;
            ej2_promedio("promedio.txt", cantidad);
            break;}
            
        case 3: {
            crear_bin();
            ej3("datos.bin");
            break;
        }
        case 4: 
            string nombre = "crypto.txt";
            vector<crypto_t> my_vector;
            for(int i = 0; i<10; i++)
            {
                
            }
            ej4_crypto(nombre);
        }
    return 0;
}



