using System;

namespace algorithm_97
{
    class ms_1110
    {
        static void Main(string[] args)
        {
            String[] input = Console.ReadLine().Split(' ');
            String data_A = input[0];
            String data_B = input[1];

            if(data_A.Length <= 20 && data_B.Length <= 20)
            {
                String temp = data_A[..2];

                data_B = temp + data_B[2..] + temp;

                Console.WriteLine(data_A);
                Console.WriteLine(data_B);
            }
        }
    }
}
