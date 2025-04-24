using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tema5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Formula d = new Formula();
            Console.WriteLine();
            Formula m = new Formula1();
            Console.WriteLine();
            Formula n = new Formulaacademy();
            Console.WriteLine();
            d.Claxon(); //apelare metoda statica din clasa Formula pentru obiect de tip Formula
            m.Claxon(); // apelare metoda statica din clasa Formula pentru obiect de tip Formula1
            n.Claxon(); // apelare metoda statica din clasa Formula pentru obiect de tip Formulaacademy
            Console.WriteLine();

            Formula p = new Formula();
            p.Afiseaza();
            p.Mixt(); //apelare metoda interfata
            Console.WriteLine();

            Formula1 t = new Formula1();
            t.Afiseaza();
            t.Claxon1(); // apelare metoda dinamica din clasa Formula1
            t.Mixt(); //apelare metoda interfata
            Console.WriteLine();

            Formulaacademy z = new Formulaacademy();
            z.Afiseaza();
            z.Claxon1(); // apelare metoda dinamica din clasa Formula1
            z.Mixt(); //apelare metoda interfata
            Console.WriteLine();

        }
    }
}
