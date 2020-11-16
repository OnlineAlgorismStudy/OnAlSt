using System;

namespace algorithm_101
{
    class ms_1116
    {
        static void Main(string[] args)
        {
            String input = Console.ReadLine();
            String[] data = input.Split(' ');

            input = "";
            
            for(int i = 0; i < data.Length; i++)
                input += data[i];

            int len = input.Length;

            while(len > 0)
            {
                if((len - 3) <= 0) 
                {
                    Console.WriteLine(input[..len]);
                    input = "";
                }
                else 
                {
                    Console.WriteLine(input[..3]);
                    input = input[3..];
                }

                len = input.Length;
            }
        }
    }
}
