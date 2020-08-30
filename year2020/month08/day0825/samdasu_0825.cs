using System;

namespace samdasu_0825
{
    class samdasu_0825
    {
        static void Main(string[] args)
        {
            var n = Console.ReadLine();

            int[] num = new int[100];
            int sum = 0;

            for(int i = 0; i<num.Length; i++)
            {
                sum = Convert.ToInt32(Console.ReadLine());

                if(sum == 0) { break; }

                for (int j = 0; j <= 10; j++)
                {
                    if (j == sum / 10)
                    {
                        num[j]++;
                    }
                }
            }

            

            for (int i = 10; i >= 0; i--)
            {
                if (num[i] >= 0)
                {
                    if (num[i] == 0) { continue; }
                }
                if (i == 0)
                {
                    Console.WriteLine("{0} : {1} person", i + 1, num[i]);
                }
                else
                {
                    Console.WriteLine("{0} : {1} person", i * 10, num[i]);
                }
            }
        }
    }
}
