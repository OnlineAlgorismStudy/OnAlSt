using System;

namespace samdaus_1005
{
    class Program
    {
        static int sum = 0;
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if (0 < n && n<= 100)
            {
                fn_nSum(n);
            }
        }
        static void fn_nSum(int a)
        {
            if (a == 0)
            {
                Console.WriteLine(sum);
                return;
            }
            else
            {
                sum += a;
                a--;
                fn_nSum(a);
            }
        }
    }
}
