using System;

namespace algorithm_109
{
    class ms_1126
    {
        static void Main(string[] args)
        {
            String[] input = Console.ReadLine().Split(' ');

            int A = Convert.ToInt32(input[0]);
            double B = Convert.ToDouble(input[1]);
            String C = input[2];
            
            String total = A + String.Format("{0:0.###}", B) + C;
            int n = total.Length;

            if(n%2 == 0)
                n /= 2;
            else
                n = n/2 + 1;

            if(n <= 30)
            {
                Console.WriteLine(total[..n]);
                Console.WriteLine(total[n..]);
            }
        }
    }
}
