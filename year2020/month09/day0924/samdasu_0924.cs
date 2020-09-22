using System;

namespace samdasu_0924
{
    class samdasu_0924
    {
        static void Main(string[] args)
        {
            int[] input = new int[5];
            for(int i = 0; i<5; i++)
            {
                input[i] = Convert.ToInt32(Console.ReadLine());
            }

            fn_AbsSum(input);
        }
        static void fn_AbsSum(int[] a)
        {

            int n = 0;
            for(int i = 0; i<a.Length; i++)
            {
                

                a[i] = Math.Abs(a[i]);

                n+= a[i];
            }

            Console.WriteLine(n);
        }
    }
}
