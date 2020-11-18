using System;

namespace _1111
{
    class samdasu1111
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();

            if (input.Length < 100)
            {
                if (input.Contains("c"))
                {
                    Console.Write("Yes ");
                }                
                else
                {
                    Console.Write("NO ");
                }

                if (input.Contains("ab"))
                {
                    Console.Write("Yes ");
                }
                else
                {
                    Console.Write("NO");
                }
            }
        }
    }
}
