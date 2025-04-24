#pragma once
#include "Formula1.h"

class Formulaacademy:public Formula1
{
public:
	string name_of_academy;
	string next_location;

	void afiseaza()
	{
		cout << "Afisare Formulaacademy" << endl;
	}

	void vroom()
	{
		Formula::vroom();
	}

	Formulaacademy()
	{
		cout << "Constructor Formulaacademy fara parametrii" << endl;
	}

	~Formulaacademy()
	{
		cout << "Destructor apelat de Formulaacademy" << endl;
	}
	
};