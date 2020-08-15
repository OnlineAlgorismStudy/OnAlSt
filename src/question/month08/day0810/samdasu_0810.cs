using System;
using System.Collections;
using System.ComponentModel.Design;
using System.Diagnostics;

namespace samdasu_0810
{
    class Program
    {
        static void Main(string[] args)
        {
            var n = (Console.ReadLine());
            var n_input = n.Split(' ');

            ArrayList one = new ArrayList();
            ArrayList two = new ArrayList();

            int sum =0;
            double avg = 0.0;

            if(Convert.ToInt32(n_input) < 11)
            {

                for (int i = 0; i < n_input.Length; i++)
                {
                    if (i % 2 != 0)
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
                    sum += Convert.ToInt32(one[j]);


                }

                for (int k = 0; k < two.Count; k++)
                {
                    avg += Convert.ToInt32(two[k]);
                }


                Console.WriteLine("sum : {0}", sum);
                Console.WriteLine("avg : {0:0.0}", avg / 5.0);
            }
            else
            {
                Console.WriteLine("10개의 정수만 입력해 주세요");
            }
        }
    }
}
