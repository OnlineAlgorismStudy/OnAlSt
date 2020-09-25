using System;

namespace algorithm_65
{
    class ms_0925
    {
        static int RecursionPow(int n) 
        {
            if(n == 0)
                return 1;
            else 
                return 2 * RecursionPow(n-1);
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(1 <= n && n <= 20)
                Console.WriteLine(RecursionPow(n));
        }
    }
}
