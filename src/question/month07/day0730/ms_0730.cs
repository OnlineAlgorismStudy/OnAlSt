using System;

namespace algorithm_24
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            int count = 1;

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    Console.Write(count);
                    count += 2;

                    if(count >= 10)
                        count = 1;

                    if(j != n)
                        Console.Write(' ');
                }

                Console.WriteLine();
            }
        }
    }
}
