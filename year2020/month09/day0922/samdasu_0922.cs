using System;

namespace samdasu_0922
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] input = new int[2];

            for(int i = 0; i<2; i++)
            {
                input[i] = Convert.ToInt32(Console.ReadLine());
            }

            fn_Macro(input);
        }

        static void fn_Macro(int[] a)
        {
            Console.WriteLine("({0}-{1}) ^ 2 = {2}", a[0], a[1], (a[0] - a[1]) * (a[0] - a[1]));
            Console.WriteLine("({0}+{1}) ^ 3 = {2}", a[0], a[1], (a[0] + a[1]) * (a[0] + a[1])*(a[0] + a[1]));

        }
    }
}
