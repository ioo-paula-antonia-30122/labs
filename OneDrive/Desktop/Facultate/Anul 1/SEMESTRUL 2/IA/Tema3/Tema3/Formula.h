#pragma once
#include <string>
#include <iostream>
#include "Car.h"
using namespace std;

class Formula
{
private:
	string member_1;
	string member_2;
	string team_principal;
	int podiums_2023;
	int points_2023;

protected:
	int wcc;
	int wwc;

	Car masina;

public:
	/*void set_Member1(string member1);
	string get_Member1() const;

	void set_Member2(string member2);
	string get_Member2();

	void set_TeamPrincipal(string principal);
	string get_TeamPrincipal();

	void set_Podiums2023(int podium);
	int get_Podiums2023();

	void set_Points2023(int points);
	int get_Points2023();*/

	/*Formula((string member1, string member2);
	Formula(string member1, string member2, string principal);
	Formula(string member1, int podiums, int points);
	Formula(string member1, int points);
	Formula(string member1);*/

	string ceo;
	string tech_dir;

	virtual void campioni();

	void afiseaza();

	void vroom();
	/*{
		masina.afis("W14",758);
	*/

	Formula();

	~Formula();
};
