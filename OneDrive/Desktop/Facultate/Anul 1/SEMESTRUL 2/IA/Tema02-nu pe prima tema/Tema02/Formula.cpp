#include "Formula.h"

int Formula::obiect = 0;

Formula::Formula(string member1, string member2)
{
	member_1 = member1;
	member_2 = member2;
	cout << "Constructor cu 2 parametrii: membrul 1: " << member1 << " si membrul 2: " << member2 << endl;
	obiect++;
}

Formula::Formula(string member1, string member2, string principal)
{
	member_1 = member1;
	member_2 = member2;
	team_principal = principal;
	cout << "Constructor cu 3 parametrii: membrul 1: " << member1 << ", membrul 2: " << member2 <<" si directorul echipei: "<<principal<< endl;
	obiect++;
}


Formula::Formula(string member1, int podiums, int points) :member_1(member1), member_2(""), team_principal(""), podiums_2023(podiums), points_2023(points)
{
	cout << "Lista cu 3 parametrii: membrul 1: " << member_1 << ", podiumuri: " << podiums_2023 << " si puncte: " << points_2023 << endl;
	obiect++;
}

Formula::Formula(string member1, int points) :member_1(member1), member_2(""), team_principal(""), podiums_2023(0), points_2023(points)
{
	cout << "Lista cu 2 parametrii: membrul 1 " << member_1 << ", si numarul de puncte: " << points_2023 << endl;
	obiect++;
}

Formula::Formula(string member1, string member2, int podiums) :Formula{member1, member2, 0}
{
	cout << "Constructor cu 3 parametrii: " << member_1 << endl;
	obiect++;
}


Formula::~Formula()
{
	cout << "Destructor apelat de : " << this->member_1 << endl;
	obiect--;
}

int Formula::afiseaza()
{
	return obiect;
}