#include <string>
#include <iostream>
#include <vector>
#include <time.h>

using namespace std;

#define CURACION_POCION 10;
#define CURACION_SUPERPOCION 25;
#define CURACION HIPERPOCION 50;

enum efecto {bajarDefensa, subirdefensa, subirataque, bajarataque,
    subirvelocidad, bajarVelocidad, };

struct ataque_t
{
    string ataque;
    efecto pasiva;
    int daño;
};
struct fecha_t
{
    int dia, mes, año;
};
struct poke_t 
{
    string nombre;
    float xp;
    int nivel;
    string tipo[2];
    ataque_t ataques[4];
    int defensa;
    fecha_t fecha_obtencion;
    string descripcion;
    int evolucion;
    int nPokedex;
};

struct pokedex_t
{
    vector<poke_t> atrapados;
    vector<poke_t> registrados;
};

struct pociones_t
{
    int pocion, superpocion, hiperpocion, revivir;
};

struct inventario_t
{
    int pokeballs;
    pokedex_t pokedex;
    pociones_t pociones;

};

struct jugador_t
{
    string nombre;
    float xp;
    int nivel;
    inventario_t inventario;

};

#include <vector>
#include <string>

// Asegúrate de actualizar tu struct para incluir el ID si lo necesitas:
// struct poke_t { ... int pokedex_id; };

