#pragma once
#include <iostream>
using namespace std;

class Car
{
private:
	string model;
	int weight;

public:

	void afis(string mod, int greutate)
	{
		model = mod;
		weight = greutate;
		cout << "Modelul masinii: " << mod << " , greutatea masinii: " << greutate << endl;
	}

	Car()
	{
		cout << "Constructor Car fara parametrii" << endl;
	}

	~Car()
	{
		cout << "Destructor apelat de Car" << endl;
	}

};