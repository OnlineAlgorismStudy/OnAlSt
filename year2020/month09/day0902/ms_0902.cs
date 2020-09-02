using System;

namespace algorithm_48
{
    class ms_0902
    {
        static void Area(int n) 
        {
            Console.WriteLine($"{(n * n * 3.14):.00}");
        }

        static void Main(string[] args)
        {
            Area(Convert.ToInt32(Console.ReadLine()));
        }
    }
}
