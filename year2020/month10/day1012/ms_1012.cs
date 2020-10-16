using System;

namespace algorithm_76
{
    class ms_1012
    {
        static void Print(int n, int m, int[] data, int loc) 
        {
            for(int i = 1; i <= 6; i++) 
            {
                data[loc-1] = i;

                if(loc == n)
                {
                    int sum = 0;

                    for(int j = 0; j < n; j++)
                        sum += data[j];

                    if(sum == m) 
                    {
                        for(int h = 0; h < n; h++) 
                        {
                            Console.Write(data[h]);

                            if(h != n)
                                Console.Write(' ');
                        }

                        Console.WriteLine();
                        return;
                    }
                }
                else Print(n, m, data, loc+1);
            }
        }

        static void Main(string[] args)
        {
            String[] input = Console.ReadLine().Split(' ');
            int n = Convert.ToInt32(input[0]);
            int m = Convert.ToInt32(input[1]);
            
            if(0 < n && n <= 10 && 0 < m)
                Print(n, m, new int[10], 1);
        }
    }
}
