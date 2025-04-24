#pragma once
#include "Formula.h"

class Formula2 :public Formula
{
public:
	int number_of_pilots;
	int number_of_races;

	void afiseaza()
	{
		cout << "Afisare Formula2" << endl;
	}

	void vroom()
	{
		Formula::vroom();
	}

	void campioni() override
	{
		cout << "Am un total de 22 de piloti" << endl;
		int piloti = 22;
		cout << "Piloti: " << piloti << endl;
	}

	Formula2()
	{
		cout << "Constructor Formula2 fara parametrii" << endl;
	}


	~Formula2()
	{
		cout << "Destructor apelat de Formula2" << endl;
	}
};
