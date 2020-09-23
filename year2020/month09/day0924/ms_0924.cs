using System;

namespace algorithm_63
{
    class ms_0924
    {
        static void SumOfAbs(int[] data) 
        {
            int sum = 0;

            for(int i = 0; i < data.Length; i++)
                sum += Math.Abs(data[i]);

            Console.WriteLine(sum);
        }

        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            int[] data = new int[5];

            for(int i = 0; i < data.Length; i++)
                data[i] = Convert.ToInt32(input[i]);
                
            SumOfAbs(data);
        }
    }
}
