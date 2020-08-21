﻿using System;

namespace algorithm_40
{
    class ms_0821
    {
        static void Main(string[] args)
        {
            int[,] first = new int[2, 4];
            int[,] second = new int[2, 4];

            // string 사용
            Console.WriteLine("first array");
            for(int i = 0; i < 2; i++) 
            {
                String[] data = Console.ReadLine().Split(' ');
                int j = 0;

                foreach(var value in data) {
                    first[i, j] = Convert.ToInt32(value);
                    j++;
                }
            }

            // 2중 for 문 사용
            Console.WriteLine("second array");
            for(int i = 0; i < 2; i++)
                for(int j = 0; j < 4; j++)
                    second[i, j] = Convert.ToInt32(Console.ReadLine());

            for(int i = 0; i < 2; i++) 
            {
                for(int j = 0; j < 4; j++) 
                {
                    Console.Write($"{first[i, j] * second[i, j]}");

                    if(j != 4)
                        Console.Write(" ");
                }

                Console.WriteLine();
            }
        }
    }
}
