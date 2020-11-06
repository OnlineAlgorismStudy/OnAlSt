using System;

namespace algorithm_95
{
    class ms_1106
    {
        static void Main(string[] args)
        {
            String input = Console.ReadLine();
            
            if(input.Length <= 100) 
            {
                String[] data = input.Split(' ');

                for(int i = 0; i < data.Length; i += 2)
                    Console.WriteLine(data[i]);
            }
        }
    }
}
