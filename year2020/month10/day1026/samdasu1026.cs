using System;

namespace samdasu_1016
{
    class samdasu1026
    {
        static void Main(string[] args)
        {
            

            while (true)
            {
                var input = Convert.ToChar(Console.ReadLine());

                if (input >=65 && input <= 90)
                {
                    Console.WriteLine(input);
                }
                else if(input >= 97 && input <= 122)
                {
                    Console.WriteLine(input);
                }
                else if(input >= 48 && input <= 57)
                {
                    Console.WriteLine(Convert.ToInt32(input));
                }
                else
                {
                    break;
                }
            }
        }
    }
}
