using System;

namespace algorithm_28
{
    class ms_0805
    {
        static void Main(string[] args)
        {
            double[] avg = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
            string[] input = Console.ReadLine().Split(' ');
            double sum = 0;

            for(int i = 0; i < 2; i++) {
                sum += avg[Convert.ToInt32(input[i]) - 1];
            }

            Console.WriteLine($"{sum:.0}");
        }
    }
}
