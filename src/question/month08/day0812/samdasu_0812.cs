using System;
using System.Collections;

namespace samdasu_0812
{
    class Program
    {
        static void Main(string[] args)
        {
            var n = (Console.ReadLine());
            var n_input = n.Split(' ');

            ArrayList one = new ArrayList();
            ArrayList two = new ArrayList();

            int add = 0;
            double even = 0.0;




            for (int i = 0; i < n_input.Length; i++)
            {
                if (i % 2 == 0)
                {
                    one.Add(n_input[i]);
                }
                else
                {
                    two.Add(n_input[i]);
                }
            }

            for (int j = 0; j < one.Count; j++)
            {
                add += Convert.ToInt32(one[j]);


            }

            for (int k = 0; k < two.Count; k++)
            {
                even += Convert.ToInt32(two[k]);
            }


            Console.WriteLine("sum : {0}", add);
            Console.WriteLine("even : {0}", even);
        }
    }
}
