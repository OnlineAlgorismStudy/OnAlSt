using System;

namespace samdasu1002
{
    class samdasu1002
    {
        static void Main(string[] args)
        {
            int input = Convert.ToInt32(Console.ReadLine());

            if(input <= 50)
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
                Console.Write(a + " ");
                a--;
                fn_Recursion(a);
            }
        }
    }
}
