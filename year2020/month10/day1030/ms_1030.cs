using System;

namespace algorithm_90
{
    class ms_1030
    {
        static void Main(string[] args)
        {
            String input = Console.ReadLine();

            if(input.Length <= 100)
            {
                for(int i = 0; i < input.Length; i++)
                {
                    if((65 <= input[i] && input[i] <= 90) || (97 <= input[i] && input[i] <= 122))
                        Console.Write(Char.ToLower(input[i]));

                    else if (48 <= input[i] && input[i] <= 57)
                        Console.Write(input[i]);
                }
            }
        }
    }
}
