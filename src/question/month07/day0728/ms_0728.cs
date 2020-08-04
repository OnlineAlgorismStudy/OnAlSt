using System;

namespace algorithm_22
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            int cnt = 1;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < i; j++) {
                    Console.Write("  ");
                }

                for(int j = 0; j < n-i; j++) {
                    Console.Write($"{cnt++} ");
                }

                Console.WriteLine();
            }
        }
    }
}
