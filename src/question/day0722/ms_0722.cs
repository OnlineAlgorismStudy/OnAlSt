using System;

namespace algorithm_18
{
    class ms_0722
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            for(int i = -(n-1); i <= (n-1); i++) {
                // 2중 for 문
                for(int j = 0; j < (n - Math.Abs(i)); j++) {
                    Console.Write("*");
                }
                Console.WriteLine();

                // 단일 for 문
                //Console.WriteLine(new String('*', n - Math.Abs(i)));
            }
        }
    }
}
