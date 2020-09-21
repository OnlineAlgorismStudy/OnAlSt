using System;

namespace samdasu_0916
{
    class Program
    {
        static void Main(string[] args)
        {
            int[,] a = new int[4, 4];

            for(int i = 0; i<3; i++)
            {
                for(int j = 0; j<3; j++)
                {

                    //var s = (Console.ReadLine()).Split(' ');
                    a[i, j] = Convert.ToInt32(Console.ReadLine());
                }
            }

            fn_sum(a);
        }
        static void fn_sum(int[,] vs)
        {
            for (int i = 0; i < 3; i++)
            {
                int stu_result = 0;
                for (int j = 0; j < 3; j++)
                {
                    stu_result += vs[i, j];
                }
                vs[i, 3] = stu_result;
            }

            int sub_result = 0;

            for (int i = 0; i < 3; i++)
            {
                int result = 0;
                for (int j = 0; j < 3; j++)
                {
                    result += vs[i, j];
                }
                vs[3, 3] = result;

                sub_result += result;
                vs[3, 3] = sub_result;
            }

            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    Console.WriteLine(vs[i, j] + " ");
                }
                Console.WriteLine(" ");
            }
        }

        
    }
}
