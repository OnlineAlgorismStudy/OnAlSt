using System;

namespace algorithm_120
{
    class ms_1211
    {
        static int solution(int n)
        {
            int answer = 0;

            for(int i = 1; i <= n; i++)
            {
                if(n % i == 0)
                {
                    answer += i;
                }
            }

            return answer;
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(0 <= n && n <= 3000)
            {
                Console.WriteLine(solution(n));
            }
        }
    }
}
