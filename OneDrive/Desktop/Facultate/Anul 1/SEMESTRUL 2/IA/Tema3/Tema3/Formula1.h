#pragma once
#include "Formula.h"

class Formula1:public Formula
{
protected:
	int number_of_wins;

public:
	int number_of_teams;
	string reserve_driver;

	void afiseaza()
	{
		cout << "Afisare Formula1" << endl;
	}

	void vroom()
	{
		Formula::vroom();
	}

	Formula1()
	{
		cout << "Constructor Formula1 fara parametrii" << endl;
	}

	~Formula1()
	{
		cout << "Destructor apelat de Formula1" << endl;
	}

};