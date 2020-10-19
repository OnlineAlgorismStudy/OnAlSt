using System;

namespace samdasu_1013
{
    class samdasu1013
    {
        static void Main(string[] args)
        {
            int n = 0;
            int input = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine(fn_n(input));
        }

        static int fn_n(int a)
        {
            if (a <= 2)
            {

                return a;
            }

            
            return((fn_n(a - 1) * fn_n(a - 2)) % 100);

        }
    }
}
