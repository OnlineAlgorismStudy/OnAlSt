using System;

namespace algorithm_94
{
    class ms_1105
    {
        static void Main(string[] args)
        {
            String[] input = new String[5];

            for(int i = 0; i < 5; i++) 
            {
                input[i] = Console.ReadLine();

                if(input[i].Length > 30) 
                {
                    i--;
                    continue;
                }
            }

            for(int i = input.Length-1; i >= 0; i--)
                Console.WriteLine(input[i]);
        }
    }
}
