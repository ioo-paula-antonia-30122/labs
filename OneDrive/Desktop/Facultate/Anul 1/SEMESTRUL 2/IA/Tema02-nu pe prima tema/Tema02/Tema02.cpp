#include <iostream>
#include <string>
#include "Formula.h"
using namespace std;

int main()
{
	{
		Formula Mercedes("Lewis Hamilton", "George Russell");
		Formula McLaren("Lando Norris", "Oscar Piastri", "Andrea Stella");
		Formula LW("Lewis Hamilton", 6, 234);
		Formula LN("Lando Norris", 205);
		Formula Lewis("Lewis Hamilton");

		cout << "Numarul total de obiecte declarate: " << Formula::afiseaza() << endl;
	}
	return 0;
}