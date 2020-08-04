using System;

namespace samdasu_0724
{
    class samdasu_0724
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            for(int i = 1; i<n+1; i++)
            {
                for(int j = i; j<(n*2)-i; j++)
                {
                    Console.Write(" ");
                }
                for(int j = 0; j<(i*2) -1; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine("");
            }
        }
    }
}
