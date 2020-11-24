using System;

namespace algorithm_107
{
    class ms_1124
    {
        static void Main(string[] args)
        {
            String[] input = Console.ReadLine().Split(' ');
            String A = "";
            String B = "";
            int n = 0;

            for(;;)
            {
                if(input[0].Length <= 100 && input[1].Length <= 100 && 1 <= Convert.ToInt32(input[2]))
                {
                    A = input[0];
                    B = input[1];
                    n = Convert.ToInt32(input[2]);
                    break;
                }
            }
            
            A = A + B;
            B = A[..n] + B[n..];
            
            Console.WriteLine(A);
            Console.WriteLine(B);
        }
    }
}
