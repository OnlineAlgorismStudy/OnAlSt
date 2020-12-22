using System;

namespace algorithm_122
{
    class ms_1215
    {
        static int solution(int n) 
        {
            int answer = 0;

            while(n > 0) 
            {
                answer += n%10;
                n /= 10;
            }

            return answer;
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(1 <= n && n <= 100000000) 
            {
                Console.WriteLine(solution(n));
            }
        }
    }
}
