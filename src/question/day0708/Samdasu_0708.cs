using System;
using System.Collections;

namespace samdasu_0708
{
    /*
    enum capital
    {
        Seoul = 1, Washington, Tokyo, Beijing    
    }
    */
    class Program
    {        
        static void Main(string[] args)
        {
            Console.Write("1.Korea\n2.USA\n3.Japan\n4.China\n");
            Console.Write("Number? ");
            int x = Convert.ToInt32(Console.ReadLine());            
            Console.Write("\n");

            switch (x)
            {
                case 1:
                    Console.WriteLine("Seoul");
                    break;
                case 2:
                    Console.WriteLine("Washington");
                    break;
                case 3:
                    Console.WriteLine("Tokyo");
                    break;
                case 4:
                    Console.WriteLine("Beijing");
                    break;
                default:
                    Console.WriteLine("none");
                    break;
            }            
        }
    }
}
