using System;

namespace algorithm_73
{
    class Program
    {
        static int ESP(int n) // Each Sum of Power
        {
            if(n == 0)
                return 0;
            else
                return Convert.ToInt32(Math.Pow(n % 10, 2)) + ESP(n/10);
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(0 < n && n < 1000000000)
                Console.WriteLine(ESP(n));
        }
    }
}
