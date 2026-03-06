// hacer una estructura que se llame evento qu guarde:
// el nombre,la cantidad de miembros,una descripcion y una fecha que guarde el dia,el mes y el anio
#include <iostream>
#include <string>
#include <chrono>
#include <thread>
using namespace std;

struct fecha_t
{
int dia;
int mes;
int anio;
};

struct evento
{
string nombre;
int invitados;
string descripcion;
fecha_t fecha;
};

int main()
{
evento event;

cout << "Buenos dias,ingrese los valores que se le van a pedir para agendar su evento" << endl;
cout << "nombre evento:" << endl;
getline(cin, event.nombre);
cout << "Cantidad de invitados:" << endl;
cin >> event.invitados;
cin.ignore();
cout << "ingrese la fecha de su evento:" << endl;
cin >> event.fecha.dia;
cin >> event.fecha.mes;
cin >> event.fecha.anio;
cout << "Ingrese una breve descripccion de su evento:" << endl;
getline(cin, event.descripcion);
cout << "Cargando tus datos..." << endl;
std::this_thread::sleep_for(std::chrono::seconds(2));
cout << "Nombre:" << event.nombre << endl;
cout << "Invitados:" << event.invitados << endl;
cout << "Dia:" << event.fecha.dia << endl;
cout << "Mes:" << event.fecha.mes << endl;
cout << "Anio:" << event.fecha.anio << endl;
return 0;
}