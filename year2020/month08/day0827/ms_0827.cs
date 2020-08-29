using System;

namespace algorithm_44
{
    class ms_0827
    {
        static void Main(string[] args)
        {
            int[,] data = new int[4, 3]
            {
                { 3, 5, 9 },
                { 2, 11, 5 },
                { 8, 30, 10 },
                { 22, 5, 1 }
            };
            int sum = 0;

            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 3; j++) {
                    Console.Write(data[i, j]);
                    sum += data[i, j];

                    if(j != 3)
                        Console.Write(' ');
                }

                Console.WriteLine();
            }

            Console.WriteLine(sum);
        }
    }
}
