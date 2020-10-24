using System;

namespace algorithm_81
{
    class ms_1019
    {
        static void Main(string[] args)
        {
            int n;

            while(true) 
            {
                Console.Write("ASCII code =? ");
                n = Convert.ToInt32(Console.ReadLine());

                if(33 <= n && n <= 127)
                    Console.WriteLine(Convert.ToChar(n));
                else break;
            }
        }
    }
}
