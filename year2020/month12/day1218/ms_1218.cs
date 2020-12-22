using System;

namespace algorithm_125
{
    class ms_1218
    {
        static string solution(int num) 
        {
            if(num%2 == 0)
                return "Even";
            else
                return "Odd";
        }

        static void Main(string[] args)
        {
            int num = Convert.ToInt32(Console.ReadLine());

            if(-2147483648 <= num && num <= 2147483647) 
            {
                Console.WriteLine(solution(num));
            }
        }
    }
}
