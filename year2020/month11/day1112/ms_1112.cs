using System;

namespace algorithm_99
{
    class ms_1112
    {
        static void Main(string[] args)
        {
            String[] input = Console.ReadLine().Split(' ');

            for(int i = 0; i < input.Length; i++) 
            {
                if(!(1 <= input[i].Length && input[i].Length <= 10))
                    return;
            }

            Array.Sort(input);
            Console.WriteLine(input[0]);
        }
    }
}
