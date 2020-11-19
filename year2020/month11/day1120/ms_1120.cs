using System;

namespace algorithm_105
{
    class ms_1120
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            String[] data;

            if(n <= 10)
            {
                data = new string[n];

                for(int i = 0; i < n; i++)
                {
                    String temp = Console.ReadLine();

                    if(temp.Length <= 100)
                    {
                        data[i] = temp;
                    }
                    else i--;
                }

                Array.Sort(data);

                for(int i = 0; i < n; i++)
                {
                    Console.WriteLine(data[i]);
                }
            }
        }
    }
}
