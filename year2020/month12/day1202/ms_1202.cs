using System;

namespace algorithm_113
{
    class ms_1202
    {
        static string solution(string s) 
        {
            string answer = "";
            int half = s.Length / 2;

            if(s.Length % 2 == 0)
                answer += s.Substring(half-1, 2);
            else
                answer += s.Substring(half, 1);

            return answer;
        }

        static void Main(string[] args)
        {
            string s = Console.ReadLine();

            if(1 <= s.Length && s.Length <= 100)
            {
                Console.WriteLine(solution(s));
            }
        }
    }
}
