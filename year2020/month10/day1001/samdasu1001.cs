using System;

namespace samdasu1001
{
    class samdasu1001
    {
        static void Main(string[] args)
        {
            int input = Convert.ToInt32(Console.ReadLine());

            if(input <= 20)
            {
                fn_Recursion(input);
            }
        }
        static void fn_Recursion(int a)
        {
            if(a == 0)
            {
                return;
            }
            else
            {
                Console.WriteLine("recursive");
                a--;
                fn_Recursion(a);
            }
        }
    }
}
