using System;
using System.Collections;
using System.Runtime.CompilerServices;

namespace samdasu_1019
{
    class samdasu1019
    {
        static void Main(string[] args)
        {
            
            while (true)
            {
                Console.Write("ASCII code =? ");

                //ArrayList arr = new ArrayList();
                //arr.Add(Convert.ToInt16(Console.ReadLine()));
                int n = 0;
                n = Convert.ToInt32(Console.ReadLine());

                
                if(n < 65 || n > 122)
                {
                    break;
                }
                else
                {
                    Console.WriteLine(Convert.ToChar(n));
                }
                
                
                
            }
        }
    }
}
