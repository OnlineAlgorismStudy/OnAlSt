using System;

namespace algorithm_119
{
    class ms_1210
    {
        static int solution(int[] a, int[] b)
        {
            int answer = 0;
        
            for(int i = 0; i < a.Length; i++)
            {
                answer += a[i] * b[i];
            }
        
            return answer;
        }

        static void Main(string[] args)
        {
            String[] Input = Console.ReadLine().Split(' ');
            int i = 0;
            int[] A = new int[Input.Length];

            foreach(var data in Input)
            {
                int temp = Convert.ToInt32(data);

                if(-1000 <= temp && temp <= 1000)
                {
                    A[i] = Convert.ToInt32(data);
                }

                i++;
            }

            Input = Console.ReadLine().Split(' ');
            i = 0;
            int[] B = new int[Input.Length];

            foreach(var data in Input)
            {
                int temp = Convert.ToInt32(data);

                if(-1000 <= temp && temp <= 1000)
                {
                    B[i] = Convert.ToInt32(data);
                }
                
                i++;
            }

            if((1 <= A.Length && A.Length <= 1000) && (1 <= B.Length && B.Length <= 1000))
            {
                if(A.Length == B.Length) 
                {
                    Console.WriteLine(solution(A, B));
                }
            }
        }
    }
}
