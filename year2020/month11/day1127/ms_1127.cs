using System;

namespace algorithm_110
{
    class ms_1127
    {
        static int[] SizeUp(int[] data)
        {
            int len = data.Length;
            int[] temp = new int[len + 1];
            int i = 0;

            for(i = 0; i < len; i++)
            {
                temp[i] = data[i];
            }

            temp[i] = -1;

            return temp;
        }

        static void Main(string[] args)
        {
            String[] input = Console.ReadLine().Split(' ');
            int len = input.Length;
            int[] numbers = new int[len];

            if(2 <= len && len <= 100)
            {
                for(int i = 0; i < input.Length; i++)
                {
                    int temp = Convert.ToInt32(input[i]);

                    if(0 <= temp && temp <= 100)
                    {
                        numbers[i] = temp;
                    }
                }
            }

            int[] answer = new int[1] { -1 };
            int count = 0;

            for(int i = 0; i < numbers.Length - 1; i++)
            {
                for(int j = i+1; j < numbers.Length; j++)
                {
                    int insertValue = numbers[i] + numbers[j];
                    bool isIn = false;

                    if(answer.Length == count)
                    {
                        answer = SizeUp(answer);
                    }

                    for(int h = 0; h < answer.Length; h++)
                    {
                        if(answer[h] == insertValue)
                        {
                            isIn = true;
                        }
                    }

                    if(!isIn)
                    {
                        answer[count] = insertValue;
                        count++;
                    }
                }
            }
            
            Array.Sort(answer);
            
            for(int i = 0; i < answer.Length; i++)
            {
                if(answer[i] != -1) // 가끔 사이즈를 늘려서 -1이 들어가있을 떄를 위한 작업 ㅠㅠ
                {
                    Console.Write(answer[i]);
            
                    if(i != count)
                    {
                        Console.Write(' ');
                    }
                }
                else continue;
            }
        }
    }
}
