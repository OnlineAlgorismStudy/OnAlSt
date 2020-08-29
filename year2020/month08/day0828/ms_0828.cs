using System;

namespace algorithm_45
{
    class ms_0828
    {
        static void Main(string[] args)
        {
            int[] row = new int[4] { 0, 0, 0, 0 };
            int[] column = new int[2] { 0, 0 };
            int total = 0;

            for(int i = 0; i < 4; i++) 
            {
                string[] input = Console.ReadLine().Split(' ');
                int j = 0;

                foreach(var value in input) {
                    row[i] += Convert.ToInt32(value);
                    column[j] += Convert.ToInt32(value);
                    total += Convert.ToInt32(value);
                    j++;
                }
            }

            Console.WriteLine($"{row[0]/2} {row[1]/2} {row[2]/2} {row[3]/2}");
            Console.WriteLine($"{column[0]/4} {column[1]/4}");
            Console.WriteLine(total/8);
        }
    }
}
