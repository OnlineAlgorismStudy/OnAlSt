using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace samsasu_0713
{
    class samdasu_0713
    {
        static void Main(string[] args)
        {
            for(int i = 2; i<5; i++)
            {
                for(int j =1; j<6; j++)
                {
                    Console.Write("{0} * {1} =  {2}   ", i, j, i * j);
                    if(j == 5)
                    {
                        Console.WriteLine("");
                    }
                }
            }
        }
    }
}
