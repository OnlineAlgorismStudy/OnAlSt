using System;

namespace algorithm_89
{
    class ms_1029
    {
        static void Main(string[] args)
        {
            String input = Console.ReadLine();
            int strLen = input.Length;
            
            Console.WriteLine();

            if(strLen <= 100) 
            {
                for(int i = strLen-1; i >= 0; i--) 
                {
                    for(int j = i; j < strLen; j++)
                        Console.Write(input[j]);

                    for(int j = 0; j < i; j++)
                        Console.Write(input[j]);

                    Console.WriteLine();
                }
            }
        }
    }
}
