using System;

namespace samdasu_0727
{
    class samdasu_0727
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            for(int i = 1; i<=n; i++)
            {
                for(int j = 1; j<(n * 2) -i; j++)
                {
                    Console.Write(" ");
                }
                for(int k = 1; k<=i; k++)
                {
                    Console.Write(k);
                    //k++;
                }
                Console.WriteLine(" ");
            }
        }
    }
}
