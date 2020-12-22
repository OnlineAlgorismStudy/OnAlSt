using System;

namespace algorithm_126
{
    class ms_1221
    {
        static int solution(int num) 
        {
            int answer = 0;
            long temp = num;

            while(1 < temp) 
            {
                if(answer >= 500) 
                {
                    answer = -1;
                    break;
                }

                if(temp%2 == 0)
                    temp /= 2;
                else
                    temp = temp*3 + 1;

                answer++;
            }

            return answer;
        }

        static void Main(string[] args)
        {
            int num = Convert.ToInt32(Console.ReadLine());

            if(0 < num && num < 8000000) {
                Console.WriteLine(solution(num));
            }
        }
    }
}
