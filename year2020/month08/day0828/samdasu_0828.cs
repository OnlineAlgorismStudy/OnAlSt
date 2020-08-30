using System;

namespace samdasu_0828
{
    class samdasu_0828
    {
        static void Main(string[] args)
        {
            int[,] arr = new int[4, 2];
            int num = 0;
            int sum = 0;

            for(int i =0; i<4; i++)
            {
                for(int j =0; j<2; j++)
                {
                    arr[i,j] = Convert.ToInt32(Console.ReadLine());
                    //sum += arr[i, j];
                }
            }

            for(int i = 0; i<4; i++)
            {
                for(int j = 0; j<2; j++)
                {
                    sum += arr[i, j];
                }
                Console.Write("{0} ", sum / 2);
                sum = 0;
            }
            Console.WriteLine(" ");

            for(int i = 0; i < 2; i++)
            {
                for(int j = 0; j<4; j++)
                {
                    sum += arr[j, i];
                }
                Console.Write("{0} ",sum / 4 );
                sum = 0;
            }
            Console.WriteLine(" ");

            for(int i = 0; i<4; i++)
            {
                for(int j =0; j<2; j++)
                {
                    sum += arr[i, j];
                }
            }
            Console.Write("{0} ", sum / 8);
        }
    }
}
