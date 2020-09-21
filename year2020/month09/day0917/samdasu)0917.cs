using System;

namespace samdasu_0917
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] n = null;
            int input = 0;

            input = Convert.ToInt32(Console.ReadLine());

            if (input < 11)
            {
                n = new int[input];
            }

            for (int i = 0; i<n.Length; i++)
            {
                n[i] = Convert.ToInt32(Console.ReadLine());
            }

            fn_result(n);
        }

        static void fn_result(int[] vs) 
        {
            Array.Sort(vs);

            for(int i =vs.Length-1; i>=0; i--)
            {
                Console.WriteLine(vs[i] + " ");
            }
        }
    }
}
