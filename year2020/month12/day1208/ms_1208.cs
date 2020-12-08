using System;

namespace algorithm_117
{
    class ms_1208
    {
        static string solution(int n)
        {
            string answer = "";

            for(int i = 0; i < n/2; i++)
            {
                answer += "수박";
            }

            if(answer.Length != n)
            {
                answer += "수";
            }

            return answer;
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(1 <= n && n <= 10000)
            {
                Console.WriteLine(solution(n));
            }
        }
    }
}
