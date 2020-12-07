using System;

namespace algorithm_116
{
    class ms_1207
    {
        static bool solution(string s)
        {
            bool isNumber = true;
            bool isInRange = true;
            int count = 0;

            foreach(char token in s)
            {
                int temp = token - '0';

                if(!(0 <= temp && temp <= 9))
                {
                    isNumber = false;
                }

                count++;
            }

            if(!(count == 4 || count == 6))
            {
                isInRange = false;
            }

            return isNumber && isInRange;
        } 

        static void Main(string[] args)
        {
            String s = Console.ReadLine();

            if(1 <= s.Length && s.Length <= 9)
            {
                Console.WriteLine(solution(s));
            }
        }
    }
}
