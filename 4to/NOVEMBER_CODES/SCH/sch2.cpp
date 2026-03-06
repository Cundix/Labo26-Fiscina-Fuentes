// SONG CREATOR HELPER
#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <filesystem>

using namespace std;
namespace fs = filesystem;

enum OPCIONES { AGREGAR = 1, EDITAR, LEER, LISTAR };
enum SECCIONES { VERSO = 1, PREESTRIBILLO, ESTRIBILLO, PUENTE, ATRAS };

struct Seccion {
    string titulo;
    vector<string> lineas;
};

//
// ---- Funciones auxiliares ----
//
int menuCancion(const string& titulo) {
    int opc;
    cout << "\n-----------------------\n"
         << "   " << titulo << "\n"
         << "-----------------------\n"
         << VERSO << " - VERSE\n"
         << PREESTRIBILLO << " - PRE-CHORUS\n"
         << ESTRIBILLO << " - CHORUS\n"
         << PUENTE << " - BRIDGE\n"
         << ATRAS << " - ATRAS\n"
         << "-----------------------" << endl;
    cout << "Elegí una opción: ";
    cin >> opc;
    cin.ignore();
    return opc;
}

//
// ---- CREAR NUEVA CANCIÓN ----
//
void nuevacancion() 
{
    string titulo;
    cout << "Ingresar título: ";
    cin.ignore();
    getline(cin, titulo);

    string nombrearch = titulo + ".txt";
    ofstream archivo(nombrearch);

    if (!archivo.is_open()) 
    {
        cerr << "Error al crear el archivo." << endl;
        return;
    }

    bool salir = false;
    int contV = 1, contP = 1, contE = 1, contB = 1;
    string linea;

    while (!salir) {
        int op = menuCancion(titulo);
        switch (op) {
            case VERSO:
                archivo << "[VERSE " << contV++ << "]\n";
                cout << "Escribí el verso (terminá con /fin):" << endl;
                while (true) {
                    getline(cin, linea);
                    if (linea == "/fin") break;
                    archivo << linea << endl;
                }
                break;
            case PREESTRIBILLO:
                archivo << "[PRE-CHORUS " << contP++ << "]\n";
                cout << "Escribí el pre-chorus (terminá con /fin):" << endl;
                while (true) {
                    getline(cin, linea);
                    if (linea == "/fin") break;
                    archivo << linea << endl;
                }
                break;
            case ESTRIBILLO:
                archivo << "[CHORUS " << contE++ << "]\n";
                cout << "Escribí el chorus (terminá con /fin):" << endl;
                while (true) {
                    getline(cin, linea);
                    if (linea == "/fin") break;
                    archivo << linea << endl;
                }
                break;
            case PUENTE:
                archivo << "[BRIDGE " << contB++ << "]\n";
                cout << "Escribí el puente (terminá con /fin):" << endl;
                while (true) {
                    getline(cin, linea);
                    if (linea == "/fin") break;
                    archivo << linea << endl;
                }
                break;
            case ATRAS:
                salir = true;
                break;
            default:
                cout << "Opción no válida." << endl;
        }
    }

    archivo.close();
    cout << "\nCanción guardada como '" << nombrearch << "'\n";
}

//
// ---- LEER CANCIÓN ----
//
void leer() {
    string titulo;
    cout << "Título de la canción a leer: ";
    cin.ignore();
    getline(cin, titulo);

    string nombrearch = titulo + ".txt";
    ifstream archivo(nombrearch);
    if (!archivo.is_open()) {
        cerr << "No se pudo abrir '" << nombrearch << "'" << endl;
        return;
    }

    cout << "\n--- " << titulo << " ---\n";
    string linea;
    while (getline(archivo, linea))
        cout << linea << endl;

    archivo.close();
}

//
// ---- LISTAR CANCIONES ----
//
void listar() {
    cout << "\nCanciones disponibles:\n";
    for (const auto& entry : fs::directory_iterator(fs::current_path())) {
        if (entry.path().extension() == ".txt")
            cout << " - " << entry.path().stem().string() << endl;
    }
}

