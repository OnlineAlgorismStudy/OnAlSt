using System;

namespace samdasu_0923
{
    class Program
    {
        static void Main(string[] args)
        {
            double[] input = new double[2];

            for(int i = 0; i<2; i++)
            {
                input[i] = Convert.ToDouble(Console.ReadLine());
            }

            fn_root(input);
        }

        static void fn_root(double[] a)
        {
            int n = 0;

            var root1 =Math.Sqrt(a[0]);
            //Console.WriteLine(root1);
            var root2 = Math.Sqrt(a[1]);

            double bigger = (root1 > root2 ? root1 : root2);
            double smaller = (root1 > root2 ? root2 : root1);

            bigger = Math.Floor(bigger);
            smaller = Math.Ceiling(smaller);

            while (smaller <= bigger)
            {
                smaller++;
                n++;
            }

            Console.WriteLine(n);
        }
    }
}
