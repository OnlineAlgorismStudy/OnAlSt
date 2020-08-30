using System;

namespace samdasu_0831
{
    class Program
    {
        static void Main(string[] args)
        {
            char[,] n = new char[3, 5];

            for(int i = 0; i < 3; i++)
            {
                for(int j = 0;j<5; j++)
                {
                    n[i, j] = Convert.ToChar(Console.ReadLine());
                }
            }
            for(int i = 0; i<3; i++)
            {
                for (int j = 0; j < 5; j++) 
                {
                    Console.Write("{0} ", Convert.ToChar(n[i, j] + 32));
                }
                Console.WriteLine(" ");
            }
        }
    }
}
