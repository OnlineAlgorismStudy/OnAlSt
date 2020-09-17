using System;

namespace algorithm_59
{
    class ms_0917
    {
        static void DescendingSort(int[] data) 
        {
            for(int i = 0; i < data.Length - 1; i++) 
            {
                int index = i;

                for(int j = 1 + i; j < data.Length; j++) 
                {
                    if(data[index] < data[j])
                        index = j;

                    int temp = data[index];
                    data[index] = data[i];
                    data[i] = temp;
                }
            }

            for(int i = 0; i < data.Length; i++) 
            {
                Console.Write(data[i]);

                if(i != data.Length)
                    Console.Write(' ');
            }
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(0 < n && n <= 10) 
            {
                int[] data = new int[n];
                string[] input = Console.ReadLine().Split(' ');

                for(int i = 0; i < n; i++)
                    data[i] = Convert.ToInt32(input[i]);

                DescendingSort(data);
            }
        }
    }
}
