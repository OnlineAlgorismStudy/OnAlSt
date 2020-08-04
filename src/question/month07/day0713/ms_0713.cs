using System;

namespace algorithm_11
{
    class ms_0713
    {
        static void Main(string[] args)
        {
            int rowMax = 4;
            int columnMax = 5;

            for(int i = 2; i <= rowMax; i++) {
                for(int j = 1; j <= columnMax; j++) {
                    Console.Write($"{i} * {j} = {i*j, 2:#0}");

                    if(j != columnMax)
                        Console.Write("   ");
                }
                Console.WriteLine();
            }
        }
    }
}
