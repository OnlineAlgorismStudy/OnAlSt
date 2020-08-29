using System;

namespace algorithm_32
{
    class ms_0811
    {
        static void Main(string[] args)
        {
            int[] data = new int[10];

            for(int i = 0; i < data.Length; i++) {
                data[i] = Convert.ToInt32(Console.ReadLine());
            }

            for(int i = 0; i < data.Length - 1; i++) {
                int half = i;
                
                for(int j = i+1; j < data.Length; j++) {
                    if(data[half] < data[j]) {
                        half = j;
                    }

                    int temp = data[i];
                    data[i] = data[half];
                    data[half] = temp;
                }
            }

            foreach(int value in data) {
                Console.Write($"{value} ");
            }
        }
    }
}
