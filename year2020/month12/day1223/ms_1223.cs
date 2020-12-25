using System;

namespace algorithm_128
{
    class ms_1223
    {
        static bool solution(int x)
        {
            int[] SED = new int[5] { 0, 0, 0, 0, 0 }; // Sum of Each Digit
            int sum = 0;
            int i = 0;
            int temp = x;

            while(temp > 0)
            {
                SED[i] = temp % 10;
                temp /= 10;
                i++;
            }

            foreach(var data in SED)
            {
                sum += data;
            }

            if(x % sum == 0)
            {
                return true;
            }
            else
            {
                return false;
            }  
        }

        static void Main(string[] args)
        {
            int x = Convert.ToInt32(Console.ReadLine());

            if(1 <= x && x <= 10000)
            {
                Console.WriteLine(solution(x));
            }
        }
    }
}
