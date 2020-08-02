using System;

namespace Samdasu_0716
{
    class Program
    {        
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            for(int i = 0; i<n; i++)
            {
                Console.Write(" ");
                for (int j = i; j < n; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine("");
            }
            
        }
    }
}
