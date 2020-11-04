using System;

namespace samdasu1102
{
    class samdasu1102
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string[] ar_input = input.Split(' ');

            string input1 = ar_input[0];
            string input2 = ar_input[1];
            if(input1.Length<101 && input2.Length < 101)
            {
                if (input1.Length > input2.Length)
                {
                    Console.WriteLine(input1.Length.ToString());
                }
                else if (input2.Length > input1.Length)
                {
                    Console.WriteLine(input2.Length.ToString());

                }
                else
                {

                }
            }
            
        }
    }
}
