using System;

namespace algorithm_87
{
    class ms_1027
    {
        static void Main(string[] args)
        {
            String input = Console.ReadLine();

            if(input.Length <= 100)
            {
                char data;

                for(int i = 0; i < input.Length; i++)
                {
                    data = input[i];

                    if((65 <= data && data <= 90) || (97 <= data && data <= 122))
                        Console.Write(Char.ToUpper(data));
                }
            }
        }
    }
}
