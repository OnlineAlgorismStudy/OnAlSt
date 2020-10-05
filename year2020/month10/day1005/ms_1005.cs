using System;

namespace algorithm_71
{
    class ms_1005
    {
        static int SequenceSum(int n) 
        {
            if(n <= 0)
                return 0;
            else
                return n + SequenceSum(n-1);
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(0 < n && n <= 100)
                Console.WriteLine(SequenceSum(n));
        }
    }
}
