using System;

namespace samdasu_0929
{
    class samdasu_0929
    {
        const int CNT = 7;
        static void Main(string[] args)
        {
            int[] input = new int[7];
            for(int i =0; i < 7; i++)
            {
                input[i] = Convert.ToInt32(Console.ReadLine());
            }

            fn_sort(input);
        }

        static void fn_sort(int[] a)
        {
            int n = 0;
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < a.Length - 1; j++)
                {
                    if (a[j] > a[j + 1])
                    {
                        n = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = n;
                    }
                }
            }

            for(int k = 0; k<a.Length; k++)
            {
                Console.Write(a[k] + " ");
            }
            
        }
    }
}
