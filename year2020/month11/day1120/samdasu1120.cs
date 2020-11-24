using System;
using System.Collections;

namespace _1120
{
    class samdasu1120
    {
        static void Main(string[] args)
        {
            int intInput = Convert.ToInt32(Console.ReadLine());
            string[] temp = new string[intInput];
            for(int i = 0; i < intInput; i++)
            {
                string input = Console.ReadLine();

                temp[i] = input;
            }

            Array.Sort(temp);

            for(int j = 0; j<intInput; j++)
            {
                Console.WriteLine(temp[j]);
            }
        }
    }
}
