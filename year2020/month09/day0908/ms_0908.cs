using System;

namespace algorithm_52
{
    class ms_0908
    {
        static void changeValue(ref int mult, ref int div) 
        {
                mult *= 2;
                div /= 2;
        }

        static void Main(string[] args)
        {
            // x 가 작은 수, y 가 큰 수를 저장
            string[] input = Console.ReadLine().Split(' ');
            int x = Convert.ToInt32(input[0]);
            int y = Convert.ToInt32(input[1]);

            if(x > y) 
            {
                int temp = x;
                x = y;
                y = temp;
            }

            changeValue(ref x, ref y);
            Console.WriteLine($"{x} {y}");
        }
    }
}
