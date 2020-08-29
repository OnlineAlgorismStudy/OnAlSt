using System;

namespace algorithm_25
{
    class ms_0731
    {
        static void Main(string[] args)
        {
            int start = 0, end = 0;

            while(true) {
                string input = Console.ReadLine();
                string[] div = input.Split(' ');
                
                start = Convert.ToInt32(div[0]);
                end = Convert.ToInt32(div[1]);

                if(!((2 <= start && start <= 9) && (2 <= end && end <= 9)))
                    Console.WriteLine("INPUT ERROR!");
                else
                    break;
            }

            for(int i = 1; i <= 9; i++) 
            {
                if(start <= end) 
                {
                    for(int j = start; j <= end; j++) 
                    {
                        Console.Write($"{j} * {i} = {j*i, 2:#0}");

                        if(j != end)
                            Console.Write("   ");
                    }
                } 
                else 
                {
                    for(int j = start; j >= end; j--) 
                    {
                        Console.Write($"{j} * {i} = {j*i, 2:#0}");

                        if(j != end)
                            Console.Write("   "); 
                    }
                }

                Console.WriteLine();
            }
        }
    }
}
