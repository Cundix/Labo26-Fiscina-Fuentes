// ts is a test for the git push commit workflow

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

void igualarMatriz(char origen[N][N], char destino[N][N])
{
    for(int i = 0; i<N; i++)
    {
        for(int j = 0; j < N; j++)
        {
            destino[i][j] = origen[i][j];
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

void girar(char matriz[N][N], char girada[N][N])
{
    bool termine = false;
    char opcion;
    while(termine == false)
    {



        cout << "Matriz original:\n\n";
        mostrarMatriz(matriz);

        cout << "\nPresionar Enter para girarla...";
        cin.get();
        girarDerecha(matriz, girada);
        igualarMatriz(girada, matriz);

        limpiarPantalla();

        cout << "Matriz girada 90 grados a la derecha:\n\n";
        mostrarMatriz(girada);
        cout << "Otra? S/N" <<endl;
        cin >> opcion;
        switch (opcion)
        {
        case 's':
        case 'S':
            break;
        default:
        case 'N':
            termine = true;
            break;
        }
    }
}


int main()
{
    char original[N][N] = {
    {'.', '.', '#', '.', '.'},
    {'.', '#', '#', '#', '.'},
    {'#', '#', '#', '#', '#'},
    {'.', '.', '#', '.', '.'},
    {'.', '.', '#', '.', '.'}};
    char matriz[N][N];
    char girada[N][N];

    igualarMatriz(original, matriz);
    girar(matriz, girada);

    return 0;
}