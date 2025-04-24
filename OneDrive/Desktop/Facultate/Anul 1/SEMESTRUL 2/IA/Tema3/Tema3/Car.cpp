#include "Car.h"
#include <iostream>
using namespace std;

void Car::set_model(string mod)
{
	model = mod;
}

string Car::get_model()
{
	return model;
}

void Car::set_weight(int greut)
{
	weight = greut;
}

int Car::get_weight()
{
	return weight;
}

void Car::afisare()
{
	cout << "Model: " << get_model() << endl;
	cout << "Greutate: " << get_weight() << " kg" << endl;
}