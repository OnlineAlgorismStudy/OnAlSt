using System;
using System.Collections;
using System.Diagnostics;

namespace Samdasu_0710
{
    class Samdasu_0710
    {
        
        static void Main(string[] args)
        {
            
            int n = Convert.ToInt32(Console.ReadLine());
            int sum = 0;

            if (n <= 10)
            {
                string subSum = Console.ReadLine();
                string[] sub = subSum.Split(' ');
                

                for(int i = 0; i<sub.Length; i++)
                {
                    sum += Convert.ToInt32(sub[i]);
                }
            }
            else { return; }

            double avg = (double)sum / (double)n;

            Console.WriteLine("avg : {0:F1}", avg);
            if(avg >= 80)
            {
                Console.WriteLine("pass");
            }
            else
            {
                Console.WriteLine("fail");
            }

        }
    }
}
