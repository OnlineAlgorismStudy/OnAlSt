using System;

namespace algorithm_129
{
    class ms_1224
    {
        static string solution(string phone_number) 
        {
            int len = phone_number.Length;
            string answer = "";

            for(int i = 0; i < len - 4; i++) 
            {
                answer += "*";
            }

            answer += phone_number.Substring(len - 4, 4);

            return answer;
        }

        static void Main(string[] args)
        {
            string pn = Console.ReadLine();
            int len = pn.Length;

            if(4 <= len && len <= 20)
            {
                Console.WriteLine(solution(pn));
            }
        }
    }
}
