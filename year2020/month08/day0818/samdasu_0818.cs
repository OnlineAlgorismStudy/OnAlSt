using System;
using System.Collections;

namespace samdasu_0818
{
    class Program
    {
        static void Main(string[] args)
        {            
            var input_score = Console.ReadLine();
            var n_score = input_score.Split(' ');

            ArrayList ar = new ArrayList();
                                    
            for(int i = 0; i<n_score.Length; i++)
            {
                ar.Add(n_score[i]);
            }

            ar.RemoveAt(0);
            ar.Sort();
            ar.Reverse();

            for (int i = 0; i < ar.Count; i++)
            {
                Console.WriteLine(ar[i]);
            }
        }
    }
}
