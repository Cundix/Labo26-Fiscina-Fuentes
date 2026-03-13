#include <iostream>
#include <vector>
#include <string>

using namespace std; 

struct Empleado 
{
    string nombre; 
    string apellido; 
    string fecha_nacimiento; 
    string sexo; 
    float salario; 
};

Empleado empleadoConMayorSueldo(vector<Empleado> empleados, vector <Empleado> & menor400)
{
    Empleado MayorSueldo;
    for(int i = 0; i < empleados.size(); i++)
    {
        if(empleados[i].salario <= 400000) menor400.push_back(empleados[i]);
        if(MayorSueldo.salario <= empleados[i].salario) MayorSueldo = empleados[i];
    }

    return MayorSueldo;
}

int main(void)
{
    vector<Empleado> listaEmpleados = 
    {
        {"Juan", "Pérez", "15/05/1990", "Masculino", 250500.50},
        {"María", "García", "22/08/1985", "Femenino", 480000.00},
        {"Carlos", "Rodríguez", "10/01/1993", "Masculino", 320000.75},
        {"Ana", "Martínez", "05/12/1988", "Femenino", 590000.00},
        {"Luis", "Sánchez", "30/03/1995", "Masculino", 215000.25}
    };
    vector <Empleado> menor400;
    Empleado MayorSueldo;
    MayorSueldo = empleadoConMayorSueldo(listaEmpleados, menor400);

    cout<<"Empleado con mayor sueldo: \n"<<MayorSueldo.nombre<<" "<<MayorSueldo.apellido<<endl<<"Sueldo:"<<MayorSueldo.salario<<endl;
    cout<<"Empleados con Sueldo menor o igual a 400k"<<endl;
    for(int i = 0; i < menor400.size(); i++)
    {
        cout<<menor400[i].nombre<<" "<<menor400[i].apellido<<endl;
    }
}|