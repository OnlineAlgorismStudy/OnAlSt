using System;

namespace samdasu1015
{
    class Program
    {
        static void Main(string[] args)
        {
            int input1 = Convert.ToInt32(Console.ReadLine());
            int input2 = Convert.ToInt32(Console.ReadLine());
            int input3 = Convert.ToInt32(Console.ReadLine());

            int plus = input1 * input2 * input3;

            Console.WriteLine(fn_f(plus));
        }

        static int fn_f(int a)
        {
            if (a == 0)
            {
                return 1;
            }
            int i = 1;

            i = a % 10;

            if (i == 0)
            {
                i = 1;
            }

            a = a / 10;

            return (i * fn_f(a));
        }
    }
}
