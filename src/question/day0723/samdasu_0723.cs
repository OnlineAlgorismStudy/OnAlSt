using System;

namespace sadmasu_0723
{
    class samdasu_0723
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            for(int i = 0; i< n; i++)
            {                
                for(int j = 0; j<i; j++)
                {
                    Console.Write(" ");
                }                
                for(int j = 0; j<(n-i)*2 - 1; j++)
                {
                    Console.Write("*");
                }
                
                Console.WriteLine(" ");
                /*for(int j =1; j<i; j++)
                {
                    Console.Write(" ");
                }
                for(int k = 0; k<(n-1)*2 + 1; k++)
                {
                    Console.Write("*");
                }
                Console.WriteLine("");*/
            }

            for( int i = 1; i< n - 1; i++)
            {
                for(int j = n-1; j>i; j--)
                {
                    Console.Write(" ");
                }
                for(int j = 0; j<(i*2) +1; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine(" ");
            }
        }
    }
}
