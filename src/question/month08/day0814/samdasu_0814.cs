using System;
using System.Collections;

namespace samdasu_0814
{
    class samdasu_0814
    {
        static void Main(string[] args)
        {
            var n = (Console.ReadLine());
            var n_input = n.Split(' ');

            double sum = 0.0;
            ArrayList five = new ArrayList();
            ArrayList allSum = new ArrayList();

            for (int i = 0; i < n_input.Length; i++)
            {
                allSum.Add(n_input[i]);
                if (Convert.ToInt32(allSum[i]) % 5 == 0 && Convert.ToInt32(allSum[i]) !='0')
                {
                    five.Add(allSum[i]);
                                        
                    sum += Convert.ToInt32(allSum[i]);

                }
                else { continue; }

                if (n_input[i] == "0")
                {
                    five.RemoveAt(Convert.ToInt32(n_input[n_input.Length - 1]));
                    Console.WriteLine("Multiples of 5 : {0}", five.Count);
                    Console.WriteLine("sum : {0}", sum);
                    Console.WriteLine("avg : {0:0.0}", Convert.ToDouble(sum / (five.Count)));
                }
                else
                {
                    continue;
                }
            }            
        }
    }
}
