using System;

namespace samdasu_0717
{
    class samdasu_0717
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            for (int i = 1; i <=n; i++)
            {
                for (int j = 1; j < i; j++)
                {
                    Console.Write(" ");
                }
                for(int k = 0; k<(n-i)*2 + 1; k++)
                {
                    Console.Write("*");
                }
                Console.WriteLine(" ");/*
                    if (i <= j + 2 && j <= 2 * n - i)
                    {
                        Console.Write("*");
                    }
                    else
                    {
                        Console.Write(" ");
                    }
                }
                Console.WriteLine("");*/
            }
        }
    }
}
