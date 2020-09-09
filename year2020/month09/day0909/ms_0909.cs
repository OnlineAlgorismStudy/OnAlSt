using System;

namespace algorithm_53
{
    class ms_0909
    {
        static void MultTable(int start, int end) 
        {
            for(int i = start; i <= end; i++) 
            {
                Console.WriteLine($"== {i}dan ==");
        
                for(int j = 1; j <= 9; j++)
                    Console.WriteLine($"{i} * {j} = {i*j, 2}");

                Console.WriteLine();
            }
        }

        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            int start = Convert.ToInt32(input[0]);
            int end = Convert.ToInt32(input[1]);

            if(start > end) 
            {
                int temp = start;
                start = end;
                end = temp;
            }

            MultTable(start, end);
        }
    }
}
