using System;

namespace samdasu_1012
{
    /*
     *  0<n<7
     *  1 2 x
     *  1 3 6 o
     */
    class sandasu1012
    {

        static int[] arr = new int[10];
        static int v = 0;

        static void Main(string[] args)
        {
            /*int input_1 = Convert.ToInt32(Console.ReadLine());
            int input_2 = Convert.ToInt32(Console.ReadLine());

*/

            string[] input = Console.ReadLine().Split(' ');
            int input_1 = Convert.ToInt32(input[0]);
            int input_2 = Convert.ToInt32(input[1]);





            fn_f(input_1, input_2);
        }

        static void fn_f(int a, int b)
        {
            

            for (int i = 1; i<7; ++i)
            {
                arr[v] = i;
                if(v == (a - 1))
                {
                    int temp = 0;
                    for(int j = 0; j<v+1; ++j)
                    {
                        temp+=arr[j];
                    }

                    if(temp == b)
                    {
                        for(int k = 0; k<a; ++k)
                        {
                            Console.Write(arr[k] + " ");
                        }
                        Console.WriteLine(" ");
                    }
                }
                else
                {
                    v++;
                    fn_f(a, b);
                    v--;
                }
            }
            
        }
    }
}
