using System;

namespace algorithm_77
{
    class ms_1013
    {
        static int Recursion(int n) 
        {
            if(n == 1)
                return 1;
            else if(n == 2)
                return 2;
            else
                return (Recursion(n-2) * Recursion(n-1)) % 100;
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(0 < n && n <= 100)
                Console.WriteLine(Recursion(n));
        }
    }
}
