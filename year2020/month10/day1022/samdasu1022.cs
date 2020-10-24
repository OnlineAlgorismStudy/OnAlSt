using System;

namespace samdasu_1022
{
    class samdasu1022
    {
        static void Main(string[] args)
        {
            string str_input = Console.ReadLine();
            int int_input = Convert.ToInt32(Console.ReadLine());


            for(int i = 0; i<int_input; i++)
            {
                Console.Write(str_input[str_input.Length - i - 1]);
            }
            
        }
    }
}
