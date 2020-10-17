using System;

namespace algorithm_80
{
    class ms_1016
    {
        static void Print(int[] data, int loc, int n) 
        {
            for(int i = 0; i < 6; i++) 
            {
                if(loc == 0) // data[0] = 1 ~ 6
                    data[loc] = i + 1;
                else 
                    data[loc] = data[loc-1] + i;

                if(data[loc] > 6)
                    return;

                if(loc == n-1) 
                {
                    for(int j = 0; j < n; j++) 
                    {
                        Console.Write(data[j]);

                        if(j != n)
                            Console.Write(' ');
                    }

                    Console.WriteLine();
                } 
                else Print(data, loc + 1, n);
            }
        }
        
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            int[] data = new int[10];

            if(0 < n && n <= 10) 
                Print(data, 0, n);
        }
    }
}
