using System;

namespace algorithm_82
{
    class ms_1020
    {
        static void Main(string[] args)
        {
            String data = Console.ReadLine();

            if(data.Length <= 100)
                Console.WriteLine($"{data}{data}");
        }
    }
}
