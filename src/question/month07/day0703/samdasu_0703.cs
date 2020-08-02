using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Samdasu_0703
{
    class samdasu_0703
    {
        static void Main(string[] args)
        {
            int ver;
            int hor;

            ver = Convert.ToInt32(Console.ReadLine());
            ver +=5;
            hor = Convert.ToInt32(Console.ReadLine());            
            hor *= 2;

            Console.WriteLine("width = {0}\nlength = {1}\narea = {2}", ver, hor, ver * hor);


        }
    }
}
