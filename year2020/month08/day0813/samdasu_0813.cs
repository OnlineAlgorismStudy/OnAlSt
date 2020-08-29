using System;
using System.Collections;
using System.Runtime.CompilerServices;

namespace samdasu_0813
{
    class Program
    {
        static void Main(string[] args)
        {
            var n = (Console.ReadLine());
            var n_input = n.Split(' ');

            ArrayList sum = new ArrayList();

            for (int i = 0; i < n_input.Length; i++)
            {
                sum.Add(n_input[i]);
                if(n_input[i] == "999")
                {
                    sum.Remove("999"); 
                    sum.Sort();                    
                    sum.Reverse();
                    Console.WriteLine("max : {0}", (sum[0]));
                    sum.Sort();
                    Console.WriteLine("min : {0}", sum[0]);

                    Environment.Exit(0);
                }
                else
                {
                    continue;
                }
                
            }            
        }
    }
}
