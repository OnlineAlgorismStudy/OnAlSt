using System;

namespace samdasu1104
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string[] arinput = input.Split(' ');

            for(int i = 0; i<arinput.Length; i++)
            {
                Console.WriteLine((i+1) + "." + arinput[i]);
            }
        }
    }
}
