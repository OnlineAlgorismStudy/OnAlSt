using System;

namespace algorithm_58
{
    class ms_0916
    {
        static void TSS(int[,] data) // Total Score by Student
        {
            for(int i = 0; i < 3; i++)
            {
                string[] input = Console.ReadLine().Split(' ');

                for(int j = 0; j < 3; j++)
                {
                    int temp = Convert.ToInt32(input[j]);
                    
                    if(0 <= temp && temp <= 100)
                    {
                        data[i, j] = temp;
                        data[i, 3] += data[i, j];
                        data[3, j] += data[i, j]; 
                    }
                }

                data[3, 3] += data[i, 3];
            }
        }

        static void Main(string[] args)
        {
            int[,] data = new int[4, 4]
            {
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 }
            };

            TSS(data);

            for(int i = 0; i < 4; i++)
            {
                for(int j = 0; j < 4; j++)
                {
                    Console.Write(data[i, j]);

                    if(j != 4)
                        Console.Write(' ');
                }

                Console.WriteLine();
            }
        }
    }
}
