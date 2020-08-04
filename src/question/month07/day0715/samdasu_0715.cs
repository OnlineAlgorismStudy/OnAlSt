using System;

namespace samdasu_0715
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if (n > 0)
            {
                for(int i = n; i>=1; i--)
                {
                    for(int j = 1; j<=i; j++)
                    {
                        Console.Write("*");
                    }
                    Console.WriteLine("");
                }
                for(int i = 1; i <= n; i++)
                {
                    for(int j = 1; j <= i; j++)
                    {
                        Console.Write("*");
                    }
                    Console.WriteLine("");
                }
            }
            else
            {
                Console.WriteLine("자연수만 입력해 주세요.");
            }
        }
    }
}
