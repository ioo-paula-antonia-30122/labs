using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tema5
{
    public class Formulaacademy : Formula1
    {
        public string Name_of_academy;
        public string Next_location;

        public void Afiseaza()
        {
            Console.WriteLine("Afisare Formulaacademy");
        }

        public new void Claxon() //static
        {
            Console.WriteLine("Sunt in clasa Formulaacaddemy, afisez Claxon");
        }

        public override void Claxon1() //dinamic
        {
            Console.WriteLine("Sunt in clasa Formulaacademy, afisez Claxon 1");
        }

        public override void Mixt()
        {
            Console.WriteLine("Este un sport mixt");
        }

        public Formulaacademy()
        {
            Console.WriteLine("Constructor Formulaacademy fara parametrii");
        }
    }
}

