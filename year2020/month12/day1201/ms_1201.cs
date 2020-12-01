using System;

namespace algorithm_112
{
    class ms_1201
    {
        static int solution(int n)
        {
            // 기존 데이터 유지를 위한 temp
            int temp = n;
            int answer = 0;
            int max = 1;
            int count = 1;
            
            while(true)
            {
                max = Convert.ToInt32(Math.Pow(3, count));
                
                if(max > temp)
                    break;

                count++;
            }
            
            int[] data = new int[count];

            for(int i = 0; i < count; i++)
            {
                int minus = Convert.ToInt32(Math.Pow(3, count - 1 - i));

                for(int j = 0; j < 2; j++)
                {
                    if((temp - minus) >= 0)
                    {
                        temp -= minus;
                        data[i]++;
                    }
                }
            }

            // 뒤집는 건 생략
            for(int i = 0; i < count; i++)
            {
                answer = answer + data[i] * Convert.ToInt32(Math.Pow(3, i));
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
