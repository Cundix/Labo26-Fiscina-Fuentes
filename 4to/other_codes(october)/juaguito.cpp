#include <iostream>
#include <fstream>
#include <string>

using namespace std;

struct GameState {
    string playerName;
    int level;

    void saveToFile(const string& filename) {
        ofstream outFile(filename);
        if (outFile.is_open()) {
            outFile << playerName << endl;
            outFile << level << endl;
            outFile.close();
            cout << "✅ Partida guardada en '" << filename << "'\n";
        } else {
            cout << "❌ No se pudo guardar la partida.\n";
        }
    }

    bool loadFromFile(const string& filename) {
        ifstream inFile(filename);
        if (inFile.is_open()) {
            getline(inFile, playerName);
            inFile >> level;
            inFile.close();
            cout << "✅ Partida cargada correctamente.\n";
            return true;
        } else {
            cout << "❌ No se pudo cargar la partida.\n";
            return false;
        }
    }
};

void showMenu() {
    cout << "\n--- MENU DEL JUEGO ---\n";
    cout << "1. Jugar (avanzar nivel)\n";
    cout << "2. Guardar partida\n";
    cout << "3. Salir\n";
    cout << "Elige una opción: ";
}

int main() {
    GameState game;
    string filename = "savegame.txt";

    int opcion;
    cout << "¿Quieres cargar la partida guardada? (1: Sí / 0: No): ";
    cin >> opcion;
    cin.ignore(); // Limpiar buffer

    if (opcion == 1) {
        if (!game.loadFromFile(filename)) {
            cout << "Empezando nueva partida.\n";
            cout << "Ingresa tu nombre: ";
            getline(cin, game.playerName);
            game.level = 1;
        }
    } else {
        cout << "Ingresa tu nombre: ";
        getline(cin, game.playerName);
        game.level = 1;
    }

    bool jugando = true;
    while (jugando) {
        cout << "\n👤 Jugador: " << game.playerName << " | 🧭 Nivel actual: " << game.level << endl;
        showMenu();

        cin >> opcion;
        switch (opcion) {
            case 1:
                game.level++;
                cout << "🚀 Has avanzado al nivel " << game.level << "!\n";
                break;
            case 2:
                game.saveToFile(filename);
                break;
            case 3:
                cout << "¿Deseas guardar antes de salir? (1: Sí / 0: No): ";
                int guardar;
                cin >> guardar;
                if (guardar == 1)
                    game.saveToFile(filename);
                cout << "👋 ¡Gracias por jugar!\n";
                jugando = false;
                break;
            default:
                cout << "Opción no válida.\n";
        }
    }

    return 0;
}
