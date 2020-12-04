using System;

namespace algorithm_115
{
    class ms_1204
    {
        static string solution(string s) 
        {
            string answer = "";
            char[] temp = new char[s.Length];

            for(int i = 0; i < s.Length; i++)
            {
                temp[i] = s[i];
            }

            Array.Sort(temp);
            Array.Reverse(temp);

            for(int i = 0; i < s.Length; i++) 
            {
                answer += temp[i];
            }

            return answer;
        }

        static void Main(string[] args)
        {
            string str = Console.ReadLine();

            if(1 <= str.Length)
            {
                Console.WriteLine(solution(str));
            }
        }
    }
}
