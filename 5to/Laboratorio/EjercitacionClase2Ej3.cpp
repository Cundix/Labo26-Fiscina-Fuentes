#include <iostream>
using namespace std;

const int N = 5;

void mostrarMatriz(char matriz[N][N])
{
    for(int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            cout<<matriz[i][j];
        }
        cout<<endl;
        
    }

}

void girarDerecha(char origen[N][N], char destino[N][N])
{
    for(int i = 0, h = 4; i<N; i++, h--)
    {
        for(int j = 0, k = 0; j < N; j++, k++)
        {
            destino[k][h] = origen[i][j];
        }
    }

}

void limpiarPantalla()
{
    for (int i = 0; i < 30; i++)
    {
        cout << endl;
    }
}

int main()
{
    char matriz[N][N] = {
        {'.', '.', '#', '.', '.'},
        {'.', '#', '#', '#', '.'},
        {'#', '#', '#', '#', '#'},
        {'.', '.', '#', '.', '.'},
        {'.', '.', '#', '.', '.'}};

    char girada[N][N];

    for(int i = 0; i < 4; i++)
    {
        girarDerecha(matriz, girada);

        cout << "Matriz original:\n\n";
        mostrarMatriz(matriz);

        cout << "\nPresionar Enter para girarla...";
        cin.get();

        limpiarPantalla();

        cout << "Matriz girada 90 grados a la derecha:\n\n";
        mostrarMatriz(girada);
    }
    return 0;
}