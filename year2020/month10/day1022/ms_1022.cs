using System;

namespace algorithm_84
{
    class ms_1022
    {
        static void Main(string[] args)
        {
            String[] input = Console.ReadLine().Split(' ');
            String data = input[0];
            int range = Convert.ToInt32(input[1]);
            int dl = data.Length;
            int min = range;

            if(dl > range)
                min = dl - range;
            else min = 0;

            if(dl <= 100) 
                for(int i = dl - 1; i >= min; i--) 
                    Console.Write(data[i]);
        }
    }
}
