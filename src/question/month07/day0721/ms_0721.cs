using System;

namespace algorithm_17
{
    class ms_0721
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            int plusInt = 1;
            char plusChar = 'A';

            for(int i = n; i > 0; i--) 
            {
                for(int j = 0; j < n+1; j++)
                    if(j < i)
                        Console.Write($"{plusInt++} ");
                    else
                        Console.Write($"{plusChar++} ");
                
                Console.WriteLine();
            }
        }
    }
}
