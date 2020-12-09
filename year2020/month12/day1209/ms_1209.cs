using System;

namespace algorithm_118
{
    class ms_1209
    {
        static int solution(string s)
        {
            int answer = 0;
            int start = 0;
            int isPlus = 1;

            switch(s[start])
            {
                case '-':
                    start = 1;
                    isPlus = -1;
                    break;
                case '+':
                    start = 1;
                    break;
            }

            answer = answer + isPlus * Int32.Parse(s.Substring(start));

            return answer;
        }

        static void Main(string[] args)
        {
            string s = Console.ReadLine();

            if(1 <= s.Length && s.Length <= 5)
            {
                Console.WriteLine(solution(s));
            }
        }
    }
}
