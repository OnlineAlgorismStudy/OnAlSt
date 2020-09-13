using System;
using System.Data;

namespace samdasu_0905
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = Convert.ToInt32(Console.ReadLine());
            int b = Convert.ToInt32(Console.ReadLine());

            if(a >0 && b > 0)
            {
                fn_doubleNum(a,b);
            }
        }
        static void fn_doubleNum(int a, int b)
        {
            int double_a = a * a;
            int double_b = b * b;

            if (double_a > double_b)
            {
                Console.WriteLine(double_a - double_b);
            }
            else if (double_b > double_a)
            {
                Console.WriteLine(double_b - double_a);
            }
            else { Console.WriteLine("0"); }
        }
    }
}
