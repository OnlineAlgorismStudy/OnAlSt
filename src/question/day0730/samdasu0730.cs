using System;

namespace samdasu0730
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            int num = 1;

            for(int i = 0; i<n; i++)
            {
                for(int j = 0; j<n; j++)
                {
                    Console.Write("{0} ", num % 10);
                    num += 2;
                }
                Console.WriteLine("");
            }
            
        }
    }
}
