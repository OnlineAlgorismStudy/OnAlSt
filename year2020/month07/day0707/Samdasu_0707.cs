using System;

namespace samasu_0707
{
    enum animal
    {
        개,
        고양이,
        병아리
    }
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Number? ");
            int qu = Convert.ToInt32(Console.ReadLine());

            if(qu == 1)
            {
                Console.WriteLine("dog");
            }
            else if(qu == 2)
            {
                Console.WriteLine("cat");
            }
            else if(qu == 3)
            {
                Console.WriteLine("chick");
            }
            else
            {
                Console.WriteLine("I don't know");
            }

        }
    }
}
