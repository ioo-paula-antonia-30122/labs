#include "Formulaacademy.h"
#include <iostream>
using namespace std;

void Formulaacademy::set_academy(string academy)
{
	name_of_academy = academy;
}

string Formulaacademy::get_academy()
{
	return name_of_academy;
}

void Formulaacademy::set_location(string location)
{
	next_location = location;
}

string Formulaacademy::get_location()
{
	return next_location;
}

void Formulaacademy::afis()
{
	cout << "Numele academiei: " << get_academy() << endl;
	cout << "Umatoarea locatiei: " << get_location() << endl;

}
