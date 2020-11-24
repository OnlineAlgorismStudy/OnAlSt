using System;

namespace algorithm_108
{
    class ms_1125
    {
        static void Main(string[] args)
        {
            String[] input = Console.ReadLine().Split(' ');

            if(input[0].Length <= 100 && input[1].Length <= 100)
            {
                int a = Convert.ToInt32(Convert.ToDouble(input[0]));
                int b = 0;
                int index = 0;

                for(int i = 0; i < input[1].Length; i++)
                {
                    int temp = Convert.ToInt32(input[1][i]) - 48;

                    if(0 <= temp && temp <= 9)
                        index++;
                    else break;
                }

                b = Convert.ToInt32(input[1][..index]);

                Console.WriteLine(a * b);
            }
        }
    }
}
