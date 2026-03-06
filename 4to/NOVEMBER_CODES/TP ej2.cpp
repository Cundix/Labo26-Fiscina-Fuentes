#include <iostream>
#include <time.h>

using namespace std;

#define CUANTOS 5

int main (void) 
{
    int listado[CUANTOS], i;
    srand(time(NULL));
    
    for (i = 0; i < CUANTOS; i++) 
    {
        listado[i] = rand();
        cout << i+1 << ": " << dec << listado[i] << "(" << hex << listado[i] << ")" << endl;    }
    
    return 0;
}
