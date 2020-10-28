using System;

namespace algorithm_88
{
    class ms_1028
    {
        static void Main(string[] args)
        {
            String input = Console.ReadLine();

            if(input.Length <= 100) 
                Console.WriteLine(input.Split(' ').Length);
        }
    }
}
