using System;

namespace samdasu_0721
{
    //?????
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            char a = 'A';
            int b = 1;
            for(int i = 0; i<n; i++)
            {
                for (int j = i; j < n; j++)
                {
                    Console.Write("{0} ", b);
                    b++;
                }
                for(int j = 0; j<= i; j++)
                {
                    Console.Write("{0} ", a);
                    a++;
                }
                Console.WriteLine("");
            }
            
        }
    }
}
