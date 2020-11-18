using System;

namespace _1112
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');

            Array.Sort(input);

            Console.WriteLine(input[0]);
        }
    }
}
