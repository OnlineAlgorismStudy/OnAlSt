using System;

namespace samdasu1014
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = 0;
            int input = Convert.ToInt32(Console.ReadLine());

            fn_f(input,0);
        }

        static void fn_f(int a, int b)
        {
            if(a == 1)
            {
                Console.WriteLine(b);
                
            }
            else if(a%2 == 0)
            {
                fn_f(a / 2, b + 1);
            }
            else
            {
                fn_f(a / 3, b + 1);
            }
        }
    }
}
