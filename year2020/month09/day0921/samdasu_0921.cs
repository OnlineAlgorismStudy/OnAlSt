using System;

namespace samdasu_0921
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] input = new int[10];

            for(int i = 0; i<10; i++)
            {
                input[i] = Convert.ToInt32(Console.ReadLine());
            }

            fn_bubble(input);
        }

        static void fn_bubble(int[] a)
        {
            int temp = 0;

            for(int i = 0; i<9; i++)
            {
                for(int j = 0; j<9; j++)
                {
                    if (a[j] < a[j + 1])
                    {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }

                for(int k = 0; k<10; k++)
                {
                    Console.Write(a[k] + " ");
                }

                Console.WriteLine(" ");
            }
        }
    }
}
