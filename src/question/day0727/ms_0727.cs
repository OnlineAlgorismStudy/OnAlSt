using System;

namespace algorithm_21
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            for(int i = n-1; i >= 0; i--) {                
                for(int j = 1; j <= i; j++) {
                    Console.Write("  ");
                }

                int cnt = 1;
                for(int j = 1; j <= n-i; j++) {
                    Console.Write(cnt++);

                    if(j != n-i)
                        Console.Write(' ');
                }

                Console.WriteLine();
            }
        }
    }
}
