using System;

namespace _0925
{
    class Program
    {
        static void Main(string[] args)
        {
            
            int input = Convert.ToInt32(Console.ReadLine());
            if (0 < input&& input < 21)
            {
                fn_Pow(input);
            }

            
        }

        static void fn_Pow(int a)
        {
            //int value = 2;
            Console.WriteLine(Math.Pow(2, a));
        }
    }
}
