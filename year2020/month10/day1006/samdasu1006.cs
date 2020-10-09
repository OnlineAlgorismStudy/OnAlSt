using System;

namespace sam1006
{
    class samdasu1006
    {
        

        static void Main(string[] args)
        {
            int input = Convert.ToInt32(Console.ReadLine());
            

            if(input <= 50)
            {
                fn_Recursion(input);

                Console.WriteLine(fn_Recursion(input));
            }
        }

        static int fn_Recursion(int a)
        {
            if(a == 1)
            {
                return 1;
            }
            else
            {
                return fn_Recursion(a / 2) + fn_Recursion(a - 1);
            }
        }
    }
}
