using System;

namespace algorithm_78
{
    class ms_1014
    {
        static void Print(int n, int level) 
        {
            if(n == 1) 
            {
                //Console.WriteLine(n);
                Console.WriteLine(level);
                return;
            } 
            //else Console.Write($"{n} -> ");

            if(n%2 == 0)
                Print(n/2, ++level);
            else
                Print(n/3, ++level);
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(0 < n && n <= 100) 
                Print(n, 0);
        }
    }
}
