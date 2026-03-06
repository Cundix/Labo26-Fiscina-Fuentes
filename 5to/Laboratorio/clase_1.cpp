#include <iostream>
#include <vector>
#include <string>


using namespace std; 

struct inventario
{

};

struct zombie
{
    string tipo;
    bool vivo;
    int health;
    int damage; 
    int velocidad; 
};

void recibir_mordida(int& salud, int damage)
{
    salud = salud - damage; 
}

int main(void)
{
    int salud = 100; 
    string nombre = "Jugador";
    bool infectado = false;
    int municion = 30; 
    srand(time(NULL));

    vector<string> inventario; 
    zombie enemigo = {"zombie", true, 100, 25, 1};

    cout << "Salud: " << salud << "\nNombre:  " << nombre << "\nInfectado" << infectado << "\nMunicion: " << municion << endl; 

    while (enemigo.vivo == true)
    {
        if(municion > 0) 
        {
            cout << "disparo efectuado!" << endl; 
            municion--; 
            cout <<"Te quedan " << municion << "balas" << endl;
            enemigo.health = enemigo.health-25;
            if(enemigo.health <= 0) 
            {
                cout << "mataste al zombie!";
                enemigo.vivo = false;
            }
        }
        else 
        {
            cout << "No te quedan balas!" << endl; 
            while (salud > 0)
            {
                cout << "sigues vivo! "  << salud << endl; 
                recibir_mordida(salud, enemigo.damage);
                
            }
        }

    }
    for(int i = 0; i<=4; i++)
    {
        cout << "Revisando caja " << i << endl; 
        cout << "Encontraste un MEDKIT" << endl;
        inventario.push_back("MedKit");
        cout << "En el inventario tienes: ";
        
        for (int i = inventario.size()-1; i >= 0; i--)
        {
            cout << inventario[i] << endl; 
        }
        
    }

    cout << "Fin de la simulacion!" << endl; 

}

