using System;

namespace algorithm_61
{
    class Program
    {
        static void BubbleSort(int[] data) 
        {
            for(int i = 0; i < data.Length-1; i++) 
            {
                for(int j = 0; j < data.Length-1; j++) 
                {
                    if(data[j] < data[j+1]) 
                    {
                        int temp = data[j];
                        data[j] = data[j+1];
                        data[j+1] = temp;
                    }
                }
 
                for(int j = 0; j < data.Length; j++) 
                {
                    Console.Write(data[j]);

                    if(j != data.Length)
                        Console.Write(' ');
                }

                Console.WriteLine();
            }
        }

        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            int[] data = new int[10];
            int i = 0;

            foreach(string value in input)
                data[i++] = Convert.ToInt32(value);

            BubbleSort(data);
        }
    }
}
