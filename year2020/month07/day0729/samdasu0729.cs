using System;

namespace samdasu_0729
{
    class samdasu0729
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            for(int i =1; i<n+1; i++)
            {
                for(int j = 1; j<=i; j++)
                {
                    Console.Write("# ");
                }
                Console.WriteLine("");
                /*if (i <= 0)
                {
                    Console.WriteLine("#)
                }*/
            }
            for(int i = 1; i<n; i++)
            {
                for(int j =1; j <= i; j++)
                {
                    Console.Write("  ");
                }
                for(int k =1; k<=n - i; k++)
                {
                    Console.Write("# ");
                }
                Console.WriteLine("");
            }
        }
    }
}
