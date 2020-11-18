using System;

namespace _1113
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string input2 = input.Substring(0, input.IndexOf('.'));
            int a = Convert.ToInt32(input2) * 2;

            string input3 = input.Substring(0, input.IndexOf('*'));
            double b = Convert.ToDouble(input3);
            Console.WriteLine(a+"\n"+Math.Round(b,2)+0);


        }
    }
}
