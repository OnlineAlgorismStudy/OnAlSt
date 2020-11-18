using System;

namespace _1110
{
    class samdasu1110
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();

            string[] a = input.Split(" ");

            string eon = a[0].Substring(0,2);       //앞 두글자.

            string print= eon + a[1].Substring(2,a[1].Length-2) + eon;

            Console.WriteLine(print);
        }
    }
}
