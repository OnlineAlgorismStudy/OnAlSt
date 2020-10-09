using System;

namespace samdasu1008
{
    class samdasu1008
    {
        static void Main(string[] args)
        {
            int input = Convert.ToInt32(Console.ReadLine());

            fn_n(input);
        }

        static void fn_n(int a)
        {
            if (a == 0)
            {
                return;
            }
            else
            {
                fn_n(a / 2);

                Console.Write(a + " ");
            }
        }
    }
}
