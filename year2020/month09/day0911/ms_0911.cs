using System;

namespace algorithm_55
{
    class ms_0911
    {
        static void Sum(int n) 
        {
            int total = 0;

            for(int i = 1; i <= n; i++)
                total += i;

            Console.WriteLine(total);
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(1 <= n && n <= 1000)
                Sum(n);
        }
    }
}
