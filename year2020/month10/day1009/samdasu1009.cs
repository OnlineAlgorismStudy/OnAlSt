using System;

namespace samdasu1009
{
    class samdasu1009
    {
        static void Main(string[] args)
        {
            //int input = 0;
            int input = Convert.ToInt32(Console.ReadLine());

            fn_f(input);
        }
        static void fn_f(int a)
        {
            if(a <= 0)
            {
                
            }
            else
            {
                fn_f(a - 2);

                Console.Write(a + " ");
            }
        }
    }
}
