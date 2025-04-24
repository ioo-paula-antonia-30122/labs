using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Claims;
using System.Text;
using System.Threading.Tasks;

namespace Tema5
{
    public class Formula:IAutomobilism
    {
        private string Member_1;
        private string Member_2;

        protected int Wcc;

        public string Ceo;

        public void Afiseaza()
        {
            Console.WriteLine("Afisare Formula");
        }

        public void Claxon()
        {
            Console.WriteLine("Sunt in clasa Formula, afisez Claxon");
        } //static

        public virtual void Claxon1()
        {
            Console.WriteLine("Sunt in formula, afisez Claxon1");
        }//dinamic

        public virtual void Mixt()
        {
            Console.WriteLine("Este un sport mixt");
        }

        public Formula()
        {
            Console.WriteLine("Constructor Formula fara parametrii");
        }
    }
}
