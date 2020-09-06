using System;
using System.Collections;

namespace samdasu_0904
{
    class samdasu_0904
    {
        static void Main(string[] args)
        {
            int[] n = new int[3];


            for (int i =0; i < 3; i++)
            {
                int input = Int32.Parse(Console.ReadLine().ToString());
                

                n[i] = input;
            }
            
            fn_maxNum(n);

            int fn_maxNum(int[] n)
            {
                int result = 0;

                for (int i = 0; i < 3; i++)
                {
                    if (result < n[i])
                    {
                        result = n[i];
                    }
                }
                return result;
            }


            Console.WriteLine(fn_maxNum(n));
        }

        
    }
}
