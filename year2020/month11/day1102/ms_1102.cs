using System;

namespace algorithm_91
{
    class ms_1102
    {
        static void Main(string[] args)
        {
            String data = Console.ReadLine();

            if(data.Length <= 100) 
            {
                String[] input = data.Split(' ');
                int maxIndex = 0;
                
                for(int i = 0; i < input.Length; i++) 
                    if(input[i].Length >= input[maxIndex].Length)
                        maxIndex = i;

                Console.WriteLine(input[maxIndex].Length);
            }
        }
    }
}
