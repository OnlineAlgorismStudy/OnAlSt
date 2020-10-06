using System;

namespace algorithm_72
{
    class ms_1006
    {
        static int Sequence(int n) 
        {
            if(n == 0)
                return 0;
            else if(n == 1)
                return 1;
            else
                return Sequence(n/2) + Sequence(n-1);
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(0 < n && n <= 50)
                Console.WriteLine(Sequence(n));
        }
    }
}
