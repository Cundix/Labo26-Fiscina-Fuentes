#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>

using namespace std;

class Pokemon {
public:
    string name;
    int maxHP;
    int hp;
    int attack;

    Pokemon(string n, int h, int a) : name(n), maxHP(h), hp(h), attack(a) {}

    bool isAlive() {
        return hp > 0;
    }

    void takeDamage(int dmg) {
        hp -= dmg;
        if (hp < 0) hp = 0;
    }

    void heal() {
        hp = maxHP;
    }
};

class Player {
public:
    vector<Pokemon> pokemons;

    void addPokemon(Pokemon p) {
        pokemons.push_back(p);
    }

    void showPokemons() {
        cout << "\nTus Pokémon:\n";
        for (int i = 0; i < pokemons.size(); ++i) {
            cout << i+1 << ". " << pokemons[i].name << " (HP: " << pokemons[i].hp << "/" << pokemons[i].maxHP << ")\n";
        }
    }

    Pokemon& choosePokemon() {
        showPokemons();
        int choice;
        cout << "Elige un Pokémon para luchar: ";
        cin >> choice;
        return pokemons[choice - 1];
    }
};

class Game {
private:
    vector<Pokemon> wildPokemons = {
        Pokemon("Pikachu", 30, 6),
        Pokemon("Charmander", 35, 7),
        Pokemon("Bulbasaur", 40, 5),
        Pokemon("Squirtle", 38, 6)
    };

    Player player;

public:
    Game() {
        srand(time(0));
        cout << "¡Bienvenido al mundo Pokémon!\n";
        cout << "Elige tu Pokémon inicial:\n";
        for (int i = 0; i < 3; ++i)
            cout << i+1 << ". " << wildPokemons[i].name << "\n";

        int choice;
        cin >> choice;
        player.addPokemon(wildPokemons[choice - 1]);
    }

    void start() {
        while (true) {
            cout << "\n1. Explorar\n2. Ver Pokémon\n3. Salir\nElige una opción: ";
            int choice;
            cin >> choice;
            if (choice == 1) {
                explore();
            } else if (choice == 2) {
                player.showPokemons();
            } else {
                cout << "¡Hasta luego, entrenador!\n";
                break;
            }
        }
    }

    void explore() {
        cout << "\nExplorando...\n";
        if (rand() % 2 == 0) {
            Pokemon wild = wildPokemons[rand() % wildPokemons.size()];
            wild.heal();
            cout << "¡Un " << wild.name << " salvaje apareció!\n";

            Pokemon& myPokemon = player.choosePokemon();

            // Combate
            while (myPokemon.isAlive() && wild.isAlive()) {
                cout << "\nTu " << myPokemon.name << " ataca.\n";
                wild.takeDamage(myPokemon.attack);
                cout << wild.name << " HP: " << wild.hp << "/" << wild.maxHP << "\n";

                if (!wild.isAlive()) break;

                cout << wild.name << " ataca.\n";
                myPokemon.takeDamage(wild.attack);
                cout << myPokemon.name << " HP: " << myPokemon.hp << "/" << myPokemon.maxHP << "\n";

                if (!myPokemon.isAlive()) {
                    cout << myPokemon.name << " se debilitó.\n";
                    return;
                }

                cout << "\n¿Intentar capturarlo? (1: Sí, 0: No): ";
                int cap;
                cin >> cap;
                if (cap == 1) {
                    if (tryCatch(wild)) {
                        player.addPokemon(wild);
                        cout << "¡Capturaste a " << wild.name << "!\n";
                        return;
                    } else {
                        cout << "¡Falló la captura!\n";
                    }
                }
            }

            if (!wild.isAlive()) {
                cout << "¡Venciste a " << wild.name << "!\n";
            }

        } else {
            cout << "No encontraste nada...\n";
        }
    }

    bool tryCatch(Pokemon& p) {
        int chance = 50; // base

        // Cuanto más baja la vida, más chance
        float hpRatio = (float)p.hp / p.maxHP;
        if (hpRatio < 0.3) chance += 30;
        else if (hpRatio < 0.6) chance += 15;

        int roll = rand() % 100;
        return roll < chance;
    }
};

int main() {
    Game game;
    game.start();
    return 0;
}
