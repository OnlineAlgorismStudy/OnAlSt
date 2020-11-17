using System;

namespace algorithm_102
{
    class ms_1117
    {
        static void Main(string[] args)
        {
            String input = Console.ReadLine();
            String[] data = input.Split(' ');
            int len = data.Length;
            
            if(input.Length <= 100)
            {
                for(int i = 0; i < len; i++)
                Console.WriteLine(data[len - (i+1)]);
            }
        }
    }
}
