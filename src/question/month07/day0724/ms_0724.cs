using System;

namespace algorithm_20
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            for(int i = 1; i < 2*n; i += 2) {
                // 2중 for 문
                for(int j = 0; j < 2*n -1 -i; j++) {
                    Console.Write(" ");
                }
                
                for(int j = 0; j < i; j++) {
                    Console.Write("*");
                }

                Console.WriteLine();

                // 단일 for 문
                //Console.Write(new String(' ', 2*n -1 -i));
                //Console.WriteLine(new String('*', i));
            }
        }
    }
}
