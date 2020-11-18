using System;

namespace _1105
{
    class samdasu1105
    {
        static void Main(string[] args)
        {
            string[] a = new string[5];

            for(int i = 0; i<5; i++)
            {
                a[i] = Console.ReadLine();

                
            }

            for(int i = a.Length -1; i>=0; i--)
            {
                Console.WriteLine(a[i]);
            }
        }
    }
}
