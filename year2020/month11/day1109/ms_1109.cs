using System;

namespace algorithm_96
{
    class ms_1109
    {
        static void Main(string[] args)
        {
            String input = Console.ReadLine();

            if(input.Length <= 20)
                input += "fighting";

            Console.WriteLine(input);
        }
    }
}
