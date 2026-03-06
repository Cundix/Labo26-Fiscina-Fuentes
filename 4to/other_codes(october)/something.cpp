#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main(void)
{
    ifstream file("example.txt");

    string line; 
    while (getline(file, line))
    {
        cout << line << endl; 

    }
    file.close();
    
}