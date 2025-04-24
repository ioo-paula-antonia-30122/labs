#pragma once
#include <string>
#include <iostream>
using namespace std;

class Formula
{
private:
	string member_1;
	string member_2;
	string team_principal;
	int podiums_2023;
	int points_2023;
	static int obiect;

public:
	Formula(string member1, string member2);
	Formula(string member1, string member2, string principal);
	Formula(int podiums, int points);
	Formula(string member1, int podiums, int points);
	Formula(string member1, int points);
	Formula(string member1);
	static int afiseaza();

	~Formula();
};
