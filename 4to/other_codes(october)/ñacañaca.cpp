#include <iostream>
#include <vector>
using namespace std;

int main(void){
    int i = 0;
    vector<int>numeros;
    srand(time(NULL));
    int cantidad;
    cout<<"hola pana fresco,mandame tu fono"<<endl;
    cin>>cantidad;
    for(i=0 ; i<cantidad - 1 ; i++)
    {
        int x = rand() % 256;
        numeros.push_back(x);
        cout<<x<<endl;
    }
    return 0;
    







}