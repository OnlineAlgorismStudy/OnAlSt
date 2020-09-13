using System;

namespace samdasu_0917
{
    class Program
    {
        static void Main(string[] args)
        {
            int input = Convert.ToInt32(Console.ReadLine());
            if(input <= 100)
            {
                fn_rectangle(input);
            }
            
        }
        static void fn_rectangle(int a)
        {
            for(int i = 1; i<=a; i++)
            {
                for(int j =1; j<=a; j++)
                {
                    Console.Write("{0} ", i * j);
                }
                Console.WriteLine(" ");
            }
        }
    }
}
