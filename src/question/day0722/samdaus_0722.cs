using System;

namespace samdasu_0722
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            for(int i =1; i<=n; i++)
            {
                for(int j =1; j<=i; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine("");
            }
            for(int i =n-1; i>=1; i--)
            {
                for(int j = 1; j <= i; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine("");
            }
           /* for(int i = 0; i<((n*2)-1); i++)
            {
                for(int j= i; j<n; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine("");
            }
            */
        }
    }
}
