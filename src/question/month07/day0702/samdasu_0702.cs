using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace samdasu_0702
{
    class Program
    {
        static void Main(string[] args)
        {
            double yard = 91.44;
            

            Console.WriteLine("yard?: ");
            string input = Console.ReadLine();

            var cm = (Convert.ToDouble(input) * 91.44).ToString();
            Console.WriteLine("{0:0.0}yard = {1:0.0}cm", input, cm);

        }
    }
}
