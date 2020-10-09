using System;

namespace algorithm_74
{
    class Program
    {
        static void half(int n) 
        {
            if(n != 0) 
            {
                half(n/2);
                Console.Write($"{n}");
            }
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            
            if(0 < n)
                half(n);
        }
    }
}
