using System;

namespace algorithm_51
{
    class ms_0907
    {
        static int Power(int n, int count) 
        {
            if(count == 0)
                return 1;
            else
                return n * Power(n, count-1);
        }

        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            int num = Convert.ToInt32(input[0]);
            int count = Convert.ToInt32(input[1]);
            
            Console.Write(Power(num, count));
        }
    }
}
