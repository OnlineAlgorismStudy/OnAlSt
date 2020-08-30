using System;

namespace samdasu_0826
{
    class samdasu_0826
    {
        static void Main(string[] args)
        {
            int[,] arr = new int[4, 3];
            int[] sum = new int[4];
            int num = 0;

            for (int i = 0; i < 4; i++) 
            {
                Console.WriteLine("{0}class? ", i + 1);

                for(int j=0; j < 3; j++)
                {
                    num = Convert.ToInt32(Console.ReadLine());
                    arr[i,j] = num;
                }
                //Console.WriteLine(" ");
            }

            for(int i = 0; i<4; i++)
            {
                for(int j = 0; j<3; j++)
                {
                    sum[i] += arr[i, j];
                }
                Console.WriteLine("{0}class: {1}", i + 1, sum[i]);
            }
        }
    }
}
