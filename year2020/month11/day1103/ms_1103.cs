using System;

namespace algorithm_92
{
    class ms_1103
    {
        static void Main(string[] args)
        {
            String input = Console.ReadLine();

            if(input.Length <= 100)
            {
                while(input.Length != 1)
                {
                    int index = Convert.ToInt32(Console.ReadLine());
                    int len = input.Length;

                    if(index >= len)
                        index = len - 1;
                    else 
                        index -= 1;

                    input = input.Remove(index, 1);

                    Console.WriteLine(input);
                }
            }
        }
    }
}
