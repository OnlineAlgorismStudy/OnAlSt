using System;

namespace algorithm_75
{
    class Program
    {
        static void OddEven(int n) 
        {
            if(n <= 0)
                return;

            OddEven(n-2);
            Console.Write($"{n} ");
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(0 < n)
                OddEven(n);
        }
    }
}
