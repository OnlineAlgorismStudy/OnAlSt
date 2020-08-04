using System;

namespace samdasu_0706
{
    class samdasu_0706
    {
        static void Main(string[] args)
        {
            int year;

            year = Convert.ToInt32(Console.ReadLine());

            if (year % 400 == 0)
            {
                Console.WriteLine("leap year");
            }
            else if (year % 4 == 0 && (year % 100 != 0))
            {
                Console.WriteLine("leap year");
            }
            else
            {
                Console.WriteLine("common year");
            }

            
        }
    }
}
