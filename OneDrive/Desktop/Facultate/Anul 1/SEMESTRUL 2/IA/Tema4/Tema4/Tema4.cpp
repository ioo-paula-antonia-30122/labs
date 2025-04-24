#include <iostream>
#include <string>
#include "Formula.h"
#include "Formula1.h"
#include "Formula2.h"
#include "Formulaacademy.h"
using namespace std;

int main()
{
	/*Formula Mercedes;
	Formula* McLaren = new Formula;

	Mercedes.set_Member1("Lewis Hamilton");
	Mercedes.set_Member2("George Russell");
	Mercedes.set_TeamPrincipal("Toto Wolff");
	Mercedes.set_Podiums2023(8);
	Mercedes.set_Points2023(409);

	(*McLaren).set_Member1("Lando Norris");
	McLaren->set_Member2("Oscar Piastri");
	McLaren->set_TeamPrincipal("Andrea Stella");
	McLaren->set_Podiums2023(9);
	(*McLaren).set_Points2023(302);

	cout << "Mercedes" << endl;
	cout << "Primul pilot: " << Mercedes.get_Member1() << endl;
	cout << "Al doilea pilot: " << Mercedes.get_Member2() << endl;
	cout << "Directorul: " << Mercedes.get_TeamPrincipal() << endl;
	cout << "Podiumuri in 2023: " << Mercedes.get_Podiums2023() << endl;
	cout << "Puncte in 2023: " << Mercedes.get_Points2023() << endl;

	cout << " " << endl;

	cout << "McLaren" << endl;
	cout << "Primul pilot: " << McLaren->get_Member1() << endl;
	cout << "Al doilea pilot: " << McLaren->get_Member2() << endl;
	cout << "Directorul: " << McLaren->get_TeamPrincipal() << endl;
	cout << "Podiumuri in 2023: " << McLaren->get_Podiums2023() << endl;
	cout << "Puncte in 2023: " << McLaren->get_Points2023() << endl;

	delete McLaren;
	return 0;*/ //vechiul cod

	/*{
		Formula Mercedes("Lewis Hamilton", "George Russell");
		Formula McLaren("Lando Norris", "Oscar Piastri", "Andrea Stella");
		const Formula LW("Lewis Hamilton", 6, 234);
		Formula LN("Lando Norris", 205);
		Formula Lewis("Lewis");

	}*/ //tema 2

	/*Formula Mercedes;
	Mercedes.afiseaza();
	Mercedes.campioni();
	Mercedes.vroom();
	cout << " " << endl;
	Formula1 McLaren;
	McLaren.afiseaza();
	cout << " " << endl;
	Formula2 Prema;
	Prema.afiseaza();
	Prema.campioni();
	cout << " " << endl;
	Formulaacademy Campos;
	Campos.afiseaza();
	cout << " " << endl;
	McLaren.vroom();
	Prema.vroom();
	Campos.vroom();
	cout << "" << endl;
	//Car masina;
	//masina.afis("W14", 758);
	//cout << " " << endl; */
	
	Formula* p = new Formula1;
	p->claxon();
	cout << "" << endl;  //static

	delete p;

	cout << "" << endl;

	Formula* t = new Formula1;
	t->claxon1();
	cout << "" << endl;  //dinamic

	delete t;

	cout << "" << endl;

	Formula formula;
	formula.mixt();
	cout << "" << endl;

	Formula* a = new Formulaacademy;
	a->mixt();
	cout << "" << endl;

	delete a;

	return 0;
}
