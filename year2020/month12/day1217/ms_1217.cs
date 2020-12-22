using System;

namespace algorithm_124
{
    class ms_1217
    {
        static long solution(long n) 
        {
            long answer = -1;
            long sqrt = Convert.ToInt64(Math.Truncate(Math.Sqrt(n)));
            
            if(sqrt * sqrt == n) 
            {
                answer = (sqrt + 1) * (sqrt + 1);
            }
            
            return answer;
        }

        static void Main(string[] args)
        {
            long n = Convert.ToInt64(Console.ReadLine());

            if(1 <= n && n <= 50000000000000) 
            {
                Console.WriteLine(solution(n));
            }
        }
    }
}
