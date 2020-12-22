using System;

namespace algorithm_123
{
    class ms_1216
    {
        static int[] solution(long n) 
        {
            int[] answer = new int[0];
            int i = 0;

            while(n > 0) 
            {
                if(answer.Length == i) 
                {
                    int[] temp = new int[i + 1];

                    for(int j = 0; j < answer.Length; j++)
                        temp[j] = answer[j];
                    
                    answer = temp;
                    continue;
                }

                answer[i] = Convert.ToInt32(n%10);
                n /= 10;
                i++;
            }

            return answer;
        }

        static void Main(string[] args)
        {
            long n = Convert.ToInt32(Console.ReadLine());
            
            if(1 <= n && n <= 10000000000) 
            {
                int[] answer = solution(n);
                
                for(int i = 0; i < answer.Length; i++) 
                {
                    Console.Write(answer[i]);

                    if(i != answer.Length)
                    {
                        Console.Write(' ');
                    }
                }
            }
        }
    }
}
