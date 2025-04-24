using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tema5
{
    public class Formula1:Formula
    {
        protected int Number_of_wins;
        public int Number_of_teams;

        public void Afiseaza()
        {
            Console.WriteLine("Afisare Formula1");
        }

        public new void Claxon() //static
        {
            Console.WriteLine("Sunt in clasa Formula1, afisez Claxon");
        }

        public override void Claxon1() //dinamic
        {
            Console.WriteLine("Sunt in clasa Formula1, afisez Claxon 1");
        }

        public override void Mixt()
        {
            Console.WriteLine("Este un sport mixt");
        }

        public Formula1()
        {
            Console.WriteLine("Constructor Formula1 fara parametrii");
        }
    }

}
