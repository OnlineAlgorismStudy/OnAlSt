using System;
using System.Collections;

namespace samdasu_0908
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = Convert.ToInt32(Console.ReadLine());
            int b = Convert.ToInt32(Console.ReadLine());

            fn_compare(a, b);
        }
        static void fn_compare(int a, int b)
        {
            if (a > b)
            {
                var quo = a / 2;
                var odd = b * 2;
                Console.WriteLine("{0},{1}", quo, odd);

            }
            else if (b > a)
            {
                var quo = b / 2;
                var odd = a * 2;

                Console.WriteLine("{0},{1}", quo, odd);
            }
            else if (a == b)
            {
                Console.WriteLine("서로 다른 두 수를 입력해 주세요.");
            }
        }
    }
}
