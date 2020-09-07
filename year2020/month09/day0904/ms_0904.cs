using System;

namespace algorithm_50
{
    class ms_0904
    {
        static int getMax(int[] data) 
        {
            int max = data[0];

            for(int i = 1; i < data.Length; i++)
                if(max < data[i])
                    max = data[i];

            return max;
        }

        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            int[] data = new int[3];
            
            for(int i = 0; i < data.Length; i++)
                data[i] = Convert.ToInt32(input[i]);

            Console.Write(getMax(data));
        }
    }
}
