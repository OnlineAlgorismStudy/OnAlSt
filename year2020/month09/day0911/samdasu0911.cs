using System;

namespace samdasu_0911
{
    class samdasu0911
    {
        static void Main(string[] args)
        {
            int input = Convert.ToInt32(Console.ReadLine());
            if (input < 1001)
            {
                fn_Isometric(input);
            }
            else { Console.WriteLine("1000이하의 자연수를 입력해 주세요"); }

        }
        static void fn_Isometric(int a)
        {
            int n = (a * (1 + a)) / 2;
            Console.WriteLine(n);
        }
    }
}