vector<poke_t> pokedex_kanto = {
    {"Bulbasaur", 64.0f, 5, {"Planta", "Veneno"}, {{"Placaje", subirataque, 40}, {"Gruñido", bajarDefensa, 0}, {"Drenadoras", bajarDefensa, 0}, {"Latigo Cepa", subirataque, 45}}, 49, {11, 3, 2026}, "Semilla en el lomo.", 16, 1},
    {"Ivysaur", 142.0f, 16, {"Planta", "Veneno"}, {{"Hoja Afilada", subirataque, 55}, {"Polvo Veneno", bajarDefensa, 0}, {"Derribo", subirataque, 90}, {"Dulce Aroma", bajarDefensa, 0}}, 63, {11, 3, 2026}, "El capullo crece.", 32, 2},
    {"Venusaur", 236.0f, 32, {"Planta", "Veneno"}, {{"Rayo Solar", subirataque, 120}, {"Somnífero", bajarVelocidad, 0}, {"Gigadrenado", subirataque, 75}, {"Terremoto", subirataque, 100}}, 83, {11, 3, 2026}, "Flor de gran aroma.", 0, 3},
    {"Charmander", 62.0f, 5, {"Fuego", ""}, {{"Arañazo", subirataque, 40}, {"Gruñido", bajarDefensa, 0}, {"Ascuas", subirataque, 40}, {"Furia Dragón", subirataque, 40}}, 43, {11, 3, 2026}, "Llama en la cola.", 16, 4},
    {"Charmeleon", 142.0f, 16, {"Fuego", ""}, {{"Cuchillada", subirataque, 70}, {"Lanzallamas", subirataque, 90}, {"Cara Susto", bajarVelocidad, 0}, {"Infierno", subirataque, 100}}, 58, {11, 3, 2026}, "Naturaleza agresiva.", 36, 5},
    {"Charizard", 240.0f, 36, {"Fuego", "Volador"}, {{"Vuelo", subirataque, 90}, {"Garra Dragón", subirataque, 80}, {"Envite Ígneo", subirataque, 120}, {"Tajo Aéreo", subirataque, 75}}, 78, {11, 3, 2026}, "Escupe fuego ardiente.", 0, 6},
    {"Squirtle", 63.0f, 5, {"Agua", ""}, {{"Placaje", subirataque, 40}, {"Látigo", bajarDefensa, 0}, {"Pistola Agua", subirataque, 40}, {"Refugio", subirdefensa, 0}}, 65, {11, 3, 2026}, "Caparazón resistente.", 16, 7},
    {"Wartortle", 142.0f, 16, {"Agua", ""}, {{"Mordisco", subirataque, 60}, {"Giro Rápido", subirataque, 50}, {"Hidropulso", subirataque, 60}, {"Protección", subirdefensa, 0}}, 80, {11, 3, 2026}, "Cola muy peluda.", 36, 8},
    {"Blastoise", 239.0f, 36, {"Agua", ""}, {{"Hidrobomba", subirataque, 110}, {"Cabezazo", subirataque, 130}, {"Rayo Hielo", subirataque, 90}, {"Danza Lluvia", subirataque, 0}}, 100, {11, 3, 2026}, "Cañones de agua.", 0, 9},
    {"Caterpie", 39.0f, 3, {"Bicho", ""}, {{"Placaje", subirataque, 40}, {"Disparo Demora", bajarVelocidad, 0}, {"Picadura", subirataque, 60}, {"", bajarDefensa, 0}}, 35, {11, 3, 2026}, "Pies ventosa.", 7, 10},
    {"Metapod", 72.0f, 7, {"Bicho", ""}, {{"Fortaleza", subirdefensa, 0}, {"", bajarDefensa, 0}, {"", bajarDefensa, 0}, {"", bajarDefensa, 0}}, 55, {11, 3, 2026}, "Cáscara dura.", 10, 11},
    {"Butterfree", 178.0f, 10, {"Bicho", "Volador"}, {{"Confusión", subirataque, 50}, {"Psicorrayo", subirataque, 65}, {"Viento Plata", subirataque, 60}, {"Polen Venenoso", bajarDefensa, 0}}, 50, {11, 3, 2026}, "Alas repelentes al agua.", 0, 12},
    {"Weedle", 39.0f, 3, {"Bicho", "Veneno"}, {{"Picotazo Veneno", subirataque, 15}, {"Disparo Demora", bajarVelocidad, 0}, {"Picadura", subirataque, 60}, {"", bajarDefensa, 0}}, 30, {11, 3, 2026}, "Aguijón venenoso.", 7, 13},
    {"Kakuna", 72.0f, 7, {"Bicho", "Veneno"}, {{"Fortaleza", subirdefensa, 0}, {"", bajarDefensa, 0}, {"", bajarDefensa, 0}, {"", bajarDefensa, 0}}, 50, {11, 3, 2026}, "Casi inmóvil.", 10, 14},
    {"Beedrill", 178.0f, 10, {"Bicho", "Veneno"}, {{"Ataque Furia", subirataque, 15}, {"Doble Ataque", subirataque, 25}, {"Pin Misil", subirataque, 25}, {"Fuerza", subirataque, 80}}, 40, {11, 3, 2026}, "Tres aguijones.", 0, 15},
    {"Pidgey", 50.0f, 5, {"Normal", "Volador"}, {{"Placaje", subirataque, 40}, {"Ataque Arena", bajarVelocidad, 0}, {"Tornado", subirataque, 40}, {"Ataque Rápido", subirataque, 40}}, 40, {11, 3, 2026}, "Sentido de orientación.", 18, 16},
    {"Pidgeotto", 122.0f, 18, {"Normal", "Volador"}, {{"Remolino", bajarVelocidad, 0}, {"Vuelo", subirataque, 90}, {"Ala de Acero", subirataque, 70}, {"Aire Afilado", subirataque, 60}}, 55, {11, 3, 2026}, "Garras potentes.", 36, 17},
    {"Pidgeot", 216.0f, 36, {"Normal", "Volador"}, {{"Pájaro Osado", subirataque, 120}, {"Tajo Aéreo", subirataque, 75}, {"Agilidad", bajarVelocidad, 0}, {"Hiperrayo", subirataque, 150}}, 75, {11, 3, 2026}, "Vuela a Mach 2.", 0, 18},
    {"Rattata", 51.0f, 5, {"Normal", ""}, {{"Placaje", subirataque, 40}, {"Látigo", bajarDefensa, 0}, {"Ataque Rápido", subirataque, 40}, {"Hipercolmillo", subirataque, 80}}, 35, {11, 3, 2026}, "Dientes fuertes.", 20, 19},
    {"Raticate", 145.0f, 20, {"Normal", ""}, {{"Golpe Cuerpo", subirataque, 85}, {"Superdiente", subirataque, 50}, {"Triturar", subirataque, 80}, {"Esfuerzo", subirataque, 0}}, 60, {11, 3, 2026}, "Roe todo.", 0, 20},
    {"Spearow", 52.0f, 5, {"Normal", "Volador"}, {{"Picotazo", subirataque, 35}, {"Gruñido", bajarDefensa, 0}, {"Ataque Furia", subirataque, 15}, {"Espejo", subirataque, 0}}, 30, {11, 3, 2026}, "Grito agudo.", 20, 21},
    {"Fearow", 155.0f, 20, {"Normal", "Volador"}, {{"Pico Taladro", subirataque, 80}, {"Agilidad", bajarVelocidad, 0}, {"Persecución", subirataque, 40}, {"Triataque", subirataque, 80}}, 65, {11, 3, 2026}, "Caza en campos.", 0, 22},
    {"Ekans", 58.0f, 5, {"Veneno", ""}, {{"Envolver", subirataque, 15}, {"Malicioso", bajarDefensa, 0}, {"Picotazo Veneno", subirataque, 15}, {"Mordisco", subirataque, 60}}, 44, {11, 3, 2026}, "Silencioso.", 22, 23},
    {"Arbok", 157.0f, 22, {"Veneno", ""}, {{"Resplandor", bajarDefensa, 0}, {"Bomba Lodo", subirataque, 90}, {"Colmillo Veneno", subirataque, 50}, {"Cola Férrea", subirataque, 100}}, 69, {11, 3, 2026}, "Patrón aterrador.", 0, 24},
    {"Pikachu", 112.0f, 5, {"Eléctrico", ""}, {{"Impactrueno", subirataque, 40}, {"Onda Trueno", bajarVelocidad, 0}, {"Portazo", subirataque, 80}, {"Trueno", subirataque, 110}}, 40, {11, 3, 2026}, "Carga eléctrica.", 1, 25}
};