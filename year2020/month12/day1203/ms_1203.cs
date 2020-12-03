using System;

namespace algorithm_114
{
    class ms_1203
    {
        static long solution(int a, int b) 
        {
            long answer = 0;
            int A = a;
            int B = b;

            if(A > B) 
            {
                int temp = A;
                A = B;
                B = temp;
            }

            if(A != B)
            {
                for(int i = A; i <= B; i++)
                {
                    answer += i;
                }
            }
            else answer = A;

            return answer;
        }

        static void Main(string[] args)
        {
            int a = Convert.ToInt32(Console.ReadLine());
            int b = Convert.ToInt32(Console.ReadLine());

            if((-10000000 <= a && a <= 10000000) && (-10000000 <= b && b <= 10000000))
            {
                Console.WriteLine(solution(a, b));
            }
        }
    }
}
