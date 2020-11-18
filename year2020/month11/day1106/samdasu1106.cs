using System;

namespace _1106
{
    class samdasu1106
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();

            string[] arr = input.Split(' ');

            for(int i = 0; i<arr.Length; i++)
            {
                if (i % 2 == 0)
                {
                    Console.WriteLine(arr[i]);
                }
            }
        }
    }
}
