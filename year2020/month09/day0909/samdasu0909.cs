using System;

namespace samdasu_0909
{
    class samdasu0909
    {
        static void Main(string[] args)
        {
            int a = Convert.ToInt32(Console.ReadLine());
            int b = Convert.ToInt32(Console.ReadLine());

            fn_gugu(a, b);

        }
        static void fn_gugu(int a, int b)
        {
            if (a < b)
            {
                for(int i = a; i<=b; i++)
                {
                    Console.WriteLine("== {0}dan ==", i);
                    for(int j = 1; j<=9; j++)
                    {
                        Console.WriteLine("{0} * {1} = {2}", i, j, i * j);
                    }
                    Console.WriteLine(" ");
                }
            }
            else if (a > b)
            {
                for(int i = b; i<=a; i++)
                {
                    Console.WriteLine("=="+i+"dan==");
                    for (int j = 1; j <= 9; j++)
                    {
                        Console.WriteLine("{0}* {1} = {2}", i, j, i * j);
                    }
                    Console.WriteLine(" ");

                }
            }
        }
    }
}
