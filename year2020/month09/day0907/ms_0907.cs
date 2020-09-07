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
            int[] data = new int[2] { 11, 11 };
            int i = 0;

            foreach(var value in input) {
                int temp = Convert.ToInt32(value);

                if(temp <= 10)
                    data[i] = temp;
                i++;
            }
            
            if(data[0] != 11 && data[1] != 11) {
                Console.Write(Power(data[0], data[1]));
            }
        }
    }
}