//
// ---- EDITAR CANCIÓN (por secciones) ----
//
void editar() {
    string titulo;
    cout << "Título de la canción a editar: ";
    cin.ignore();
    getline(cin, titulo);

    string nombrearch = titulo + ".txt";

    ifstream archivo(nombrearch);
    if (!archivo.is_open()) {
        cerr << "No se pudo abrir '" << nombrearch << "'" << endl;
        return;
    }

    // --- Cargar secciones existentes ---
    vector<Seccion> secciones;
    string linea;
    Seccion actual;

    while (getline(archivo, linea)) {
        if (!linea.empty() && linea.front() == '[' && linea.back() == ']') {
            if (!actual.titulo.empty())
                secciones.push_back(actual);
            actual = Seccion();
            actual.titulo = linea;
        } else if (!linea.empty()) {
            actual.lineas.push_back(linea);
        }
    }
    if (!actual.titulo.empty())
        secciones.push_back(actual);
    archivo.close();

    bool salir = false;
    while (!salir) {
        cout << "\n-------------------------------\n";
        cout << "  Editando: " << titulo << "\n";
        cout << "-------------------------------\n";
        cout << "Secciones actuales:\n";
        for (size_t i = 0; i < secciones.size(); ++i)
            cout << " " << i + 1 << ": " << secciones[i].titulo << endl;

        cout << "\n" << secciones.size() + 1 << ": AGREGAR NUEVA SECCIÓN\n";
        cout << "0: SALIR\n";
        cout << "-------------------------------\n";
        cout << "Elegí una opción: ";

        int n;
        cin >> n;
        cin.ignore();

        if (n == 0) {
            salir = true;
            break;
        }

        // ---- Agregar nueva sección ----
        if (n == (int)secciones.size() + 1) {
            cout << "\nElegí tipo de sección:\n";
            cout << "1 - VERSE\n2 - PRE-CHORUS\n3 - CHORUS\n4 - BRIDGE\n";
            int tipo;
            cin >> tipo;
            cin.ignore();

            string nombreSeccion;
            switch (tipo) {
                case VERSO: nombreSeccion = "VERSE"; break;
                case PREESTRIBILLO: nombreSeccion = "PRE-CHORUS"; break;
                case ESTRIBILLO: nombreSeccion = "CHORUS"; break;
                case PUENTE: nombreSeccion = "BRIDGE"; break;
                default: 
                    cout << "Tipo inválido.\n";
                    continue;
            }

            int numero = 1;
            for (auto& s : secciones) {
                if (s.titulo.find(nombreSeccion) != string::npos)
                    numero++;
            }

            Seccion nueva;
            cout << "Escribí el contenido (terminá con /fin, dejar vacío cancela):" << endl;
            vector<string> contenido;
            while (true) {
                getline(cin, linea);
                if (linea == "/fin") break;
                contenido.push_back(linea);
            }

            if (!contenido.empty()) {
                nueva.titulo = "[" + nombreSeccion + " " + to_string(numero) + "]";
                nueva.lineas = contenido;
                secciones.push_back(nueva);
                cout << "\n✅ Nueva sección agregada: " << nueva.titulo << endl;
            } else {
                cout << "\n⚠️ No se agregó ninguna sección.\n";
            }
        }
        // ---- Editar sección existente ----
        else if (n > 0 && n <= (int)secciones.size()) {
            Seccion& sel = secciones[n - 1];
            cout << "\nEditando " << sel.titulo << endl;
            cout << "Contenido actual:\n";
            for (const auto& l : sel.lineas)
                cout << "  " << l << endl;

            cout << "\nEscribí el nuevo contenido (terminá con /fin, dejar vacío para no cambiar):" << endl;
            vector<string> nuevasLineas;
            while (true) {
                getline(cin, linea);
                if (linea == "/fin") break;
                nuevasLineas.push_back(linea);
            }

            if (!nuevasLineas.empty()) {
                sel.lineas = nuevasLineas;
                cout << "✅ Sección actualizada.\n";
            } else {
                cout << "⚠️ No se hicieron cambios.\n";
            }
        } else {
            cout << "Opción inválida.\n";
        }

        // --- Guardar todo nuevamente ---
        ofstream salida(nombrearch, ios::trunc);
        for (const auto& s : secciones) {
            salida << s.titulo << endl;
            for (const auto& l : s.lineas)
                salida << l << endl;
        }
        salida.close();
    }

    cout << "\nCambios guardados en '" << nombrearch << "'\n";
}

//
// ---- MENÚ PRINCIPAL ----
//
void menu() {
    int op;
    cout << "-----------------------"
         << "\n  SONG CREATOR HELPER  "
         << "\n-----------------------"
         << "\n" << AGREGAR << " - CREAR NUEVO"
         << "\n" << EDITAR  << " - EDITAR"
         << "\n" << LEER    << " - LEER"
         << "\n" << LISTAR  << " - LISTAR"
         << "\n-----------------------" << endl;
    cout << "Elegí una opción: ";
    cin >> op;

    switch (op) {
        case AGREGAR: nuevacancion(); break;
        case EDITAR:  editar(); break;
        case LEER:    leer(); break;
        case LISTAR:  listar(); break;
        default: cout << "Opción no válida.\n"; break;
    }
}

//
// ---- MAIN ----
//
int main() {
    while(true)
    {
        menu();
    }
    return 0;
}
