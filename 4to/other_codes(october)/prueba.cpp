#include <string>
#include <vector>
#include <iostream>
using namespace std;

struct punto_t
{
    float x;
    float y;
};

struct segmento_t
{
    float dist;
    float ang;
};

vector <segmento_t> calcular(vector <punto_t> puntos)
{   
    vector <segmento_t> aux;
    if(puntos.empty()){
        cout<<"no hay puntos para procesar"<<endl;
    }
    else
    {
        for(int i = 0; i< puntos.size() ; i++)
        {
            if(puntos[i].x > 0 && puntos[i].y > 0)
            {
                segmento_t aux2;
                aux2.dist = calcdist(puntos[i].x, puntos[i].y);
                aux2.ang = calcang(puntos[i].x, puntos[i].y);
                aux.push_back(aux2);
            }
        }
    }
    return aux;
}

void mostrar_segmentos(vector <segmento_t> seg)
{
        for (int i = 0; i < seg.size(); i++)
        {
            cout<<"Este vector tiene distancia al origen "<<seg[i].distancia<<" y ángulo "
            <<seg[i].angulo<<endl;
        }
}








