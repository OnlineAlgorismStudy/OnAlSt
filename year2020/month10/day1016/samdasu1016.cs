using System;

namespace samdasu1016
{

    
    class samdasu1016
    {
        static int b = 0;
        static int[] six = new int[101];

        static void Main(string[] args)
        {
            
            b = Convert.ToInt32(Console.ReadLine());
            //int input2 = Convert.ToInt32(Console.ReadLine());

            six[0] = 1;

            fn_n(1);
        }

        public static void fn_n(int a)
        {
            if (a > b)
            {
                for (int i = 1; i <= b; i++)
                {
                    Console.Write(six[i] + " ");
                }
                Console.WriteLine(" ");
                return;
            }

            for (int i = six[a - 1]; i < 7; i++)
            {
                six[a] = i;
                fn_n(a + 1);
            }


            /*if (b == 0)
            {
                for (int i = n; i < 7; i--)
                {
                    Console.Write(six[i] + " ");
                }
                Console.WriteLine(" ");
                return;
            }
            else if (b == n)
            {
                for(int i = 1; i<7; i++)
                {
                    six[b] = i;
                    fn_n(b - 1);
                }
            }
            else
            {
                for (int i = six[b + 1]; i < 7; i++)
                {
                    six[b] = i;
                    fn_n(b - 1);
                }
            }*/
        }
    }
}
