using System;

namespace _0918
{
    class samdasu_0918
    {
        static void Main(string[] args)
        {
            string []input = Console.ReadLine().Split(' ');

            int[] int_input = new int[2];

            for(int i = 0; i < 2; i++)
            {
                int_input[i] = Convert.ToInt32(input[i]);
            }

            input = Console.ReadLine().Split(' ');
            double[] double_input = new double[2];

            for(int i = 0; i<2; i++)
            {
                double_input[i] = Convert.ToDouble(input[i]);
            }

            fn_compare(int_input, double_input);
            
        }

        static void fn_compare(int[] a, double[] b)
        {
            if (Math.Abs(a[0]) > Math.Abs(a[1]))
            {
                Console.WriteLine(a[0]);
            }
            else
            {
                Console.WriteLine(a[1]);
            }

            if (Math.Abs(b[0]) < Math.Abs(b[1]))
            {
                Console.WriteLine(b[0]);
            }
            else
            {
                Console.WriteLine(b[1]);
            }
            
        }
    }
}
