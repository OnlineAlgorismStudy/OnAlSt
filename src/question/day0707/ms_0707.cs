using System;

namespace algorithm_07
{
    class ms_0707
    {
        static void Main(string[] args)
        {
            string[] animal = { "dog", "cat", "chick" };

            Console.Write("Number? ");
            var num = Convert.ToInt32(Console.ReadLine());

            if(1 <= num && num <= 3)
                Console.WriteLine(animal[num-1]);
            else
                Console.WriteLine("I don't know");
        }
    }
}
