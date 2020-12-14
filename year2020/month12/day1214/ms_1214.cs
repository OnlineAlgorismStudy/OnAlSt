using System;

namespace algorithm_121
{
    class ms_1214
    {
        static string solution(string s) 
        {
            string answer = "";
            int index = 0;
            
            for(int i = 0; i < s.Length; i++)
            {
                char temp = s[i];

                if(temp == ' ')
                {
                    index = 0;
                    answer += temp;
                    continue;
                }

                if(index%2 == 0)
                {
                    answer += Char.ToUpper(temp);
                }
                else
                {
                    answer += Char.ToLower(temp);
                }

                index++;
            }

            return answer;
        }

        static void Main(string[] args)
        {
            String s = Console.ReadLine();

            if(1 <= s.Length)
            {
                Console.WriteLine(solution(s));
            }
        }
    }
}
