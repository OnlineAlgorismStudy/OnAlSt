using System;

namespace algorithm_127
{
    class ms_1222
    {
        static double solution(int[] arr) 
        {
            double answer = 0;

            foreach(var value in arr)
            {
                answer += value;
            }

            answer /= arr.Length;

            return answer;
        }

        static void Main(string[] args)
        {
            String[] input = Console.ReadLine().Split(' ');
            int[] arr = new int[0];
            int len = 0;

            for(int i = 0; i < input.Length; i++)
            {
                int data = Convert.ToInt32(input[i]);

                if(-10000 <= data && data <= 10000)
                {
                    if(arr.Length == len)
                    {
                        int[] temp = new int[len + 1];

                        for(int j = 0; j < len; j++)
                            temp[j] = arr[j];

                        arr = temp;
                    }

                    arr[len] = data;
                    len++;
                }
            }

            if(1 <= len && len <= 100)
            {
                Console.WriteLine(solution(arr));
            }
        }
    }
}
