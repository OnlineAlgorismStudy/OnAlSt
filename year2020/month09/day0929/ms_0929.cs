using System;

namespace algorithm_67
{
    class ms_0929
    {
        public const int MAX = 7;

        static void rangeBubbleSort(int[] data) 
        {
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < MAX-1; j++) 
                {
                    if(data[j] > data[j+1]) 
                    {
                        int temp = data[j];
                        data[j] = data[j+1];
                        data[j+1] = temp;
                    }
                }
            }

            for(int i = 0; i < MAX; i++) 
            {
                Console.Write(data[i]);

                if(i != MAX)
                    Console.Write(' ');
            }
        }

        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            int[] data = new int[MAX];

            for(int i = 0; i < data.Length; i++)
                data[i] = Convert.ToInt32(input[i]);

            rangeBubbleSort(data);
        }
    }
}
