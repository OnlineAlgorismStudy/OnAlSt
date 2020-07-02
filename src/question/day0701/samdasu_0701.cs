using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Samdasu_0701
{
    class samdasu_0701
    {
        static void Main(string[] args)
        {
            double yd = 91.44;
            double inc = 2.54;

            double Yyd = 2.1 * yd;
            double Iinc = 10.5 * inc;

            Console.WriteLine("2.1yd = {0:0.0}cm", Yyd);
            Console.WriteLine("10.5in = {0:0.0}cm", Iinc);

        }
    }
}
