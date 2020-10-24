using System;

namespace algorithm_95
{
    class ms_1023
    {
        static void Main(string[] args)
        {
            String first = Console.ReadLine();
            String second = Console.ReadLine();

            if(first.Length < 20 && second.Length < 20)
                Console.WriteLine(first.Length + second.Length);
        }
    }
}
