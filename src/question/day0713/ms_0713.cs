using System;

namespace algorithm_11
{
    class ms_0713
    {
        static void Main(string[] args)
        {
            for(int i = 2; i < 5; i++) {
                for(int j = 1; j < 6; j++) {
                    Console.Write($"{i} * {j} = {i*j, 2:#0}   ");
                }
                Console.WriteLine();
            }
        }
    }
}
