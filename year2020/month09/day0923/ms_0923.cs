using System;

namespace algorithm_63
{
    class ms_0923
    {
        static int getCount(double[] data) 
        {
            // data[0] < data[1]
            if(data[0] > data[1]) 
            {
                double temp = data[0];
                data[0] = data[1];
                data[1] = temp;
            }

            double x = Math.Truncate(data[0]);
            double y = Math.Truncate(data[1]);
            int count = 0;
            
            if(data[0] == x)
                count = 1;

            for(var i = x + 1; i <= y; i++)
                count++;

            return count;
        }

        static void Main(string[] args)
        {
            double[] data = new double[2] { 0, 0 };
            string[] input = Console.ReadLine().Split(' ');

            for(int i = 0; i < 2; i++) 
            {
                double temp = Convert.ToDouble(input[i]);

                if(temp > 0)
                    data[i] = Math.Sqrt(temp);
            }

            Console.WriteLine(getCount(data));    
        }
    }
}
