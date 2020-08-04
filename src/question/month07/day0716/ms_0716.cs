using System;

namespace algorithm_14
{
    class ms_0716
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            for(int i = 0; i < n; i++) {
                Console.Write(new String(' ', i));

                for(int j = i; j < n; j++)
                    Console.Write('*');
                
                Console.WriteLine();
            }
        }
    }
}
