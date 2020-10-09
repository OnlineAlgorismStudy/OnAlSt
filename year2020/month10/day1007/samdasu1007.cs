using System;

namespace samdasu_1007
{
    class samdasu1007
    {
        static int sum = 0;
        static void Main(string[] args)
        {
            int input = Convert.ToInt32(Console.ReadLine());

            fn_n(input);

            Console.WriteLine(fn_n(input));

        }
        static int fn_n(int a)
        {
            if (a==0)
            {
                return 0;
            }
            else
            {
                return (Convert.ToInt32(Math.Pow(a%10,2)) + fn_n(Convert.ToInt32(a / 10)));

                /*int b = a.ToString().Length;
                sum += b * b;
                return fn_n(sum);*/
            }
        }
    }
}
