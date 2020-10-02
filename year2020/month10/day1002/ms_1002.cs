using System;

namespace algorithm_70
{
    class ms_1002
    {
        static void RecursionPrint(int n) 
        {
            if(n == 0)
                return;
            
            Console.Write($"{n} ");
            RecursionPrint(n - 1);
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(0 < n && n <= 50)
                RecursionPrint(n);
        }
    }
}
