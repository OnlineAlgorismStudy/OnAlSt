using System;

namespace algorithm_93
{
    class ms_1104
    {
        static void Main(string[] args)
        {
            String[] data = Console.ReadLine().Split(' ');

            if(data.Length <= 100) 
            {
                for(int i = 0; i < data.Length; i++)
                    Console.WriteLine($"{i+1}. {data[i]}");
            }
        }
    }
}
