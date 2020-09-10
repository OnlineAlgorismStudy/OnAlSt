using System;

namespace algorithm_54
{
    class ms_0910
    {
        static void print() 
        {
            Console.WriteLine("@@@@@@@@@@");
        }

        static void Main(string[] args)
        {
            string[] data = { "first", "second", "third" };

            for(int i = 0; i < 3; i++) 
            {
                Console.WriteLine(data[i]);
                print();
            }
        }
    }
}
