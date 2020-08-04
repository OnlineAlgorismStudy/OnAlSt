using System;

namespace algorithm_16
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(3 <= n && n <= 10) {
                char symbol = 'A';

                for(int i = n; i > 0; i--) {
                    for(int j = 0; j < i; j++) {
                        Console.Write(symbol);
                        symbol++;
                    }
                    Console.WriteLine();
                }
            }
        }
    }
}
