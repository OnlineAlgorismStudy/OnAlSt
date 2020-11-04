using System;

namespace samdasu1103
{
    class samdasu1103
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            while (true)
            {

                int int_input = Convert.ToInt32(Console.ReadLine());

                int input_lengh = input.Length;

                if(int_input>= input_lengh)
                {
                    int_input = input_lengh - 1;
                }
                else
                {
                    int_input -= 1;
                }

                if(input.Length == 1)
                {
                    break;
                }
                input = input.Remove(int_input, 1);

                Console.WriteLine(input);


            }
            
        }
    }
}
