using System;

namespace algorithm_37
{
    class ms_0818
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            int[] data = new int[n];

            if(0 < n && n <= 20) 
            {
                for(int i = 0; i < n; i++)
                    data[i] = Convert.ToInt32(Console.ReadLine());

                for(int i = 0; i < n-1; i++) 
                {
                    int temp = i;

                    for(int j = i+1; j < n; j++) 
                        if(data[temp] < data[j])
                            temp = j;

                    int value = data[temp];
                    data[temp] = data[i];
                    data[i] = value;
                }

                for(int i = 0; i < n; i++)
                    Console.WriteLine(data[i]);
            }
        }
    }
}
