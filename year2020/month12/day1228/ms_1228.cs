using System;

namespace algorithm_01
{
    class ms_1228
    {
        static void Main(string[] args)
        {
            Console.Clear();

            String[] s = Console.ReadLine().Split(' ');
            int n = Convert.ToInt32(s[0]);
            int m = Convert.ToInt32(s[1]);
            
            if((1 <= n && n <= 1000) && (1 <= m && m <= 1000))
            {
                for(int i = 0; i < m; i++)
                {
                    for(int j = 0; j < n; j++)
                    {
                        Console.Write('*');
                    }

                    Console.WriteLine();
                }
            }
        }
    }
}
