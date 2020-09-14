using System;

namespace algorithm_56
{
    class ms_0914
    {
        static void printRec(int n) 
        {
            for(int i = 1; i <= n; i++) 
            {
                for(int j = 1; j <= n; j++) 
                {
                    Console.Write(i*j);

                    if(j != n)
                        Console.Write(' ');
                }

                Console.WriteLine();
            }
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(1 <= n && n <= 100)
                printRec(n);
        }
    }
}
