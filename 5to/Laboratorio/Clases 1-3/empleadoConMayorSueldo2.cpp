#include <iostream>
#include <string>
#include <vector>

using namespace std;

struct Empleado
{
    string nombre;
    string apellido; 
    string date;
    string genero;
    float sueldo;
};

void mayorSueldo(vector<Empleado> listaEmpleados)
{
    float mayorSueldo = listaEmpleados[0].sueldo;
    Empleado EmpleadoConMayorSueldo = listaEmpleados[0];
    for(int i = 1; i < listaEmpleados.size(); i++)
    {
        if(listaEmpleados[i].sueldo > mayorSueldo)
        {
            EmpleadoConMayorSueldo = listaEmpleados[i];
        }
    }

    cout << "EL EMPLEADO CON MAYOR SUELDO ES: " << EmpleadoConMayorSueldo.nombre << ", CON UN SALARIO DE: " << EmpleadoConMayorSueldo.sueldo << endl;
}

void ajustarPorInflacion(vector<Empleado> & listaEmpleados, float valorInflacionario)
{
    for(int i = 0; i < listaEmpleados.size(); i++)
    {
        listaEmpleados[i].sueldo = (listaEmpleados[i].sueldo) * ((valorInflacionario / 100) +1);
    }
}

void mostrarVectorEmpleados(vector<Empleado> listaEmpleados)
{
    for(int i = 0; i < listaEmpleados.size(); i++)
    {
        cout << listaEmpleados[i].nombre[i] << ", " << listaEmpleados[i].apellido << ", " << listaEmpleados[i].date << ", " << listaEmpleados[i].genero << ", " << listaEmpleados[i].sueldo << endl;
    }
}

int main(void)
{
    float valorInflacionario = 20; 
    vector<Empleado> listaEmpleados = 
    {
        {"Juan", "Pérez", "15/05/1990", "Masculino", 250500.50},
        {"María", "García", "22/08/1985", "Femenino", 480000.00},
        {"Carlos", "Rodríguez", "10/01/1993", "Masculino", 320000.75},
        {"Ana", "Martínez", "05/12/1988", "Femenino", 590000.00},
        {"Luis", "Sánchez", "30/03/1995", "Masculino", 215000.25}
    };
    mayorSueldo(listaEmpleados);
    ajustarPorInflacion(listaEmpleados, valorInflacionario);
    mostrarVectorEmpleados(listaEmpleados);
}