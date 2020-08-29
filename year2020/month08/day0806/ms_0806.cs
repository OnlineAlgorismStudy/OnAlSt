using System;

namespace algorithm_29
{
    class ms_0806
    {
        static void Main(string[] args)
        {
            int[] data = new int[10];

            for(int i = 0; i < data.Length; i++) {
                int temp = Convert.ToInt32(Console.ReadLine());
                
                if(temp > 1000) {
                    i--;
                    continue;
                }

                data[i] = temp;
            }

            int min = 1000;

            for(int i = 0; i < data.Length; i++) {
                if(data[i] < min) {
                    min = data[i];
                }
            }

            Console.WriteLine(min);
        }
    }
}
