#include "Formula.h"
#include "Car.h"
using namespace std;

/*void Formula::set_Member1(string member1)
{
	this->member_1 = member1;
}

string Formula::get_Member1() const
{
	return member_1;
}

void Formula::set_Member2(string member2)
{
	this->member_2 = member2;
}

string Formula::get_Member2()
{
	return member_2;
}

void Formula::set_TeamPrincipal(string principal)
{
	this->team_principal = principal;
}

string Formula::get_TeamPrincipal()
{
	return team_principal;
}

void Formula::set_Podiums2023(int podium)
{
	this->podiums_2023 = podium;
}

int Formula::get_Podiums2023()
{
	return podiums_2023;
}

void Formula::set_Points2023(int points)
{
	this->points_2023 = points;
}

int Formula::get_Points2023()
{
	return points_2023;
};

Formula::Formula(string member1, string member2)
{
	member_1 = member1;
	member_2 = member2;
	cout << "Constructor cu 2 parametrii: membrul 1: " << member1 << " si membrul 2: " << member2 << endl;
	//obiect++;
}

Formula::Formula(string member1, string member2, string principal)
{
	member_1 = member1;
	member_2 = member2;
	team_principal = principal;
	cout << "Constructor cu 3 parametrii: membrul 1: " << member1 << ", membrul 2: " << member2 << " si directorul echipei: " << principal << endl;
	//obiect++;
}

Formula::Formula(string member1, int podiums, int points) :member_1{ member1 }, member_2{ "" }, team_principal{ "" }, podiums_2023{ podiums }, points_2023{ points }
{
	cout << "Lista cu 3 parametrii: membrul 1: " << member_1 << ", podiumuri: " << podiums_2023 << " si puncte: " << points_2023 << endl;
	//obiect++;
}

Formula::Formula(string member1, int points) :member_1{ member1 }, member_2{ "" }, team_principal{ "" }, podiums_2023{ 0 }, points_2023{ points }
{
	cout << "Lista cu 2 parametrii: membrul 1 " << member_1 << ", si numarul de puncte: " << points_2023 << endl;
	//obiect++;
}

Formula::Formula(string member) :Formula("Lewis Hamilton", " ")
{
	cout << "Constructor cu 1 parametru prin delegare: " << member << endl;
	//obiect++;
}*/


void Formula::afiseaza()
{
	cout << "Afisare Formula" << endl;
}

void Formula::vroom()
{
	masina.afis("W14", 758);
}

void Formula::campioni()
{
	cout << "In prezent, exista 20 de piloti de F1 si 10 echipe" << endl;
}

void Formula::claxon()
{
	cout << "Sunt in clasa Formula, afisez claxon" << endl; //static
}

void Formula::claxon1()
{
	cout << "Sunt in formula, afisez Claxon1" << endl; //dinamic
}

Formula::Formula()
{
	cout << "Constructor Formula fara parametrii " << endl;
}

Formula::~Formula()
{
	cout << "Destructor apelat de Formula" << member_1 << endl;
	//obiect--;
}
