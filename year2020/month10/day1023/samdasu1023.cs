using System;

namespace samdasu1023
{
    class samdasu1023
    {
        static void Main(string[] args)
        {
            string input1 = Console.ReadLine();
            string input2 = Console.ReadLine();

            if(input1.Length<21 && input2.Length < 21)
            {
                Console.WriteLine(input1.Length + input2.Length);
            }
        }
    }
}
