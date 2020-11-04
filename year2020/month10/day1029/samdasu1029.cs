using System;

namespace samdasu1029
{
    class samdasu1029
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();

            char[] c_input = new char[100];
            char temp;
            for(int i = input.Length -1; i>=0; i--)
            {
                for(int j = i; j<input.Length; j++)
                {
                    Console.Write(input[j]);
                }
                for(int k = 0; k<i; k++)
                {
                    Console.Write(input[k]);
                }

                Console.WriteLine(" ");
            }
        }
    }
}
