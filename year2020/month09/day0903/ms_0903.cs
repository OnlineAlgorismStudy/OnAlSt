using System;

namespace algorithm_49
{
    class Program
    {
        static void DrawRec(int n) 
        {
            int count = 1;

            for(int i = 0; i < n; i++) 
            {
                for(int j = 0; j < n; j++) 
                {
                    Console.Write(count);
                    count++;

                    if(j != n)
                        Console.Write(' ');
                }

                Console.WriteLine();
            }
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(0 < n && n < 100) 
            {
                DrawRec(n);
            }
        }
    }
}
