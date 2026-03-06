#include <iostream>
#include <vector>
#include <fstream>

using namespace std; 

struct releaseDate_t
{
    string month;
    int day;
    int year;
};

struct juego_t
{
    string nombre; 
    releaseDate_t lanzamiento;
    string version;
    int nivel; 
    float calif; OT
    bool usado; 
    bool instalado; 
    
};

void addGame(vector<juego_t *> & listado)
{q
    int datop = listado.size();

    listado.push_back(new juego_t);

    listado[datop]->nombre;
    listado[datop]->version;
    listado[datop]->instalado;
    listado[datop]->usado;
    listado[datop]->nivel;
    listado[datop]->calif;
    return; 
}

void showGames(vector<juego_t *> listado)
{
    cout << 
}

int main(void)
{

}