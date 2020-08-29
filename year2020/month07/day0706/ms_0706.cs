using System;

namespace algorithm_06
{
    class ms_0706
    {
        static void Main(string[] args)
        {
            int year = Convert.ToInt32(Console.ReadLine());

            if((year%4 == 0 && year%100 != 0) || year%400 == 0)
                Console.WriteLine("leap year");
            else 
                Console.WriteLine("common year");
        }
    }
}
